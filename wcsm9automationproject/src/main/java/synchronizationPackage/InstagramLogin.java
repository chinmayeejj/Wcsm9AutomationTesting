package synchronizationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("chinmayee_j_j");
		
		driver.findElement(By.name("password")).sendKeys("87ry4hur8tbd");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
	}

}
