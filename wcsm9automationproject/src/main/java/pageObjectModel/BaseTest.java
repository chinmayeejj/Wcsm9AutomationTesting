package pageObjectModel;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flib implements IautoConstant
{
	static WebDriver driver;
	public void setUp()
	{
		
	}
	
	public void tearDown()
	{
		driver.quit();
		
	}
}
