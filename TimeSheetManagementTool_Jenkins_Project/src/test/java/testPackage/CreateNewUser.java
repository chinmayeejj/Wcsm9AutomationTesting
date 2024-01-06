package testPackage;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import genericPackage.WorkLib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;


public class CreateNewUser extends BaseTest{
  @Test
  public void create_new_User() throws EncryptedDocumentException, Exception 
  {

		
		
		//Login
		LoginPage lp=new LoginPage(driver);
		Flib flib=new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH,"username"),flib.readDataFromProperty(PROP_PATH,"password"));
		
		HomePage hp=new HomePage(driver);
		hp.click_On_Users_Module();
		
		UsersPage up=new UsersPage(driver);
		String usn=flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1, 0);
		String pass=flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1, 1);
		String fName=flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1, 2);
		String lName=flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1, 3);
		String wDuration=flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1, 4);



		
		up.create_New_User(usn,pass,fName,lName,wDuration);
		
		
//		up.deleteUser();
//		
		Thread.sleep(2000);
		
//		WorkLib wl=new WorkLib();
//		wl.acceptAlertPopUp();;
//		
	
		
  }
}
