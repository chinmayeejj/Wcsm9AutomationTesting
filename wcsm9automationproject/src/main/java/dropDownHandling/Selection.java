package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		// Single Select Dropdown
		
//		//phone dropdown handling by using selectByIndex()
//		WebElement phoneDropDown = driver.findElement(By.xpath("//section[@class='flex gap-3']/descendant::select"));
//		Select sel = new Select(phoneDropDown);
//		sel.selectByIndex(2);
//		Thread.sleep(2000);
//		
//		//country dropdown handling by using selectByValue()
//		WebElement countryDropDown = driver.findElement(By.xpath("//label[.='Country']/following-sibling::select"));
//		Select sel1 = new Select(countryDropDown);
//		sel1.selectByValue("India");
//		Thread.sleep(2000);
//		
//		
//		//state dropdown handling by using selectByVisisbleText()
//		WebElement stateDropDown = driver.findElement(By.xpath("//label[.='State']/following-sibling::select"));
//		Select sel2 = new Select(stateDropDown);
//		sel2.selectByVisibleText("Uttar Pradesh");
//		Thread.sleep(2000);
			
		
		// Multi-select dropdown
		driver.findElement(By.linkText("Multi Select")).click();
		
		// country dropdown handling by using selectByIndex()
		WebElement countryDropDown2 = driver.findElement(By.xpath("//label[.='Country']/following-sibling::select"));

                        Select sel3 = new Select(countryDropDown2);
                        
                        // select multiple options from multiselect dropDown
                        for(int i=0;i<=3;i++)
                        {
                        	Thread.sleep(2000);
                        	sel3.selectByIndex(i);
                        }
 
 
 //			
//		for(WebElement ele:countryDropDown2)
//		{
//			Select sel3 = new Select(ele);
//			sel3.selectByIndex(3);
//			Thread.sleep(2000);
//			sel3.selectByIndex(1);
//		}
//		
//		Thread.sleep(3000);
//		
//		//state dropdown handling by using selectByValue()
//		List<WebElement> stateDropDown2 = driver.findElements(By.xpath("//label[.='State']/following-sibling::select"));
//			
//		for(WebElement ele1:stateDropDown2)
//		{
//			Select sel4 = new Select(ele1);
//			sel4.selectByValue("Karnataka");
//			Thread.sleep(2000);
//			sel4.selectByValue("Maharashtra");
//		}
//		
//		//city Dropdown  handling by using selectByVisibleText()
//		
//		List<WebElement> city = driver.findElements(By.xpath("//label[.='City']/following-sibling::select"));
//		
//		for(WebElement ele3:city)
//		{
//			Select sel5=new Select(ele3);
//			sel5.selectByVisibleText("Mumbai");
//			Thread.sleep(2000);
//			sel5.selectByVisibleText("Delhi");
//			
//		}

		
		
		
	}

}
