package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillTwitter 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.selenium.dev/");
		WebElement twit = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));

		Point loc = twit.getLocation();		
		int x=loc.getX();
		int y=loc.getY();
		

		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy("+x+","+y+");");
		
		//way 2 for scroll till particular Web element
		//js code executeScript("arguments[0].scrollIntoView(true),web_ele)") //true means scroll below WebELE
		
		//jse.executeScript("arguments[0].scrollIntoView(true),web_ele)")
		
		Thread.sleep(1000);
		File src = twit.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/twitterss2.jpg");//path of file in arg
		
		Files.copy(src, dest);
		
		
	}

}
