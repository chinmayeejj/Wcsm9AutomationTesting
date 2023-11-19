package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethods 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(3000);
	
    String parentHandle = driver.getWindowHandle();
    System.out.println("Address of parent window or parent browser->  "+parentHandle);
    
    driver.findElement(By.partialLinkText("Open a popup window")).click();
    
    //Get the Address of parent as well as child browser
    Set<String>  allHandles = driver.getWindowHandles();
   // System.out.println("Address of parent and child window or parent browser->  "+allHandles);
    //Address of parent and child window or parent browser->  [E22100D27D74E5FBAE0D90711909C100, 290B161B7EF8DA05221304F8A9C058F9]

    
    for(String wh:allHandles) //for each loop
    {
    	if(!parentHandle.equals(wh))
    	{
    		System.out.println("Address of child Window -> "+wh);
    		
    	}
    	else
    	{
      		System.out.println("Address of parent Window -> "+wh);
    	}
    }
    driver.quit();
	}
}
