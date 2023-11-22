package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keywordDrivenFramework.Flib;

public class ActiTimeKeyword 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Flib flib = new Flib();
		
		driver.get(flib.readDataFromProperty("./src/main/resources/config.properties", "url"));
		
		driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
