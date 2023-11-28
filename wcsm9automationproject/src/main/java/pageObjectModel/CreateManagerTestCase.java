package pageObjectModel;

import org.apache.poi.EncryptedDocumentException;

public class CreateManagerTestCase extends BaseTest
{
	public static void main(String[] args) throws EncryptedDocumentException, Exception 
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//Login
		LoginPage lp=new LoginPage(driver);
		Flib flib=new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH,"username"),flib.readDataFromProperty(PROP_PATH,"password"));
		
		HomePage hp=new HomePage(driver);
		hp.click_On_Users_Module();
		
		UsersPage up=new UsersPage(driver);
		String usn=flib.readExcelData(EXCEL_PATH, MANAGER_CREDS_SHEET, 1, 0);
		String pass=flib.readExcelData(EXCEL_PATH, MANAGER_CREDS_SHEET, 1, 1);
		String fName=flib.readExcelData(EXCEL_PATH, MANAGER_CREDS_SHEET, 1, 2);
		String lName=flib.readExcelData(EXCEL_PATH, MANAGER_CREDS_SHEET, 1, 3);
		String wDuration=flib.readExcelData(EXCEL_PATH, MANAGER_CREDS_SHEET, 1, 4);



		
		up.create_New_User(usn,pass,fName,lName,wDuration);
		
		bt.tearDown();

		
		
	}

}
