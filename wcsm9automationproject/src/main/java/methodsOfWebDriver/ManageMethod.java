package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();	
		//handle the properties of browser
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//minimize
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		//fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		//set size(length and width
		Dimension targetSize = new Dimension(450,300);
		driver.manage().window().setSize(targetSize);	
		Thread.sleep(3000);
		
		//set position(x-y axis)
		Point targetPosition=new Point(350,250);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(2000);
		
	
	}

}
