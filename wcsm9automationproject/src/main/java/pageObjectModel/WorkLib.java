package pageObjectModel;

public class WorkLib extends BaseTest
{
	public void handle_Alert_comfirmation_popup()
	{
		driver.switchTo().alert().accept();
	}
	

}
