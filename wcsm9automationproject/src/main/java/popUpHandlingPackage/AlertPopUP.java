package popUpHandlingPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUP 
{
	public static void main(String[] args) throws InterruptedException, AWTException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoapps.qspiders.com/");
        
        driver.findElement(By.xpath("//section[.='Popups']")).click();
        driver.findElement(By.xpath("//section[.='Javascript']")).click();
        Thread.sleep(2000);
        
        //it generates alert popup
        driver.findElement(By.xpath("//button[.='Alert Box']")).click();
        Thread.sleep(2000);

        //handle alert popup by switching the control
        Alert al = driver.switchTo().alert(); //return type Actions Interface
        
        //get the text of alert popup
        System.out.println(al.getText());
        
        //accepts the popup
        al.accept();
       
        
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

        

    }

}
