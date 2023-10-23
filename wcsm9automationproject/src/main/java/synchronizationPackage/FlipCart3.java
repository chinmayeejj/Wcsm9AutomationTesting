package synchronizationPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipCart3 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	   
	   driver.get("https://www.flipkart.com/");
	   
	   driver.findElement(By.xpath("//span[text()='✕']")).click();
	   
	   driver.findElement(By.name("q")).sendKeys("laptop");
	   
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(3000);
	   
	  // driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/div[text()='Processor']")).click();
	  // Thread.sleep(3000);
	 
	   driver.findElement(By.xpath("//div[@class='QvtND5 _2w_U27']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	   Thread.sleep(2000);	  
	   driver.findElement(By.xpath("//span[text()='Apply Filters']")).click();
	   
	   Thread.sleep(2000);	
	   driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	   Thread.sleep(2000);	
	   driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/div[text()='Brand']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='HP']")).click();
	   Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
       Thread.sleep(2000);
       List<WebElement> allLaptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
       List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
       
       
       for(int i=0; i<allLaptop.size();i++)
       {
    	   String laptop = allLaptop.get(i).getText();
    	   Thread.sleep(2000);
    	   for(int j=0;j<=i;j++)
    	   {
    		  String price = allPrice.get(j).getText();
    		  System.out.println(laptop+ " -> "+price);
    	   }
       }
       

     //for(WebElement ele:collection)
	 //  {
    	  
   	//	   String elementName = ele.getText();
   	//	   System.out.println(elementName);
		   
			
	//   }
	   
	   
	}

}
