package readExcelData;

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
			
			for(int i=1;i<=7;i++)
			{	
			//read  captain data fromTestData.xlsx
				FileInputStream fis = new FileInputStream("./src/main/resources/ActiTimeTestData.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet("invalidcreads");
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(1);
			
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}}
		
