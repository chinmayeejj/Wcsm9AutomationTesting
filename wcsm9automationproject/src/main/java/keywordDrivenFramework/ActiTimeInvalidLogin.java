package keywordDrivenFramework;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest
{
	public static void main(String[] args) throws EncryptedDocumentException, Exception 
	{
	
		BaseTest base = new BaseTest();
		//to read data from excel file
		Flib flib = new Flib();
		
		base.openBrowser();
		
		
		
		int rowCount = flib.getRowCount(EXCEL_PATH, INVALIDCREDS_SHEET);
		for(int i=1;i<=rowCount;i++)
		{
			String usn = flib.readExcelData(EXCEL_PATH, INVALIDCREDS_SHEET, i, 0);
			String pwd = flib.readExcelData(EXCEL_PATH, INVALIDCREDS_SHEET, i, 1);

		
			//login to actitime
			driver.findElement(By.name("username")).sendKeys(usn);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}
		
		base.closeBrowser();

		
	}

}
