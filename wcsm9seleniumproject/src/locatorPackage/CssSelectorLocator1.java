package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button[class^='oxd-button']")).click();
		//driver.findElement(By.cssSelector("button[class$='orangehrm-login-button']")).click();
		//driver.findElement(By.cssSelector("button[class*='oxd-button--main']")).click();
		
        //driver.findElement(By.cssSelector("i[class='oxd-icon bi-chevron-right']")).click();
		//driver.findElement(By.cssSelector("a[class='class=\"oxd-main-menu-item active toggle\']")).click();
		driver.quit();
	}

}
