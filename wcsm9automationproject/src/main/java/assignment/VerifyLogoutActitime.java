package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogoutActitime 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://laptop-89brlgsi/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		
		WebElement logoutLink=driver.findElement(By.xpath("//a[.='Logout']"));
		
		boolean res=logoutLink.isDisplayed();
		
		System.out.println(logoutLink.getText()+ " is displaying on webpage");
		
	}

}
