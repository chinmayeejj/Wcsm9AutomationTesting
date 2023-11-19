package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrlMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-89brlgsi/login.do");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);


		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
