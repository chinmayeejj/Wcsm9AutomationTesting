package popUpHandlingPackage;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup 
{
	public static void main(String[] args) throws InterruptedException, AWTException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoapps.qspiders.com/");
        
        driver.findElement(By.xpath("//section[.='Popups']")).click();
        driver.findElement(By.xpath("//section[.='Javascript']")).click();
        driver.findElement(By.xpath("//a[.='Prompt']")).click();
        Thread.sleep(2000);
        
        //it generates confirmation popup
        driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
        Thread.sleep(2000);

        //handle Confirmation popup by switching the control
        Alert pro = driver.switchTo().alert(); //return type Actions Interface
        Thread.sleep(2000);
        
        
        //to pass the YES
        pro.sendKeys("yes");
        Thread.sleep(2000);
        
        //get the text of alert popup
        System.out.println(pro.getText());
        Thread.sleep(2000);

        
        //accepts the popup
        pro.accept();
        
        Thread.sleep(4000);
       // driver.close();

        
        
    }

}
