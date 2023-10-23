package synchronizationPackage;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack 
{

	public static void main(String[] args) 
	{
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   
//try for getTitle method for home page with explicit wait
		   //implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));   
		 
		   driver.get("https://www.shoppersstack.com/");
		 
		   driver.findElement(By.xpath("//span[text()='SAMSUNG'] ")).click();
		   
		   driver.findElement(By.name("Check Delivery")).sendKeys("431731");
		   
		   //Apply explicit wait try with it
		   //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  // wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();		   
		   //click on check butto
		   WebElement checkButton=driver.findElement(By.className("dropbtn"));
		   explicitWait(driver, 60,checkButton).click();
		   
		  
		 
		   
		
	}
	 public static WebElement explicitWait(WebDriver driver, long sec, WebElement ele)
	   {
		   WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(sec));
		   WebElement element =wait.until(ExpectedConditions.elementToBeClickable(ele));
		   return element;
		   
	   }

}
