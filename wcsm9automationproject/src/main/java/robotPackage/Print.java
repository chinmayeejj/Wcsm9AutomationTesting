package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("avengers",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[.='Images']")).click();
		driver.findElement(By.xpath("(//img[@class=\"rg_i Q4LuWd\"])[6]")).click();
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL );		
		robo.keyPress(KeyEvent.VK_P );		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_P );
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_P );		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_P );		

		
	}
		

}
