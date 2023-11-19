package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Car");
		
		Thread.sleep(4000);
		
		List<WebElement> bikeOptions = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]"));
		
		for(WebElement op:bikeOptions)
		{
			String options=op.getText();
			Thread.sleep(2000);
			System.out.println(options);
		}
	}

}
