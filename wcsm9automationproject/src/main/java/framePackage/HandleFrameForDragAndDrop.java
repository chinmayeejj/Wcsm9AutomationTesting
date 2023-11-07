package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrameForDragAndDrop 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.jqueryui.com/droppable");
		
		// draggable and droppable elements are designed under frame 
		   // handle frame by switches controls to frame
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	//	driver.switchTo().frame(0); // by using index value
		driver.switchTo().frame(frameElement); // by using webelement 
		Thread.sleep(2000);
		
		//perform drag and drop action
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(draggable, droppable).perform();
	}

}
