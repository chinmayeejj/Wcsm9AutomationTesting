package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
	    
	    driver.findElement(By.partialLinkText("Open a popup window")).click();
	    Thread.sleep(2000);
	    
	    //Get the Address of parent as well as child browser
	    Set<String>  allHandles = driver.getWindowHandles();


	    
	    for(String wh:allHandles) //for each loop
	    {
	    	if(parentHandle.equals(wh))
	    	{
	    		driver.switchTo().window(wh).close();
	    		
	    	}
	    
	    }
	}

}
