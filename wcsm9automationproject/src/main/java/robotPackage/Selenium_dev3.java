package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_dev3 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.selenium.dev/");
		
		Actions act=new Actions(driver);
		
		WebElement gettingStarted = driver.findElement(By.xpath("//h2[.='Getting Started']"));
		Thread.sleep(2000);
		act.contextClick(gettingStarted).perform();
		Robot robot=new Robot();
		//to go for inspect option press page up (or u can go by page down but u have to use looping stmt)
		for(int i =0;i<10;i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(2000);
		}
		//to hit enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


		
	}
	

}
