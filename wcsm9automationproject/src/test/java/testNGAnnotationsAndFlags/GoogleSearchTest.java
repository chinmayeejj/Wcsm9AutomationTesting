package testNGAnnotationsAndFlags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest
{
  @Test
  public void search_java() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  @Test
  public void search_selenium() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
