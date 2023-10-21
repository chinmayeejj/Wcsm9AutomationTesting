package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//handle hidden division popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("mobile"); // we can also use name locator cause it has name AN
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		
		//to find the price of second mobile
		String price=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).getText();
		System.out.println(price);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).click();
	} 
	

}
