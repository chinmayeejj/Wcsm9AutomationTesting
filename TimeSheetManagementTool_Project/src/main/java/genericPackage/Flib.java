package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	//to read the data from excel
			public String readExcelData(String excelPath, String sheetName, int rowNo,int cellNo) throws EncryptedDocumentException, Exception
			{
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet(sheetName);
				Row row = sheet.getRow(rowNo);
				Cell cell = row.getCell(cellNo);
				
				String data=null;
				
				if(cell.getCellType()==cell.getCellType().STRING)
				{
					data=cell.getStringCellValue();
				}
				
				else if(cell.getCellType()==cell.getCellType().NUMERIC)
				{
					double numericValue = cell.getNumericCellValue();
				    data = String.valueOf(numericValue);
				}
				
				//String data = cell.getStringCellValue();
				return data;
			}
			
			//to write data to excel file
			public void writeExcelData(String excelPath, String sheetName, int rowNo,int cellNo,String data) throws EncryptedDocumentException, IOException
			{
					FileInputStream fis = new FileInputStream(excelPath);
					Workbook wb = WorkbookFactory.create(fis);
					Sheet sheet = wb.getSheet(sheetName); 
					Row row = sheet.createRow(rowNo);
					//to create column
					Cell cell = row.createCell(cellNo);
					//to set the cell value
					cell.setCellValue(data);
					//create obj of FileOutputSream 
					FileOutputStream fos = new FileOutputStream(excelPath);
					wb.write(fos);
					

			}
			
			//to get the last row of the sheet
			public int getRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
			{
					FileInputStream fis=new FileInputStream(excelPath);
					Workbook wb = WorkbookFactory.create(fis);
					Sheet sheet = wb.getSheet(sheetName);
					int rowNo = sheet.getLastRowNum();
					return rowNo;
			}
				
			//to read data from property file
			public String readDataFromProperty(String propertyPath, String key ) throws IOException
			{
				FileInputStream fis=new FileInputStream(propertyPath);
				
				Properties prop =new Properties();
				
				prop.load(fis);
				
				String data= prop.getProperty(key);
				
				return data;
				
			}



}
