package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 //
	Navigation nav = driver.navigate();
	
	// to launch application using navigate
	nav.to("https://omayo.blogspot.com/");
	Thread.sleep(3000);
	
	 //to perform backward operation
	nav.back();
	Thread.sleep(3000);

	
	//to perform forward operation
	nav.forward();
	Thread.sleep(3000);

	
	//to perform refresh operation 
	nav.refresh();	
	Thread.sleep(3000);
	driver.close();
	}

}
