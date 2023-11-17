package dataDrivenFramework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch Actitime
		driver.get("http://laptop-89brlgsi/login.do");
		
		Flib flib = new Flib();
		
		String usn = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "validcreds", 1, 0);
		String pwd = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "validcreds", 1, 1);

		
		/*
		//to read valid username
		FileInputStream fis = new FileInputStream("./src/main/resources/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		//to read  valid password
		FileInputStream fis1 = new FileInputStream("./src/main/resources/ActiTimeTestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis);
		Sheet sheet1 = wb1.getSheet("validcreds");
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		String pwd = cell1.getStringCellValue();
		*/
		
		//Login to actitime
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
