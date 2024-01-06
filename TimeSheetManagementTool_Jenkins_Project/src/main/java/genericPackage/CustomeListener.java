package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("onTestStart",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("onTestSuccess",true);

		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("onTestFailure",true);
		String failedMethodName  = result.getMethod().getMethodName();
		Reporter.log("failed method screenshot taken : "+failedMethodName, true);
		failedMethod(failedMethodName);
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	

}
