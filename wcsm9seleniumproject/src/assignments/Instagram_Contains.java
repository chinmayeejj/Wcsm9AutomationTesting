package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Contains 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label, 'Phone number,')]")).sendKeys("chinmayeejakate@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label, 'Password')]")).sendKeys("3vjhsG@vhgvdhgd");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(), 'Log in')]")).click();
		Thread.sleep(4000);
		
		driver.quit();

	}

}
