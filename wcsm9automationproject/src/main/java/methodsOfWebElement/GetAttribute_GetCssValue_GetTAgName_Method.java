package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_GetCssValue_GetTAgName_Method 
{
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		System.out.println("USERNAME TEXTFIELD");
		System.out.println("class value: "+usnTB.getAttribute("class"));
		System.out.println("color:  "+usnTB.getCssValue("color"));
		System.out.println("tag name:  "+usnTB.getTagName());
		System.out.println();
		
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println("LOGIN BUTTON");
		System.out.println("class name:  "+loginButton.getAttribute("class"));
		System.out.println("height:  "+loginButton.getCssValue("height"));
		System.out.println("tag Name:  "+loginButton.getTagName());
	}

}
