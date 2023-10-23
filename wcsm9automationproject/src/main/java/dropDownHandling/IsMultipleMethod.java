package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

		
		//single select Dropdown
		WebElement phoneDropDown = driver.findElement(By.xpath("//section[@class='flex gap-3']/descendant::select"));
		Select sel = new Select(phoneDropDown);
		
		//identify dropdown is single or multiple
		System.out.println(sel.isMultiple());
		Thread.sleep(2000);
		
		//Multi Select DropDown
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement stateDropDown = driver.findElement(By.xpath("//label[.='State']/following-sibling::select"));
		Select sel2=new Select(stateDropDown);
		
		//identify dropdown is single or multiple
		System.out.println(sel2.isMultiple());

	}

}
