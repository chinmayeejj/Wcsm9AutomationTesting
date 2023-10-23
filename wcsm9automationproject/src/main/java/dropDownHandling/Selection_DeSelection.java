package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_DeSelection 
{
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
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		//De-select By index 
		for(int j=0;j<=2;j++)
		{
			Thread.sleep(2000);
			sel.deselectByIndex(j);
		}
		//select By Value
		Thread.sleep(2000);
		sel.selectByValue("v4");
		Thread.sleep(2000);
		//De-select By value
		sel.deselectByValue("v4");
		Thread.sleep(2000);
		//Select by VisibleText
		sel.selectByVisibleText("POHA");
		Thread.sleep(2000);
		//De-select by VisibleText
		sel.deselectByVisibleText("POHA");
		
		//select by index
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		//DeSelectAll 
		sel.deselectAll();
		
		
	}

}
