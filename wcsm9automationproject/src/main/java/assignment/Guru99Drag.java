package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99Drag 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement sales = driver.findElement(By.xpath("//a[.=' SALES ']"));
		WebElement firstAmt = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement secondAmt = driver.findElement(By.xpath("//a[.=' 5000']"));
		
		WebElement bank1 = driver.findElement(By.id("bank"));
		WebElement amt1 = driver.findElement(By.id("amt7"));
		WebElement sales1 = driver.findElement(By.id("loan"));
		WebElement amt2 = driver.findElement(By.id ("amt8"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(bank, bank1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sales, sales1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(firstAmt, amt1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(secondAmt,amt2).perform();
		
		if(driver.findElement(By.xpath("//a[.='Perfect!']")).isDisplayed())
		{
			System.out.println("Successfully performed Drag and Drop");
		}


	}

}
