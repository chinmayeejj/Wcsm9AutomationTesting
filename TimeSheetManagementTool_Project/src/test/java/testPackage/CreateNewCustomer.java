package testPackage;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;


public class CreateNewCustomer extends BaseTest {
  @Test
  public void create_ProjectAndCustomer() throws EncryptedDocumentException, Exception 
  {
	//to open & close Browser
			
			
			
			//read the data from property and excel file
			Flib flib = new Flib();
			
			//to perform  VALID login use Login page pom 
			LoginPage lp = new LoginPage(driver);
			lp.validLogin(flib.readDataFromProperty(PROP_PATH, "username"), flib.readDataFromProperty(PROP_PATH, "password"));
			
			Thread.sleep(2000);
			
			//to work Task Module use HomePage Pom
			HomePage hp = new HomePage(driver);
			hp.click_On_Tasks_Module();
			Thread.sleep(2000);
			
			//to create customer and project use TasksPage pom
			TasksPage tp = new TasksPage(driver);
			tp.createProjectsAndCustomer(flib.readExcelData(EXCEL_PATH, CUST_PROSHEET_NAME,1,0),flib.readExcelData(EXCEL_PATH, CUST_PROSHEET_NAME,1,1));
			Thread.sleep(2000);
//			tp.deleteProjectAndCustomer();
//			Thread.sleep(2000);
			
		}
  
}
