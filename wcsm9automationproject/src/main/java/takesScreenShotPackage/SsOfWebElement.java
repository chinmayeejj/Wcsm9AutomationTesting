package takesScreenShotPackage;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SsOfWebElement 
{
	public static void main(String[] args) throws InterruptedException,  IOException 
	{
		//take ss of coins in coins sections of blue stones(coins by designs cj)
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gad_source=1&gclid=CjwKCAjws9ipBhB1EiwAccEi1NW0nRb87KUVODpkvtN39JJYfP1FSRFNIYzpm3piDFGto0IAJ7qn5xoCSY8QAvD_BwE");
		
		driver.findElement(By.id("denyBtn")).click();
		
		//identify coins coins and perform mouse hover
		WebElement coin = driver.findElement(By.xpath("//a[.='Coins ']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(coin).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Coins by Design']")).click();
		
		//store WE in reference variable for performing action
		WebElement img = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
		//to take SS of webelement 
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/coinImg.jpg");
		
		Files.copy(src, dest);
	}
	

}
