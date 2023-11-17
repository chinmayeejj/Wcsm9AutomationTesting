package readExcelData1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create obj of fileinputstream class(. dot represents current project / represent go inside this project)
		//to provide the file path
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		
		//to load the excel file
		//make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);  //create method which accepts file
		
		
		//read methods
		Sheet sheet = wb.getSheet("IPL");
		
		//to return row
		Row row = sheet.getRow(1);
		
		//to specify cell value
		Cell cell = row.getCell(0);
		
		//to get the value inside that particular cell
		String data = cell.getStringCellValue();
		
		System.out.println(data);
	}

}
