package testNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void selenium_Method() throws InterruptedException 
  {
	  WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.google.com/");
		 
		 driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		 Thread.sleep(3000);
		 driver.close();
  }
}
