package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLacator 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver	driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/simpleLogin.html");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.tagName("input")).sendKeys("admin");
	  Thread.sleep(3000);
	  driver.findElement(By.tagName("input")).sendKeys("manager");
	}

}
