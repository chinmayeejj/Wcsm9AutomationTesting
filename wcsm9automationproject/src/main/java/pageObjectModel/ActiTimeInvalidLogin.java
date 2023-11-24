package pageObjectModel;

public class ActiTimeInvalidLogin extends BaseTest
{
	public static void main(String[] args) 
	{
		LoginPage lp=new LoginPage(driver);
		for(int i=1;i<=10;i++)
		{
			//get the method from loginPage class
			lp.invalidLogin(flib., null);
			
		}
		
	}

}
