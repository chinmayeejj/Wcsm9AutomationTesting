package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickContextMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[.='Button']")).click();
		driver.findElement(By.xpath("//a[.='Right Click']")).click();
		Actions act=new Actions(driver);
		
		//first right click
		WebElement first = driver.findElement(By.xpath("//button[.='Right Click'][1]"));
		act.contextClick(first).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Yes']")).click();
		if(driver.findElement(By.xpath("//span[.='You selected \"Yes\"']")).isDisplayed())
		{
			System.out.println("text Displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		//second right click
		WebElement second = driver.findElement(By.xpath("(//button[.='Right Click'])[2]"));
		act.contextClick(second).perform();
		driver.findElement(By.xpath("//div[.='Yes']")).click();
		String color = second.getCssValue("color");
	
		if(color.equals("rgba(0, 0, 0, 1)"))

		{
			System.out.println("successful second right click of second element");
		}
		else
		{
			System.out.println("Unsuccessful second right click of second element");
		}
		
		//Third right click
		WebElement third = driver.findElement(By.xpath("(//button[.='Right Click'])[3]"));
		act.contextClick(third).perform();
		Thread.sleep(2000);
		//String res = driver.findElement(By.xpath("(//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md'])[3]")).getText();
		
		driver.findElement(By.xpath("//div[.='3']")).click();
		
		String color1 = second.getCssValue("color");
	
		if(color.equals("rgba(0, 0, 0, 1)"))

		{
			System.out.println("successful second right click of third element");
		}
		else
		{
			System.out.println("Unsuccessful second right click of third element");
		}
	




		
	}

}
