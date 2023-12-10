package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
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
		
		//to read all selected options from the list
		List<WebElement> allOpt = sel.getAllSelectedOptions();
		
				for(WebElement opt:allOpt)
				{
					String opt1 = opt.getText();
					Thread.sleep(2000);
					System.out.println(opt1);
			}
				Thread.sleep(3000);
				driver.quit();
		
		

}
}
