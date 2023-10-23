package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		boolean status = login.isEnabled();
		System.out.println(status);
	
		System.out.println("After passing values to respective textfield ");
		
		driver.findElement(By.name("username")).sendKeys("chinmayeejakate@gmail.com");
		driver.findElement(By.name("password")).sendKeys("TA13141@");
		Thread.sleep(3000);
		System.out.println( login.isEnabled());
	}
}
