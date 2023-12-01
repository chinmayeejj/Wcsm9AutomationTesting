package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	 public void method1() 
	  {
		  Reporter.log("method 1 from Test1 class", true);
	  }
	  @Test
	  public void method2()
	  {
		  Reporter.log("method 2 from Test1 class", true); //to see op in both console and report value should be true

		  
	  }
}

