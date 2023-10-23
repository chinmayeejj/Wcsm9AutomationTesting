package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://laptop-89brlgsi/login.do");
		
		WebElement userNameTB = driver.findElement(By.name("username"));
		
		WebElement passTB = driver.findElement(By.name("pwd"));
		
		userNameTB.sendKeys("admin");
		Thread.sleep(2000);
		
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		
		userNameTB.clear();
		Thread.sleep(2000);
		passTB.clear();
	}
}
