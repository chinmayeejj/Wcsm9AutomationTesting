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

		
		//Login to actitime
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
