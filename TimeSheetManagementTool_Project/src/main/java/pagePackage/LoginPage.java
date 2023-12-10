package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//to initialize w.e in 1 way right click->source->constructor from fields
		@FindBy(name="username") private WebElement usnTB;
		@FindBy(name="pwd") private WebElement passTB;
		@FindBy(id="loginButton") private WebElement loginButton;
		@FindBy(name="remeber") private WebElement keepMeLoggedInCheckBox;
		@FindBy(partialLinkText="Actimin") private WebElement actiMindLink;
		@FindBy(partialLinkText = "License") private WebElement licenseLink;
		
		//initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization


		public WebElement getUsnTB() {
			return usnTB;
		}

		public void setUsnTB(WebElement usnTB) {
			this.usnTB = usnTB;
		}

		public WebElement getPassTB() {
			return passTB;
		}

		public void setPassTB(WebElement passTB) {
			this.passTB = passTB;
		}

		public WebElement getKeepMeLoggedInCheckBox() {
			return keepMeLoggedInCheckBox;
		}

		public void setKeepMeLoggedInCheckBox(WebElement keepMeLoggedInCheckBox) {
			this.keepMeLoggedInCheckBox = keepMeLoggedInCheckBox;
		}

		public WebElement getActiMindLink() {
			return actiMindLink;
		}

		public void setActiMindLink(WebElement actiMindLink) {
			this.actiMindLink = actiMindLink;
		}

		public WebElement getLicenseLink() {
			return licenseLink;
		}

		public void setLicenseLink(WebElement licenseLink) {
			this.licenseLink = licenseLink;
		}

		public void setLoginButton(WebElement loginButton) {
			this.loginButton = loginButton;
		}
		
		//Operational Methods
		
		public void validLogin(String validusn, String validpwd)
		{
				usnTB.sendKeys(validusn);
				passTB.sendKeys(validpwd);
				loginButton.click();
			
		}
		
		public void invalidLogin(String invalidusn,String invalidpwd) throws InterruptedException
		{
			usnTB.sendKeys(invalidusn);
			passTB.sendKeys(invalidpwd);
			loginButton.click();
			usnTB.clear();
			
		}
		
		


}
