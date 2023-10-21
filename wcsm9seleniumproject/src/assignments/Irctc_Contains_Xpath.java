package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc_Contains_Xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeOptions co=new ChromeOptions();
		    co.addArguments("--disable-notifications");
		    
			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.get("https://www.irctc.co.in/nget/train-search");
			Thread.sleep(2000);
			
			//from
			driver.findElement(By.xpath("//input[contains(@class ,'ng-tns-c57-8')]")).sendKeys("Pune");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(), ' HADAPSAR - HDP ')]")).click();
			
			//to
			driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9')]")).sendKeys("Mumbai");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),' C SHIVAJI MAH T - CSMT ')]")).click();
			Thread.sleep(2000);
			
			//Date
			driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'29')]")).click();
			
			//Class
			driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'AC First Class (1A) ')]")).click();
			Thread.sleep(2000);
			
			//class
			driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-12 ')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'LADIES')]")).click();
			Thread.sleep(2000);
			
			//Search
			driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
			Thread.sleep(4000);
			
			driver.quit();		
		
	}

}
