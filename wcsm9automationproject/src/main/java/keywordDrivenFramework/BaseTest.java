package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant
{
   
	static WebDriver driver;
	
	//method to open a browser
	public void openBrowser() throws IOException
	{
		 Flib flib=new Flib();
			
		    String browserName=flib.readDataFromProperty(PROP_PATH, "browser1");
		    String url=flib.readDataFromProperty(PROP_PATH, "url");
		    
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("invalid browser value!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
