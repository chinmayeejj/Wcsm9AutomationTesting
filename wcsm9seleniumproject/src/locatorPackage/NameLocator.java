package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// no such element exeption if there is no  that value
		driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/radioButton.html");
		Thread.sleep(2000);

		
		driver.findElement(By.name("name3")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name1")).click();
		
		
		
	}

}
