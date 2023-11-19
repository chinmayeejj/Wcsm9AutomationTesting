package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		// to launch the edge drive need to create obj of edgeDriver class
         WebDriver driver=new EdgeDriver();
         driver.manage().window().maximize();
         

 		System.out.println("Launched");
 		
         Thread.sleep(2000);
		
		driver.close();
		System.out.println("Closed");
		

	}

}
