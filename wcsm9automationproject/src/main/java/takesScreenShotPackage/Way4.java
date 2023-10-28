package takesScreenShotPackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class Way4 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		efw.manage().window().maximize();
		efw.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		efw.navigate().to("https://www.atlassian.com/");
		
		//call the method
		File src = efw.getScreenshotAs(OutputType.FILE);
		//define way to store ss
		File dest = new File("./Screenshots/atlassian2.jpg");
		//stores ss into destination using files class of google
		Files.copy(src, dest);

	}
}
