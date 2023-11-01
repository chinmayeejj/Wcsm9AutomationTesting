package javaScriptExecutorPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.selenium.dev/");
		

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		for(int i=0;i<=2;i++)
		{	
			jse.executeScript("window.scrollBy(0,500);");
		}
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500);");

	}

}
