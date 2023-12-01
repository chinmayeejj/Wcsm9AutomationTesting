
package testNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaTest {
  @Test
  public void java_method() throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://www.google.com/");
	 
	 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	 Thread.sleep(3000);
	 driver.close();
	 
  }
}
