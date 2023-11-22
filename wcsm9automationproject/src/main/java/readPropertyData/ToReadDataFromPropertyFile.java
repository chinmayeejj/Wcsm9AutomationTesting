package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import keywordDrivenFramework.Flib;

public class ToReadDataFromPropertyFile 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browser2 = prop.getProperty("browser2");
		System.out.println(browser2);
		
		Flib flib = new Flib();
		
	    String	pass=flib.readDataFromProperty("./src/main/resources/config.properties", "password");
	    System.out.println(pass);
		
		
	}

}
