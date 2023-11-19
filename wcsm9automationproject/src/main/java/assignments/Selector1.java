package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		
		driver.findElement(By.cssSelector("input[class$='orangehrm-firstname']")).sendKeys("Chinmayee");

		driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active orangehrm-middlename']"));

				driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active orangehrm-firstname']"));		
	}

}
