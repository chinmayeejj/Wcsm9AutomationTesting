package testNGAnnotationsAndFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(priority=1)
  public void a() 
  {
	  Reporter.log("a", true);
  }
  @Test(priority=0)
  public void z()
  {
	  Reporter.log("z", true);
	  
  }
  @Test(priority=2)
  public void h()
  {
	  Reporter.log("h", true);
  }
  @Test(priority=2)
  public void t()
  {
	  Reporter.log("t", true);
  }
}
