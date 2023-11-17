package readExcelData1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		
		//to create the new row 
		Row row = sheet.createRow(13);
		//to create column
		Cell cell = row.createCell(0);
		//to set the cell value
		cell.setCellValue("pk");
		
		//create obj of FileOutputSream 
		FileOutputStream fos = new FileOutputStream("./src/main/resources/TestData.xlsx");
		wb.write(fos);// all the data which is stored in  wb gets written in write ()
		
		
	}

}
