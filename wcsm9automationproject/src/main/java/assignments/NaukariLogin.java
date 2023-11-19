package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		
		driver.findElement(By.id("usernameField")).sendKeys("chinmayeejakate@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordField")).sendKeys("Abc@1234");
		

		
	}

}
