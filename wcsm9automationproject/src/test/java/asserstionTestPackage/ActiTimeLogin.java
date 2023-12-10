package asserstionTestPackage;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listenerPackage.CustomeListener;

public class ActiTimeLogin 
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
  
  @Test
  public void TestMethod() throws InterruptedException
  {
	  String expectedLoginTitle="actiTIME - Login";
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(),expectedLoginTitle);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement logoutLink = driver.findElement(By.partialLinkText("Logout"));
		sa.assertEquals(logoutLink.isDisplayed(), true);
		
		logoutLink.click();
		sa.assertAll();
		driver.quit();
	
  }
}
