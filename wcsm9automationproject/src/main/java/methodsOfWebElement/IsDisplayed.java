package methodsOfWebElement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("flowers");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		String homeAdd = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='_13oc-S']/descendant::a[@class='s1Q9rs']")).click();
		Set<String> allHandles = driver.getWindowHandles();

		for(String wh:allHandles)
		{
			if(!wh.equals(homeAdd))
			{
				driver.switchTo().window(wh);
			}
		}
		WebElement buy = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		
		//to find out BUY BUTTON is dispayed or not
		System.out.println(buy.isDisplayed());
	}

}
