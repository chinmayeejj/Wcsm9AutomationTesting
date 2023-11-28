package testNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SqlTest {
  @Test
  public void sql_method() throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.google.com/");
		 
		 driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
		 Thread.sleep(3000);
		 driver.close();
  }
}
