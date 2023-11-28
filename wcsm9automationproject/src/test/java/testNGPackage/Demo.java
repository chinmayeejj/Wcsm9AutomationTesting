package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() 
  {
	  //System.out.println("method 1 from demo class");//console op
	  //Reporter.log("method 1 from demo class");//testNG report
	  Reporter.log("method 1 from demo class", true);
  }
  @Test
  public void method2()
  {
	  //System.out.println("method 2 from demo class");//console op
	  //Reporter.log("method 1 from demo class");//testNG report op
	  Reporter.log("method 2 from demo class", true); //to see op in both console and report value should be true

	  
  }
}
