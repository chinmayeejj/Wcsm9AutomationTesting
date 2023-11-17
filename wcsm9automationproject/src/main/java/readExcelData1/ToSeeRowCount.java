package readExcelData1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToSeeRowCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		//To load the file(make the file ready to read)
		Workbook wb = WorkbookFactory.create(fis);
		//to get into particular sheet
		Sheet sheet = wb.getSheet("IPL");
		
		//to get how many rows are in the sheet
		int rowCount = sheet.getLastRowNum();
		
		System.out.println(rowCount);
		

	}

}
