package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/chinm/OneDrive/Desktop/wcsm9html/staticMultiSelectDropdown.html");	
		
		
		WebElement dropdown = driver.findElement(By.id("id1"));
		Select sel=new Select(dropdown);
		
		List<WebElement> allOptions = sel.getOptions();
	
		//to eliminTE DUPLICATE we need to use HashSet
		HashSet<String> hs=new HashSet<String>();
		TreeSet<String> ts=new TreeSet<String>();
		
		
		//to eliminate
		for(int i=0;i<allOptions.size();i++)
		{
			String op=allOptions.get(i).getText();
			System.out.println(op);
			
			
			//add the text to the hashSet and remove duplicates from dropdown
			hs.add(op);
			//add the text to the TreeSet and remove duplicates from dropdown
			ts.add(op);
			
			
		}
		System.out.println();
		
		//read the options from hashset
		
		for(String opt:hs)
		{
			System.out.println(opt);
			Thread.sleep(2000);
		}
		System.out.println();
		
		//read the options from TreeSet
		for(String opt:ts)
		{
			System.out.println(opt);
			Thread.sleep(2000);
		}
		
	
		

		


}}
