package practice;

import java.io.IOException;

import org.openqa.selenium.By;

import keywordDrivenFramework.Flib2;

public class ActiTimeKeyword2 extends Base
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Flib2 flib2 = new Flib2();
		Base base = new Base();
		
		String firefox = flib2.readData("./src/main/resources/config.properties", "browser2");
		base.openBrowser(firefox);
		
		driver.get(flib2.readData("./src/main/resources/config.properties", "url"));
		
		//login to actitime
		
		String usn = flib2.readData("./src/main/resources/config.properties", "username");
		String pwd = flib2.readData("./src/main/resources/config.properties", "password");
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();


		
	}
	

}
