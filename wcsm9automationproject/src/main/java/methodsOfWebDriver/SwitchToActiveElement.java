package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/google.com/");
		Thread.sleep(3000);
		
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(3000);
		 driver.close();
         
		 //
		 
		
	}

}
