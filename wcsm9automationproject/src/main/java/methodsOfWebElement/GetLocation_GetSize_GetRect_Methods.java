package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect_Methods 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		Point loc=email.getLocation();
		int xaxix=loc.getX();
		int yaxis=loc.getY();
		System.out.println("x-axis "+xaxix+ "  y-xis "+yaxis);
		
		Dimension size =email.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println("height "+height+  "  width "+width);
		
		Rectangle r=email.getRect();
		int r1=r.height;
		int r2=r.width;
		System.out.println(r1 +"   "+r2);
		int x1=r.x;
		int y1=r.y;
		System.out.println(x1+ " "+y1);
		
		
		
		
		
	}

}
