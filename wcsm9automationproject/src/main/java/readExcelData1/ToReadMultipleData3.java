package readExcelData1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleData3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method 
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		//To load the file(make the file ready to read)
		Workbook wb = WorkbookFactory.create(fis);
		//to get into particular sheet
		Sheet sheet = wb.getSheet("IPL");
		
		//to get how many rows are in the sheet
		int rowCount = sheet.getLastRowNum();
		
		for(int i =1 ;i<=rowCount;i++)
		{
				//to return row
			Row row = sheet.getRow(i);
		
			//to specify cell value
			Cell cell = row.getCell(1);
		
			//to get the value inside that particular cell
			String data = cell.getStringCellValue();
		
			System.out.println(data);
		}
		

	}

}
