package testNGAnnotationsAndFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag 
{	@Test
	  public void loginMethod()
	  {
		  Reporter.log("login", true);
	  }
	  
	  @Test(dependsOnMethods = "loginMethod")
	  public void createUserMethod()
	  {
		  Assert.fail();
		  Reporter.log("user created", true);

	  }
	  @Test(dependsOnMethods = "createUserMethod",alwaysRun = true)
	  public void logoutMethod()
	  {
		  Reporter.log("logged out", true);

	  }
}
