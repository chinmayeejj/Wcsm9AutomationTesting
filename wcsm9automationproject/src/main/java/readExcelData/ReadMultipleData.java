package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData 
{
	
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			
//			for(int i=1;i<=10;i++)
//			{	
//				//read  captain data fromTestData.xlsx
//				FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
//				Workbook wb = WorkbookFactory.create(fis);
//				Sheet sheet = wb.getSheet("IPL");
//				Row row = sheet.getRow(i);
//				Cell cell = row.getCell(1);
//			
//				String data = cell.getStringCellValue();
//				System.out.println(data);
//			}
//			
			System.out.println();
			
			for(int i=1;i<=10;i++)
			{	
					//read  teams data fromTestData.xlsx
					FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
					Workbook wb = WorkbookFactory.create(fis);
					Sheet sheet = wb.getSheet("IPL");
					Row row = sheet.getRow(i);
					Cell cell = row.getCell(0);
			
					String data = cell.getStringCellValue();
					//System.out.println(data);
				
					//read  Captains data fromTestData.xlsx
					FileInputStream fis1 = new FileInputStream("./src/main/resources/TestData.xlsx");
					Workbook wb1 = WorkbookFactory.create(fis1);
					Sheet sheet1 = wb1.getSheet("IPL");
					Row row1 = sheet1.getRow(i);
					Cell cell1 = row1.getCell(1);
			
					String data1 = cell1.getStringCellValue();
					
					
					System.out.println(data + "  "+data1);
				
				
			}
		
		}

}
