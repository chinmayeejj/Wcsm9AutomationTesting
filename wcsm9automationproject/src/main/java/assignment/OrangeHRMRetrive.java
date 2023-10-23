package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMRetrive 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement pwdTB = driver.findElement(By.name("password"));
		
		usnTB.sendKeys("Admin");
		pwdTB.sendKeys("admin123");
		
		System.out.println("Username: " + usnTB.getAttribute("value"));
		System.out.println("Password: " +pwdTB.getAttribute("value"));
		
		Thread.sleep(2000+8);
		driver.close();
		
//			String at = usnTB.getAttribute("value");
//			System.out.println(at);
//			
	}

}
