package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//initialization
		@FindBy(xpath="//div[text()='Time-Track']/following-sibling::div/img") private WebElement TimeTrack;
		@FindBy(xpath="//div[text()='Tasks']/following-sibling::img") private WebElement Tasks_module ;
		@FindBy(xpath="//div[text()='Reports']/following-sibling::img") private WebElement Reports_Module ;
		@FindBy(xpath="//A[contains(@class,'content users')]/descendant::IMG[@class='sizer']") private WebElement Users_Module ;
		@FindBy(xpath="//div[text()='Settings']/following-sibling::img") private WebElement Settings_Module ;
		@FindBy(xpath="//div[text()='Work Schedule']/following-sibling::img") private WebElement Work_Schedule_Module ;
		@FindBy(partialLinkText = "Logout") private WebElement Logout_Link;
		
		
		
		
		//utilization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public WebElement getTimeTrack() {
			return TimeTrack;
		}

		public void setTimeTrack(WebElement timeTrack) {
			TimeTrack = timeTrack;
		}

		public WebElement getTasks_module() {
			return Tasks_module;
		}

		public void setTasks_module(WebElement tasks_module) {
			Tasks_module = tasks_module;
		}

		public WebElement getReports_Module() {
			return Reports_Module;
		}

		public void setReports_Module(WebElement reports_Module) {
			Reports_Module = reports_Module;
		}

		public WebElement getUsers_Module() {
			return Users_Module;
		}

		public void setUsers_Module(WebElement users_Module) {
			Users_Module = users_Module;
		}

		public WebElement getSettings_Module() {
			return Settings_Module;
		}

		public void setSettings_Module(WebElement settings_Module) {
			Settings_Module = settings_Module;
		}

		public WebElement getWork_Schedule_Module() {
			return Work_Schedule_Module;
		}

		public void setWork_Schedule_Module(WebElement work_Schedule_Module) {
			Work_Schedule_Module = work_Schedule_Module;
		}

		public WebElement getLogout_Link() {
			return Logout_Link;
		}

		public void setLogout_Link(WebElement logout_Link) {
			Logout_Link = logout_Link;
		}

		
		
		
		//operational methods
		public void click_On_Tasks_Module()
		{
			Tasks_module.click();
		}
		
		public void click_On_Reports_Module()
		{
			Reports_Module.click();
		}
		public void click_On_Users_Module()
		{
			Users_Module.click();
		}
		public void click_On_Settings_Module()
		{
			Settings_Module.click();
		}
		public void click_On_Work_Schedule_Module()
		{
			Work_Schedule_Module.click();
		}
		public void logout()
		{
			Logout_Link.click();
		}


		

		

}
