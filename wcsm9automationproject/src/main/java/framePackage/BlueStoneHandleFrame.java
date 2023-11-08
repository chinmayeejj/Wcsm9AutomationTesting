package framePackage;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneHandleFrame 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		//switch the controls to frame
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);

		
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);

		//switch to main page 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();

		driver.findElement(By.id("chat-fc-name")).sendKeys("chinmayee");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("cj@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Start Chat\"]")).click();
		
	}

}
