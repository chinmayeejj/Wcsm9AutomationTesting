package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.createRow(11);
		Cell cell = row.createCell(0);
		cell.setCellValue("Pune");
		//for creating location column
		Row row1 = sheet.getRow(0);
		Cell cell1 = row1.createCell(2);
		cell1.setCellValue("Location");
		
		FileOutputStream fos = new FileOutputStream("./src/main/resources/TestData.xlsx");
		wb.write(fos);
		
		
		
	}

}
