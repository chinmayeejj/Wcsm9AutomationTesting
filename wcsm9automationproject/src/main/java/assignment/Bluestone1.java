package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone1 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
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
		
		act.moveToElement(watchJew).perform();
		
		driver.findElement(By.linkText("Band")).click();
		
		//to selecct filter by text bydouble click and click and hold
		WebElement filter = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		for(int i=0 ;i<=2;i++)
		{
			act.doubleClick(filter).perform();
			act.clickAndHold(filter).perform();
		}
	
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
		driver.findElement(By.name("submit_search")).click();

		
		
		

	}

}
