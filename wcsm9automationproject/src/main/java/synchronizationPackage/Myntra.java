package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Se')]")).sendKeys("shoes");
		
		driver.findElement(By.xpath("//a[@class='desktop-submit' and (@data-reactid=\"908\")]")).click();
		
		String parentHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//div[@id='desktopSearchResults']/descendant::li[@class='product-base'])[1]")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				
			}
		}
		
		driver.findElement(By.xpath("//p[text()='6']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("431731");
		driver.findElement(By.xpath("//input[contains(@class ,'pincode-ch')]")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'myntraweb-sprite pdp-w')]"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class, 'myntraweb-sprite pdp-w')]")).click();
	
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("GO TO BAG"))).click();
		//driver.findElement(By.linkText("GO TO BAG")).click();
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='c']"))).click();
		//driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		
		
		
		
	}

}
