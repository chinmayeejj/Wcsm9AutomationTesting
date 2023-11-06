package popUpHandlingPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuthenticationPopup 
{

	public static void main(String[] args) throws InterruptedException, AWTException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        String parentHandle = driver.getWindowHandle();

        driver.get("https://demoapps.qspiders.com/");
        driver.findElement(By.xpath("//section[.='Popups']")).click();
        driver.findElement(By.xpath("//section[.='Javascript']")).click();
        driver.findElement(By.xpath("//section[.='Authentication']")).click();
        
        Actions act =new Actions(driver);
        WebElement cred = driver.findElement(By.xpath("//b[.='admin']")); 
    	act.doubleClick(cred).perform();
		act.clickAndHold(cred).perform();
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_C);
		

        driver.findElement(By.partialLinkText("Login")).click();
        
        
        
        Set<String> allHandles = driver.getWindowHandles();
        for(String wh:allHandles)
        {
        	if(!parentHandle.equals(wh))
        	{
        		driver.switchTo().window(wh);
        	}
        }
        Thread.sleep(2000);        
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);
        Thread.sleep(3000);

        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);
      

        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
    }       
        
    }

