package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetTitleMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		//to launch firefox browser
		WebDriver	driver = new FirefoxDriver();	
		//to maximize the window size
		driver.manage().window().maximize();
		//to launch the web application
		driver.get("https://www.netflix.com/in/");
		//to delay the time
		Thread.sleep(4000);
		
	//	String title = driver.getTitle();
	//	System.out.println(title);
		//to get the title of that respective page
		System.out.println(driver.getTitle());
		
		driver.close();
	
	}
	

}
