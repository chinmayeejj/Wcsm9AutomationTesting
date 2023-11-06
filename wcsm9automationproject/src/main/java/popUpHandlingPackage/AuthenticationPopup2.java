package popUpHandlingPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class AuthenticationPopup2 
	{

		public static void main(String [] args) throws InterruptedException, AWTException 
		{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		Thread.sleep(2000);
		String aut_pagewindow=driver.getWindowHandle();//basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Set<String> allwindowhandle=driver.getWindowHandles();
		for(String wh:allwindowhandle)
		{
				if(!aut_pagewindow.equals(wh))
						{
							driver.switchTo().window(wh);
						}
		}
		logincred();
		}
		public static void logincred() throws AWTException
		{
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			
		}
	}


