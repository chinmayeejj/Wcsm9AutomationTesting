package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import keywordDrivenFramework.BaseTest;
import keywordDrivenFramework.Flib;

public class ActiTimeKeyword2 extends BaseTest 
{
	/*public static void main(String[] args) throws IOException, InterruptedException 
	{
		Flib flib = new Flib();
		BaseTest base = new BaseTest();
		
		String firefox = flib.readData("./src/main/resources/config.properties", "browser2");
		base.openBrowser();
		
		driver.get(flib.readData("./src/main/resources/config.properties", "url"));
		
		//login to actitime
		
		String usn = flib.readData("./src/main/resources/config.properties", "username");
		String pwd = flib.readData("./src/main/resources/config.properties", "password");
		ChromeDriver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();


		
	}
	*/

}
