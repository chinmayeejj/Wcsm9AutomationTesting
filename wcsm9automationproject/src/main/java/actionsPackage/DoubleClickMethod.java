package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[.='Button']")).click();
		driver.findElement(By.xpath("//a[.='Double Click']")).click();
		Actions act=new Actions(driver);
		
		WebElement first = driver.findElement(By.xpath("//button[.='Yes'][1]"));
		act.doubleClick(first).perform();
		
		WebElement no = driver.findElement(By.xpath("(//button[.='No'])[2]"));
		act.doubleClick(no).perform();
		
		WebElement rate = driver.findElement(By.xpath("//button[.='4']"));
		act.doubleClick(rate).perform();
		
		
		
	}
	

}
