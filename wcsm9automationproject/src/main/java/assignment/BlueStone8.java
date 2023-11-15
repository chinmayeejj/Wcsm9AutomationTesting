package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone8 
{
	public static void main(String[] args) throws InterruptedException
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.bluestone.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   

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
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='select-size']")).click();
		Thread.sleep(2000);
		WebElement size = driver.findElement(By.xpath("//span[.='2-6(2 6/16\")']"));
		String bangleSize=size.getText();
		size.click();
		
		driver.findElement(By.id("buy-now")).submit();
		
		Thread.sleep(2000);
		String buyPageSize = driver.findElement(By.xpath("//span[.='2-6(2 6/16\")']")).getText();
		
		if(buyPageSize.equals(bangleSize))
		{
			System.out.println("Bangle size is matched ");
		}
		else
		{
			System.out.println("not matching");           
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
