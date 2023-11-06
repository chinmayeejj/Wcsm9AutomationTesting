package popUpHandlingPackage;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddlenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException, AWTException
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("//span[.='✕']")).click();
    }

}
