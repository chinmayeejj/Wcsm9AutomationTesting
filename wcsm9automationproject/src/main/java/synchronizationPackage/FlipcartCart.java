package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartCart 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   

	   //implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   
	 
	   driver.get("https://www.flipkart.com/");
	  // Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//span[text()='✕']")).click();
	  // Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//img[@alt='Cart']")).click(); //try to use multiple attribute or linktext
	  // Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//span[text()='Login']")).click(); //you can use button tag
	   //Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7218618277");
	   //Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	   	   
		
		
	}
}
