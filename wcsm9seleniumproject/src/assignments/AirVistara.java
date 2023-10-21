package assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//to close popup
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("--disable-notifications");
	    
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Select Departure City']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Select Arrival City']")).sendKeys("Mumbai");
		
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.id("departCalendarDiv")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-date='24']")).click();
		//driver.findElement(By.id("return-radio")).click();
		driver.findElement(By.cssSelector("a[data-date='27']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("passengers")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Button[value='business']")).click();
		//driver.findElement(By.cssSelector("Button[class='bu_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Button[class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("book-flight-widget")).click();
		
	}

}
