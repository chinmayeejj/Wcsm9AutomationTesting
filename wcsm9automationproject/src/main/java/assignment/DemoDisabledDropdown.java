package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDisabledDropdown 
{
	public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoapps.qspiders.com/");

        driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
        driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
        driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("4");
        driver.findElement(By.xpath("//button[.='Start']")).click();
        WebElement dropDown = driver.findElement(By.xpath("//option[.='Select your answer']"));

        // Use an explicit wait for the dropdown to become visible
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[.='Select your answer']")));
        Thread.sleep(7000);
        // Perform any action on the dropdown after it becomes visible
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("arguments[0].click()",dropDown);

        // Close the WebDriver when done
        //driver.quit();
    }


}
