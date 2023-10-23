package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActitimeCheckbox 
{
	
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-89brlgsi/login.do");
		
		WebElement checkBox = driver.findElement(By.name("remember"));
		
		boolean s1 = checkBox.isSelected();
		if(s1==true)
		{
			System.out.println(s1+ " ==> Check box is selected");
		}
		else
			System.out.println(s1+ " ==> Check box is NOT selected");
		
		System.out.println();
		
		//now select the checkbox
		checkBox.click();
		boolean s2 = checkBox.isSelected();
		if(s2==true)
		{
			System.out.println(s2+ " ==> Check box is selected");
		}
		else
			System.out.println(s2+ " ==> Check box is NOT selected");
		
	}

}
