package listenerPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest 
{
	static WebDriver driver;
  @BeforeMethod
  public void setUp() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://laptop-89brlgsi/login.do");
  }
  
  public void failedSSMethod(String failedSSMethod)
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File("./Screenshots/"+failedSSMethod+".png");
	  
	  try 
	  {
		  Files.copy(src, dest);
	  }
	  catch(Exception e)
	  {
		  
	  }
	  
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
