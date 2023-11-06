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

public class OmayoDisable 
{
public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement disTB = driver.findElement(By.id("tb2"));
		Point loc = disTB.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		jse.executeScript("window.scrollBy("+x+","+(y-40)+")");//it was scrolling more below there fore we are doing - operation
		Thread.sleep(1000);
		
		//jse.executeScript("arguments[0].scrollIntoViev(true)",disTB);  other way of scrolling

		
		jse.executeScript("document.getElementById(\"tb2\").value='Atomation Testing'");
		
		Thread.sleep(1000);
		File src = disTB.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/disableTB.png");
		
		Files.copy(src, dest);
	}
}
