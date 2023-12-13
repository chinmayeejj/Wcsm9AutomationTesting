package pagePackage;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;

public class UsersPage 
{
	static WebDriver driver;
	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement Create_New_User_Button;
	
	@FindBy(xpath="//tr/td/input[@name=\"username\"]")
	private WebElement UsernameTB_UsersPage;
	@FindBy(name="passwordText")
	private WebElement PasswordTB_UsersPage;
	@FindBy(name="passwordTextRetype")
	private WebElement ReWrite_pass_TB;
	@FindBy(name="firstName")
	private WebElement First_Name_TB;
	@FindBy(name="lastName")
	private WebElement Last_NameTB;
	@FindBy(xpath = "//input[@name='workdayDurationStr']")
	private WebElement WorkDay_Duration_TB;
	@FindBy(xpath = "//input[@name='overtimeTracking']")
	private WebElement OverTime_Tracking_CheckBox;
	@FindBy(xpath = "//input[@name='overtimeTrackingLevel' and @id='overtimeTrackingLevel_ReadOnly' ]")
	private WebElement Tracking_Radio_Button2;
	@FindBy(xpath = "//img[@id=\"ext-gen7\"]")
	private WebElement Calender_Icon;
	@FindBy(name="ext-gen84")
	private WebElement Ok_Calender_Button;
	@FindBy(xpath="//span[text()='22']")
	private WebElement Date;
	
	@FindBy(xpath="//input[@id='right9']")
	private WebElement CheckBox1;
	@FindBy(xpath="//input[@id='right12']")
	private WebElement CheckBox2;
	@FindBy(xpath="//input[@id='right2']")
	private WebElement CheckBox3;
	@FindBy(xpath="//input[@id='right13']")
	private WebElement CheckBox4;
	@FindBy(xpath="//input[@id='right1']")
	private WebElement CheckBox5;
	@FindBy(xpath="//input[@id='right5']")
	private WebElement CheckBox6;
	@FindBy(xpath="//input[@id='right7']")
	private WebElement CheckBox7;
	
	@FindBy(xpath="//tbody/tr/td/input[@value='   Create User   ']")
	private WebElement Create_User_Button;
	
	//delete user elements
	@FindBy(xpath="(//td[.='enabled'])[1]") 
	private WebElement To_Desable;
	@FindBy(xpath="(//td[@class='listtblcell'])[1]")
	private WebElement Users_Name_Link;
	@FindBy(xpath="//input[@value='Delete This User']")
	private WebElement Delete_This_User_Button;
	

	
	

	//utilization
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreate_New_User_Button() {
		return Create_New_User_Button;
	}

	public WebElement getUsernameTB_UsersPage() {
		return UsernameTB_UsersPage;
	}

	public WebElement getPasswordTB_UsersPage() {
		return PasswordTB_UsersPage;
	}

	public WebElement getReWrite_pass_TB() {
		return ReWrite_pass_TB;
	}

	public WebElement getFirst_Name_TB() {
		return First_Name_TB;
	}

	public WebElement getLast_NameTB() {
		return Last_NameTB;
	}

	public WebElement getWorkDay_Duration_TB() {
		return WorkDay_Duration_TB;
	}

	public WebElement getOverTime_Tracking_CheckBox() {
		return OverTime_Tracking_CheckBox;
	}

	public WebElement getTracking_Radio_Button2() {
		return Tracking_Radio_Button2;
	}

	public WebElement getCalender_Icon() {
		return Calender_Icon;
	}

	public WebElement getOk_Calender_Button() {
		return Ok_Calender_Button;
	}

	public WebElement getCheckBox1() {
		return CheckBox1;
	}

	public WebElement getCheckBox2() {
		return CheckBox2;
	}

	public WebElement getCheckBox3() {
		return CheckBox3;
	}

	public WebElement getCheckBox4() {
		return CheckBox4;
	}

	public WebElement getCheckBox5() {
		return CheckBox5;
	}

	public WebElement getCheckBox6() {
		return CheckBox6;
	}

	public WebElement getCheckBox7() {
		return CheckBox7;
	}

	public WebElement getCreate_User_Button() {
		return Create_User_Button;
	}
	
 
	public WebElement getDate() {
		return Date;
	}
	public WebElement getTo_Desable() {
		return To_Desable;
	}

	public WebElement getUsers_Name_Link() {
		return Users_Name_Link;
	}

	public WebElement getDelete_This_User_Button() {
		return Delete_This_User_Button;
	}

	

	//operational_ Method
	public void create_New_User(String username,String pass,String F_name,String L_name,String w_duration) throws InterruptedException
	{
		Create_New_User_Button.click();
		Thread.sleep(2000);
		UsernameTB_UsersPage.sendKeys(username);
		PasswordTB_UsersPage.sendKeys(pass);
		ReWrite_pass_TB.sendKeys(pass);
		First_Name_TB.sendKeys(F_name);
		Last_NameTB.sendKeys(L_name);
		Thread.sleep(2000);
		WorkDay_Duration_TB.clear();
		WorkDay_Duration_TB.sendKeys(w_duration);
		Thread.sleep(2000);
		OverTime_Tracking_CheckBox.click();
		Tracking_Radio_Button2.click();
		Calender_Icon.click();
		Date.click();
		Thread.sleep(2000);

		
		
		
		//Ok_Calender_Button.click();
		CheckBox1.click();
		Thread.sleep(2000);
		CheckBox2.click();
		Thread.sleep(2000);
		CheckBox3.click();
		Thread.sleep(2000);
		//CheckBox4.click();
		Thread.sleep(2000);
		CheckBox5.click();
		Thread.sleep(2000);
		CheckBox6.click();
		Thread.sleep(2000);
		CheckBox7.click();
		
		Create_User_Button.click();
	}
	
	public void deleteUser() throws InterruptedException, AWTException
	{
		
		Users_Name_Link.click();
		Delete_This_User_Button.click();
		Thread.sleep(2000);
     	WorkLib wlb=new WorkLib();
//		wlb.acceptConfirmationPopUp();
     	wlb.hitEnterButtonMethod();
	  
		
	}
	

}
