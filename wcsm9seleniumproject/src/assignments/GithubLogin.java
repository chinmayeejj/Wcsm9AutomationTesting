package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://github.com/login");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("login_field")).sendKeys("Chinmayeejj");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("password")).sendKeys("Chinmayee555");
	    
	
		
	}

}
