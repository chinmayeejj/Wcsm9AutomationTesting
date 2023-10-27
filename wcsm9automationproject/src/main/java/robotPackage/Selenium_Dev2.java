package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Dev2 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
	
			WebDriver	driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.selenium.dev/");
			
			//generate print popup (CTRL +P)
			Robot robo=new Robot();
			Thread.sleep(2000);
			
			//to press the CTRL+P
			robo.keyPress(KeyEvent.VK_CONTROL );		
			robo.keyPress(KeyEvent.VK_P );
			Thread.sleep(2000);
			
			//to release the CTRL+P
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_P );
			
			//to shift control from Print to Cancel
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);	
			Thread.sleep(2000);
			
			//to hit enter on cancel button
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER );
			Thread.sleep(4000);
			driver.quit();
			
	}

}
