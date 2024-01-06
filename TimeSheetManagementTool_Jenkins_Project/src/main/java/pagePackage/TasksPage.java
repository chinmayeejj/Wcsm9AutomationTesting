
package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage 
{
	//initialization
	
		@FindBy(partialLinkText = "Projects & Customers")
		private WebElement Projects_Customers_Sub_Module;
		@FindBy(xpath="//input[@value='Create New Customer']")
		private WebElement Create_New_Customer;
		@FindBy(xpath="//input[@value='Create New Project']")
		private WebElement Create_New_Project;
		
		@FindBy(xpath="//input[@name=\"name\"]") 
		private WebElement Customer_Name_TB;
		@FindBy(name = "createCustomerSubmit") 
		private WebElement Create_Customer_Button;
		@FindBy(name = "createProjectSubmit") 
		private WebElement Create_Project_Button;
		@FindBy(name="customerId") 
		private WebElement Customer_Dropdown;
		@FindBy(xpath="//input[@name='name']")
		private WebElement Project_Name_TB;
		
		//delete cutsomer
		@FindBy(xpath="(//td[@class='selectCustomer'])[1]")
		private WebElement First_Customer;
		@FindBy(xpath="//input[@value='Delete Selected']")
		private WebElement Delete_Selected_Customer_Button;
		@FindBy(xpath="//input[@value='Delete This Customer']")
		private WebElement Delete_Customer_Popup;
		
		
		public WebElement getFirst_Customer() {
			return First_Customer;
		}

		public WebElement getDelete_Selected_Customer_Button() {
			return Delete_Selected_Customer_Button;
		}

		public WebElement getDelete_Customer_Popup() {
			return Delete_Customer_Popup;
		}

		public WebElement getCustomer_Dropdown() {
			return Customer_Dropdown;
		}

		public WebElement getProject_Name_TB() {
			return Project_Name_TB;
		}

		//utilization
		public TasksPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getProjects_Customers_Sub_Module() {
			return Projects_Customers_Sub_Module;
		}

		public WebElement getCreate_New_Customer() {
			return Create_New_Customer;
		}

		public WebElement getCreate_New_Project() {
			return Create_New_Project;
		}

		public WebElement getCustomer_Name_TB() {
			return Customer_Name_TB;
		}

		public WebElement getCreate_Customer_Button() {
			return Create_Customer_Button;
		}

		public WebElement getCreate_Project_Button() {
			return Create_Project_Button;
		}
		
		//operational methods
		public void createProjectsAndCustomer(String customerName, String projectName)
		{
			Projects_Customers_Sub_Module.click();
			Create_New_Customer.click();
			Customer_Name_TB.sendKeys(customerName);
			Create_Customer_Button.click();
			Create_New_Project.click();
			Select sel=new Select(Customer_Dropdown);
			sel.selectByVisibleText(customerName);
			Project_Name_TB.sendKeys(projectName);
			Create_Project_Button.click();
			
		}
		
		public void deleteProjectAndCustomer()
		{
			Projects_Customers_Sub_Module.click();
			First_Customer.click();
			Delete_Selected_Customer_Button.click();
			Delete_Customer_Popup.click();
			
		}
		
		
		

}
