package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way5 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.selenium.dev/");
		
		//To take screenshot of webpage
		TakesScreenshot ts=(TakesScreenshot)driver;
		//call the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//define way to store ss
		File dest = new File("./Screenshots/Selenium_dev.jpg");
		//stores ss into destination using files class of google
		Files.copy(src, dest);
	}
	

}
