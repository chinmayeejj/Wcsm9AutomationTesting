package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver	driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/simpleLogin.html");
	  Thread.sleep(3000);
	  //identify username textbox by using id
	  driver.findElement(By.id("id1")).sendKeys("admin");
	  Thread.sleep(3000);
	  
	//identify password textbox by using id
	  driver.findElement(By.id("id2")).sendKeys("manager");
	}

}


