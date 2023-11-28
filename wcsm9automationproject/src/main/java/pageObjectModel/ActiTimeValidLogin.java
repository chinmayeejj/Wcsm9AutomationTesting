package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException 
	{
		BaseTest bt=new BaseTest();
		bt.setUp();
	
		LoginPage lp=new LoginPage(driver);
		Flib flib =new Flib();
	
	
		
		//get WebElement
		
		lp.validLogin(flib.readDataFromProperty(PROP_PATH, "username"), flib.readDataFromProperty(PROP_PATH, "password"));
		
		bt.tearDown();
	}

}
