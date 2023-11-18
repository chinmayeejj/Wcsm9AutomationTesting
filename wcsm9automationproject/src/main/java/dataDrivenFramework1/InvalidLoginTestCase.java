package dataDrivenFramework1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch ActiTime
		driver.get("http://laptop-89brlgsi/login.do");
		
		Flib flib = new Flib();
		
		int rowCount = flib.getRowCount("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds");
		for(int i=1;i<=rowCount;i++)
		{
			String usn = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds", i, 0);
			String pwd = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds", i, 1);

		
			//login to actitime
			driver.findElement(By.name("username")).sendKeys(usn);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		
		}
	}
}
