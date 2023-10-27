package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		
		WebElement mCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement lCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement lCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement mobBox = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement lapBox = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));

		
		Actions act=new Actions(driver);
		act.dragAndDrop(mCharger,mobBox).perform();
		Thread.sleep(2000);
		act.dragAndDrop(mCover,mobBox).perform();
		Thread.sleep(2000);
		act.dragAndDrop(lCharger,lapBox).perform();
		Thread.sleep(2000);
		act.dragAndDrop(lCover,lapBox).perform();



		
		
		
		
	
	}
}
