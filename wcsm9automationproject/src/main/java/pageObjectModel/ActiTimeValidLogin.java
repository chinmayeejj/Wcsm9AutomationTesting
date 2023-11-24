package pageObjectModel;

public class ActiTimeValidLogin extends BaseTest
{
	public static void main(String[] args) 
	{
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		//get WebElement
		LoginPage lp=new LoginPage(driver);
		lp.validLogin(null, null);
		
		bt.tearDown();
	}

}
