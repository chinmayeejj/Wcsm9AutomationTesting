package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//to close popup
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("--disable-notifications");
	    
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		//from
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' HADAPSAR - HDP ']")).click();
		
		//to
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' C SHIVAJI MAH T - CSMT ']")).click();
		Thread.sleep(2000);
		
		//Date
		driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='29']")).click();
		
		//Class
		driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
		Thread.sleep(2000);
		
		//class
		driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='LADIES']")).click();
		Thread.sleep(2000);
		
		//Search
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(4000);
		
		driver.quit();		
		
		
		
		
	
		
		
		
	    
		
	}

}
