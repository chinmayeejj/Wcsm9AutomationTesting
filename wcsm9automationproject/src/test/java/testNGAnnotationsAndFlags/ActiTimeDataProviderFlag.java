package testNGAnnotationsAndFlags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProviderFlag {
  @DataProvider(name="TestData")
  public Object[][] actiTimeTestData()
  {
	  Object[][] testData=new Object[5][2];
	  testData[0][0]="ad-min";
	  testData[0][1]="MAnagert";
	  
	  testData[1][0]="ad-iin";
	  testData[1][1]="MA43gert";

	  testData[2][0]="adfdf-min";
	  testData[2][1]="MAna434rt";

	  testData[3][0]="addfgdin";
	  testData[3][1]="MAndfgert";

	  testData[4][0]="ad-ff";
	  testData[4][1]="MA874gert";
	  
	  return testData;

  }
  @Test(dataProvider = "TestData")
  public void invalidLogin(String usn,String pass) throws InterruptedException
  {
	  	WebDriver driver= new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  	driver.get("http://laptop-89brlgsi/login.do");
 
	    driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();

  }
}

