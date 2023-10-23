package assignment;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 
{

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Browser Value");
		
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);

		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
		}
		
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);

		}
		
		else
		{
			System.out.println("please enter valid browser value");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		search("Apple watch");
		result();
		productNth();
		allProdNames();
		
		
	}
	
	//Method1 to search the product
	public static void search(String product) throws InterruptedException
	{	
		WebElement searchD = driver.findElement(By.id("searchDropdownBox"));
		Select sel=new Select(searchD);
		sel.selectByVisibleText("Watches");
		Thread.sleep(2000);
	
		
		WebElement searchB = driver.findElement(By.id("twotabsearchtextbox"));
		searchB.sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
	}
	
	//method to read of all products
	public static void allProdNames()
	{
		System.out.println("All Watch Names ");
		List<WebElement> watchNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement watch:watchNames)
		{
			String op = watch.getText();
			System.out.println(op);
		}
		
		System.out.println();
		System.out.println();
	}
	
	//method to read Nth products
	public static void productNth()
	{
		WebElement watchNth = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		String op1=watchNth.getText();
		
		System.out.println("Watch at Nth Index position");
		System.out.println(op1);
		
		System.out.println();
		System.out.println();
	}
	
	//method to read the result
	public static void result()
	{
		WebElement res = driver.findElement(By.xpath(" //div[@class='a-section a-spacing-small a-spacing-top-small'] /descendant::span[contains(text(),'results for') ]"));
		String res1=res.getText();
		System.out.println("Number of Results");
		System.out.println(res1);
		System.out.println();
		System.out.println();
	}
}
