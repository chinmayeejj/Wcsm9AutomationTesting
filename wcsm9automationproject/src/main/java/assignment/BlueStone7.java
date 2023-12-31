package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);

		
		WebElement allJew = driver.findElement(By.xpath("//li[@class='menuparent']/a"));
		//to perform mouse hover
		Actions act=new Actions(driver);
		act.moveToElement(allJew).perform();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		
		String parentHandle = driver.getWindowHandle();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement kada = driver.findElement(By.xpath("//li[@data-position='11']"));
		Point loc = kada.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		jse.executeScript("window.scrollBy("+x+","+y+");");
		Thread.sleep(2000);
		
		kada.click();
		
		Set<String> allHandle = driver.getWindowHandles();
		for(String handle:allHandle)
		{
			if(!(handle.equals(parentHandle)))
			{
				driver.switchTo().window(handle);
			}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.id("buy-now")).submit();
		
		WebElement err=driver.findElement(By.xpath("//div[text()='* This field is required']"));
		
		if(err.isDisplayed())
		{
			System.out.println( err.getText());
			System.out.println("select bangle size");
		}
		else
		{
			System.out.println("fail");
		}
		
		Thread.sleep(5000);
		driver.quit();

	}

}
