package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectAll {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/staticMultiSelectDropdown.html");
		
		//to handle the dropdown
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='multi']"));
		Select sel = new Select(dropdown); 
		Thread.sleep(2000);
		//select By Index
		for(int i=0;i<=3;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		sel.deselectAll();
		Thread.sleep(3000);
		driver.quit();

	}	

}
