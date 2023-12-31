package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone5
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
		List<WebElement> lowToHigh=driver.findElements(By.xpath("//span[@class='new-price']"));
		 for(WebElement price:lowToHigh)
		 {
			 System.out.println(price.getText());
		 }
		Thread.sleep(2000);
		
		boolean res = isSame(defPrice, lowToHigh);
		System.out.println(res);

		
	}
		
		
		
		public static boolean isSame(List<WebElement> defPrice, List<WebElement>  lowToHigh)
		{
			System.out.println();
			for(WebElement price:defPrice)
			{
				String p1 = price.getText();
		        boolean foundMatch = false;
				for(WebElement price1:lowToHigh)
				{
					String p2=price1.getText();
					if(!(p1.equalsIgnoreCase(p2)))
					{
						foundMatch = true;
		                break;  // Exit the inner loop once a match is found

					}
					else
					{
						return false;
					}
				}
			}
			return true;
		}
		
		
		

		
		

}
