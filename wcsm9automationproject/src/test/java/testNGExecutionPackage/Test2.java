package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	 public void method1() 
	  {
		  Reporter.log("method 1 from Test2 class", true);
	  }
	  @Test
	  public void method2()
	  {
		  int a=30;
		  int b=4;
		  int c=a/b;
				
		  Reporter.log("method 2 from Test2 class"+c, true); //to see op in both console and report value should be true

		  
	  }
}
