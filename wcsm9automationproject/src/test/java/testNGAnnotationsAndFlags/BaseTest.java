package testNGAnnotationsAndFlags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest
{
	static WebDriver driver;
  @BeforeMethod
  public void setUp() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
  
}
