package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-89brlgsi/login.do");
		
		WebElement checkBox = driver.findElement(By.name("remember"));
		//verify remember me check box
		//before selecting
		boolean s1 = checkBox.isSelected(); 
		System.out.println(s1);
		
		//after selecting
		checkBox.click();
		boolean s2 = checkBox.isSelected(); 
		System.out.println(s2);
		
	
	}
}
