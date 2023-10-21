package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/Login");
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("chinmayeejakatemail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("Abc!223");
	
		//clicking login using className locator
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	}

}
