package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethod 
{
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/staticMultiSelectDropdown.html");
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='id1']/option"));
		
		Thread.sleep(2000);
		
		//By using for each Loop
//      for(WebElement op1:options)
//	    {
//	    	String  op=op1.getText();
//			if(op.equalsIgnoreCase("poha")||op.equalsIgnoreCase("shira"))
//			{
//				op1.click();
//			}
//			else if(op.equalsIgnoreCase("dosa"))
//			{
//				op1.click();
//			}
//			Thread.sleep(2000);
//
//		}
	    	//use for loop	
	  		for(int i=0;i<options.size();i++)
	  		{
	  			String option=options.get(i).getText();
	  			if(option.equalsIgnoreCase("poha")||option.equalsIgnoreCase("DOSA"))
	  			{
	  				options.get(i).click();
	  			}
	  			Thread.sleep(2000);
	  		}

}
}
