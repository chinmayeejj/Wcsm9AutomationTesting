package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium with java");
		driver.findElement(By.id("search-icon-legacy")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		driver.findElement(By.xpath("(//h3[@id='video-title']/ancestor::div[@id='contents']/descendant::div[@id='main-container'])[2]")).click();
	}

}
