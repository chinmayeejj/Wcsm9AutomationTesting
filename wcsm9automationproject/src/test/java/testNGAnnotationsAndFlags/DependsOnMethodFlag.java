package testNGAnnotationsAndFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodFlag {
  @Test
  public void loginMethod()
  {
	  Reporter.log("login", true);
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod()
  {
	  Reporter.log("user created", true);

  }
  @Test(dependsOnMethods = "createUserMethodu")
  public void logoutMethod()
  {
	  Reporter.log("logged out", true);

  }
}
