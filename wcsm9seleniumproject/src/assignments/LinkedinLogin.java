package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/home");
		Thread.sleep(2000);
		
		driver.findElement(By.id("session_key")).sendKeys("chinmayeejakate@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("session_password")).sendKeys("Abc!222");
		
		
	}

}
