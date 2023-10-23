package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//single select
		driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/staticDropdown.html");
				
		WebElement dropdown=driver.findElement(By.id("id1"));
		Select sel=new Select(dropdown);
		WebElement option = sel.getWrappedElement();
		System.out.println(option.getText());
	}

}
