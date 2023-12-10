package testNGAnnotationsAndFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags1_2 {
  @Test(description="abc", enabled=true)
  public void Method1() 
  {
	  Reporter.log("method 1 from test 1",true);
  }
  @Test(description="chinmayee", enabled=true)
  public void Method2() 
  {
	  Reporter.log("method 2 from test 2",true);
  }
  @Test(description="xyz", enabled=false)
  public void Method3() 
  {
	  Reporter.log("method 3 from test 3",true);
  }
}
