package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		//single select phone dropdown
		WebElement phoneDropDown = driver.findElement(By.xpath("//section[@class='flex gap-3']/descendant::select"));
		Select sel = new Select(phoneDropDown);
		
		//read all the options from Phone number dropdown
		List<WebElement> allOpt = sel.getOptions();
		for(int i=0;i<allOpt.size();i++)
		{
			String opt=allOpt.get(i).getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}
		System.out.println();
		
	    WebElement city = driver.findElement(By.xpath("//label[.='City']/following-sibling::select"));
	    Select sel2 = new Select(city);
		
		//read all the options from city dropdown
		List<WebElement> allCity = sel2.getOptions();
		for(WebElement city1:allCity)
		{
			String opt1=city1.getText() ;
			Thread.sleep(2000);
			System.out.println(opt1);
			
		}
	    

		
	}

}
