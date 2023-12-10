package testNGAnnotationsAndFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag {
  @Test(groups = "Functionality Testing")
  public void ft1() 
  {
	  Reporter.log("ft1 method",true);
	  
  }
  @Test(groups = "Integration Testing")
  public void it1() 
  {
	  Reporter.log("it1 method",true);
	  
  }
  @Test(groups = "Smoke Testing")
  public void st1() 
  {
	  Reporter.log("st1 method",true);
	  
  }
  //-----------------------------------
  @Test(groups = "Functionality Testing")
  public void ft2() 
  {
	  Reporter.log("ft2 method",true);
	  
  }
  @Test(groups = "Integration Testing")
  public void it2() 
  {
	  Reporter.log("it2 method",true);
	  
  }
  @Test(groups = "Smoke Testing")
  public void st2() 
  {
	  Reporter.log("st2 method",true);
	  
  }
  //-----------------------------------------
  @Test(groups = "Functionality Testing")
  public void ft3() 
  {
	  Reporter.log("ft3 method",true);
	  
  }
  @Test(groups = "Integration Testing")
  public void it3() 
  {
	  Reporter.log("it3 method",true);
	  
  }
  @Test(groups = "Smoke Testing")
  public void st3() 
  {
	  Reporter.log("st3 method",true);
	  
  }
  //------------------------------------
  @Test(groups = "Functionality Testing")
  public void ft4() 
  {
	  Reporter.log("ft4 method",true);
	  
  }
  @Test(groups = "Integration Testing")
  public void it4() 
  {
	  Reporter.log("it4 method",true);
	  
  }
  @Test(groups = "Smoke Testing")
  public void st4() 
  {
	  Reporter.log("st4 method",true);
	  
  }
  //-----------------------------------------
  @Test(groups = "Functionality Testing")
  public void ft5() 
  {
	  Reporter.log("ft5 method",true);
	  
  }
  @Test(groups = "Integration Testing")
  public void it5() 
  {
	  Reporter.log("it5 method",true);
	  
  }
  @Test(groups = "Smoke Testing")
  public void st5() 
  {
	  Reporter.log("st5 method",true);
	  
  }
  //-----------------------------------------
  @Test(groups = "Functionality Testing")
  public void ft6() 
  {
	  Reporter.log("ft6 method",true);
	  
  }
  @Test(groups = "Integration Testing")
  public void it6() 
  {
	  Reporter.log("it6 method",true);
	  
  }
  @Test(groups = "Smoke Testing")
  public void st6() 
  {
	  Reporter.log("st6 method",true);
	  
  }
}
