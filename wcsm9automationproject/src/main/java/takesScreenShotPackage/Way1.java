package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 
{
	public static void main(String[] args) throws IOException 
	{
		//directly create  object of driver specific class
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.selenium.dev/");
		
		//call the method
		File src = driver.getScreenshotAs(OutputType.FILE);
		//define way to store ss
		File dest = new File("./Screenshots/Selenium_dev1.jpg");
		//stores ss into destination using files class of google
		Files.copy(src, dest);
	}
	

}
