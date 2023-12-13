package testPackage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;
import pagePackage.UsersPage;

public class DeleteAll extends BaseTest {
  @Test
  public void deleteMethod() throws IOException, InterruptedException, AWTException 
  {
	  	LoginPage lp=new LoginPage(driver);
		Flib flib =new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH, "username"), flib.readDataFromProperty(PROP_PATH, "password"));
		HomePage hp =new HomePage(driver);
		hp.click_On_Tasks_Module();
		
		TasksPage tp=new TasksPage(driver);
		tp.deleteProjectAndCustomer();
		
		hp.click_On_Users_Module();
		
		UsersPage up=new UsersPage(driver);
		up.deleteUser();
		
  }
}
