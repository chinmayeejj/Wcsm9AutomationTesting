package popUpHandlingPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch Actitime
		driver.get("http://laptop-89brlgsi/login.do");
		
		Actions act=new Actions(driver);
		
		//Login to actitime
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//double click on settings module
		WebElement settings = driver.findElement(By.xpath("//div[@class='label' and .='Settings']"));//no need of doublr click find right xpath
		act.doubleClick(settings).perform();
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(2000);
		
		//double click on choose  file button
		WebElement chooseFile = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		act.doubleClick(chooseFile).perform();
		
		Thread.sleep(2000);
		
		//To handle the pop-up window 
		Robot robot= new Robot();
		for(int i=1;i<=3;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_TAB);
		}

		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//again opening the window
		
		for(int i=1;i<=4;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_TAB);
		}

		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
