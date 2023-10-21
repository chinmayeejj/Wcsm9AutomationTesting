package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		//String parentHandle=driver.getWindowHandle();
		
	    driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		Set<String>  allHandles = driver.getWindowHandles();
		
		for(String wh : allHandles)
		{
			driver.switchTo().window(wh).close();
		}

		
		
	}
}







//if(!parentHandle.equals(wh))
//{
	
	//driver.switchTo().window(wh).close();
	//if(parentHandle.equals(wh))
	//{
		
		//driver.close();
	//}

//}
//driver.close();