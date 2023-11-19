package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// up-casting is performed to access the method from WebDriver interface
		WebDriver driver=new ChromeDriver(); 
		
		//to maximize the browser window
		driver.manage().window().maximize();

		System.out.println("Chrome brower is launched");
		
		//to delay the closing
		Thread.sleep(2000); // method from Thread class of java
		
		
		driver.close(); // method from WebDriver interface
		System.out.println("Closed");
		
	}

}
