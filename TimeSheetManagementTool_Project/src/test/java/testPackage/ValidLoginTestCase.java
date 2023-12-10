package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;



public class ValidLoginTestCase extends BaseTest{
  @Test
  public void validLogin() throws IOException 
  {
	 
	
		LoginPage lp=new LoginPage(driver);
		Flib flib =new Flib();
	
	
		
		//get WebElement
		
		lp.validLogin(flib.readDataFromProperty(PROP_PATH, "username"), flib.readDataFromProperty(PROP_PATH, "password"));
		
  }
}
