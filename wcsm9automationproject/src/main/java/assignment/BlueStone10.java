package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone10 
{
	public static void main(String[] args) throws InterruptedException
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.bluestone.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   

		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-name")).sendKeys("Chinmayee");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-email")).sendKeys("Chinmayee@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Start Chat']")).click();
		
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@placeholder='Reply here...']")).sendKeys("good Morning",Keys.ENTER);
		
		//driver.switchTo().defaultContent();
//		
//		WebElement greet = driver.findElement(By.xpath("//div[.='Good Evening.']"));
//		WebElement concern = driver.findElement(By.xpath("//div[.='May I know your concern please?']"));
//		
		WebElement reply = driver.findElement(By.xpath("//div[@class='fc-ui-unity-message-bubble ember-view']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(70));
		wait.until(ExpectedConditions.visibilityOf(reply));
		
		System.out.println(reply.getText());
		

		

		
	}

}
