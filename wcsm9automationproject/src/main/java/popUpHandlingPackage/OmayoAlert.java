package popUpHandlingPackage;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoAlert 
{
	public static void main(String[] args) throws InterruptedException, AWTException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://omayo.blogspot.com/");
        
        driver.findElement(By.id("alert1")).click();
        
        Thread.sleep(2000);
        
        //handle alert popup by switching the control
        Alert al = driver.switchTo().alert(); //return type Actions Interface
        
        //accepts the popup
       // al.accept();

        //get the text of alert popup
        System.out.println(al.getText());
        
        //dismiss the popup
        al.dismiss();
    }
        
       
}
