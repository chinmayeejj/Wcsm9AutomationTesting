package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption 
{
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//single select
		driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/staticDropdown.html");
		
		WebElement dropdown=driver.findElement(By.id("id1"));
		Select sel=new Select(dropdown);
		
		sel.selectByValue("v3");
		
		//read the element which was selected first
		WebElement ele = sel.getFirstSelectedOption();
		String op = ele.getText();
		System.out.println(op);
		
		//
		driver.navigate().to("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/staticMultiSelectDropdown.html");
	
		WebElement dropdown2 = driver.findElement(By.id("id1"));
		
		Select sel2=new Select(dropdown2);
		for(int i=2;i<=3;i++)
		{
			sel2.selectByIndex(i);
			
		}
		System.out.println(sel2.getFirstSelectedOption().getText());
		
		
	}
}
