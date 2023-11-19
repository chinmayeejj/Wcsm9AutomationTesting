package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
	public static void main(String[] args) throws InterruptedException  
	{
		
		{
			WebDriver driver=new ChromeDriver();	
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(3000);
			
			driver.findElement(By.id("email")).sendKeys("Chinmayeejakate@gmail.com");
			
			driver.findElement(By.id("pass")).sendKeys("Abcd234");
			Thread.sleep(3000);
			
			
		}

		
	}

}
