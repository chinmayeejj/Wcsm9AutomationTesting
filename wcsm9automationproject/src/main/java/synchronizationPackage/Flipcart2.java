package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipcart2 
{
	public static void main(String[] args) 
	{

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		
		//handle hidden division popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("iphone"); // we can also use name locator cause it has name AN
		
		
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).click();
		
        Set<String>  allHandles = driver.getWindowHandles();   
	    
	    	for(String wh:allHandles)
	    	{
	    		if(!parentHandle.equals(wh))
	    		{
	    			
	    			driver.switchTo().window(wh);
	    		}
	    		
	    	}
		
		
				
		driver.findElement(By.xpath("//li[@class=\"_3V2wfe\" and (@id='swatch-1-color')]")).click();
		
		driver.findElement(By.linkText("512 GB")).click();
		
		driver.findElement(By.id("pincodeInputId")).sendKeys("431731");
		
		
		//driver.findElement(By.xpath("//span[text()='Check']")).clear();
		
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 //wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[text()='Remove']")))).click();
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Remove']"));
		

		driver.findElement(By.xpath("//div[@class='td-FUv WDiNrH']/descendant::div[text()='Remove']")).click();
		
		
		
	}

}
