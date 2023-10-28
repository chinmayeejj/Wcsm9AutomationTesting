package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
	
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		rwd.navigate().to("https://www.atlassian.com/");
		
		//call the method
		File src = rwd.getScreenshotAs(OutputType.FILE);
		//define way to store ss
		File dest = new File("./Screenshots/atlassian.jpg");
		//stores ss into destination using files class of google
		Files.copy(src, dest);
	}

}
