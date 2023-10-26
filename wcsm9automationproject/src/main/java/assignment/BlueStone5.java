package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone5
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gad_source=1&gclid=CjwKCAjws9ipBhB1EiwAccEi1NW0nRb87KUVODpkvtN39JJYfP1FSRFNIYzpm3piDFGto0IAJ7qn5xoCSY8QAvD_BwE");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement watchJew=driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		//to perform mouse hover
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		WebElement ring = driver.findElement(By.xpath("//a[.='Rings ']"));
		act.moveToElement(ring);
		driver.findElement(By.xpath("//a[text()='Diamond']")).click();
		
	}
}
