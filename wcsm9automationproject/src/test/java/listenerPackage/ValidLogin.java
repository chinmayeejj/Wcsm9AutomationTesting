package listenerPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomeListener.class)


public class ValidLogin extends BaseTest {
  @Test
  public void validLogin() throws InterruptedException 
  {
	  String expectedLoginTitle="actiTIME - ";
	  Assert.assertEquals(driver.getTitle(), expectedLoginTitle);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

  }
}
