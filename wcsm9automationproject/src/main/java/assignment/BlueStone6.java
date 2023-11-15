package assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.id("denyBtn")).click();
		
		//to perform mouse hover
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		WebElement rings = driver.findElement(By.xpath("//li[@class='menuparent repb']/descendant::a[text()='Rings ']"));
		act.moveToElement(rings).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		
		//default prices
		System.out.println("Default price list");
		 List<WebElement> defPrice = driver.findElements(By.xpath("//span[@class='new-price']"));
		 for(WebElement price:defPrice)
		 {
			 System.out.println(price.getText());
		 }
		Thread.sleep(2000);
		
		//low to high
		System.out.println();
		System.out.println("Price list Low to high");
		WebElement popular = driver.findElement(By.xpath("//span[.=' Popular ']"));
		act.moveToElement(popular).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> pList=new ArrayList<String>();
		List<WebElement> lowToHigh=driver.findElements(By.xpath("//span[@class='new-price']"));
		 for(WebElement price:lowToHigh)
		 {
			 System.out.println(price.getText());
			 String txt = price.getText();
			 pList.add(txt);
		 }
		 
//		 for(int i=0;i<pList.size();i++)
//		 {
//			 Strin
//		 }
	}

}
