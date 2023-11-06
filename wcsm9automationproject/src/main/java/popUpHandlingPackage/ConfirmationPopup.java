package popUpHandlingPackage;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup 
{
	public static void main(String[] args) throws InterruptedException, AWTException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoapps.qspiders.com/");
        
        driver.findElement(By.xpath("//section[.='Popups']")).click();
        driver.findElement(By.xpath("//section[.='Javascript']")).click();
        driver.findElement(By.partialLinkText("Confirm")).click();
        Thread.sleep(2000);
        
        //it generates confirmation popup
        driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
        Thread.sleep(2000);

        //handle Confirmation popup by switching the control
        Alert confirm = driver.switchTo().alert(); //return type Actions Interface
        
        //get the text of confirmation popup
        System.out.println(confirm.getText());
        
        //accepts the popup
        confirm.accept();
        
        //again click on popup for dismiss method
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
        Thread.sleep(1000);
        confirm.dismiss();
        
        
        Thread.sleep(4000);
        driver.close();

        
        
    }
	

}
