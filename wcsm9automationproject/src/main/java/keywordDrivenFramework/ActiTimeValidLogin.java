package keywordDrivenFramework;

//import static keywordDrivenFramework.BaseTest.driver;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Flib flib = new Flib();
		BaseTest base = new BaseTest();
		
		
		base.openBrowser();
				
		//login to actitime
		
		String usn = flib.readDataFromProperty(PROP_PATH, "username");
		String pwd = flib.readDataFromProperty(PROP_PATH, "password");
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		base.closeBrowser();
	}

}
