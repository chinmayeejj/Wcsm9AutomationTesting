package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement 
{
	public static void main(String[] args) {
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[.='Enabled Mode']")).click();
		driver.findElement(By.xpath("//p[.='Disabled Mode']")).click();
		driver.findElement(By.xpath("//li[.='With placeholder']"));

		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('name').value='Chinmayee'");
		jse.executeScript("document.getElementById('email').value='chinmayeejakate@gmail.com'");
		jse.executeScript("document.getElementById('password').value='Chinmayee1234'");
		
		WebElement disRegButton = driver.findElement(By.xpath("//button[.='Register']"));
		
		//verifying register button is there or not
		if(disRegButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()",disRegButton);
			System.out.println("clicked");
		}
		else
		{
			System.out.println("Not clicked");

		}
		
		//click on login by using javaScript executor
		
		jse.executeScript("arguments[o].click()",driver.findElement(By.xpath("//a[@type='button']")));

		
}
}
