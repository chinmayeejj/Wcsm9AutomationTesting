package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindows 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		  
		String parentHandle = driver.getWindowHandle();
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(3000);
		
	    Set<String>  allHandles = driver.getWindowHandles();
	    
	    for(String wh:allHandles)
	    {
	    	if(!parentHandle.equals(wh))
	    	{
	    		System.out.println("Address of child Window -> "+wh);
	    		driver.switchTo().window(wh).close();
	    		
	    		
	    	}
	    	else
	    	{
	      		System.out.println("Address of parent Window -> "+wh);
	    	}
	    }
		
	}

}
