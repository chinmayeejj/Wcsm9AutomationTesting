package readExcelData1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		//To load the file(make the file ready to read)
		Workbook wb = WorkbookFactory.create(fis);
		//to get into particular sheet
		Sheet sheet = wb.getSheet("IPL");
		
		//to get how many rows are in the sheet
		int rowCount = sheet.getLastRowNum();
		
		for(int i =1 ;i<=rowCount;i++)
		{
			//create obj of fileinputstream class(. dot represents current project / represent go inside this project)
			//to provide the file path
			FileInputStream fis1 = new FileInputStream("./src/main/resources/TestData.xlsx");
		
			//to load the excel file
			//make the file ready to read
			Workbook wb1 = WorkbookFactory.create(fis1);  //create method which accepts file
		
		
			//read methods
			Sheet sheet1 = wb1.getSheet("IPL");
		
			//to return row
			Row row1 = sheet1.getRow(i);
		
			//to specify cell value
			Cell cell1 = row1.getCell(0);
		
			//to get the value inside that particular cell
			String data = cell1.getStringCellValue();
		
			System.out.println(data);
		}
		
	}

}
