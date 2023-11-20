package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib2 
{
	public String readData(String propertyPath, String key ) throws IOException
	{
		FileInputStream fis=new FileInputStream(propertyPath);
		
		Properties prop =new Properties();
		
		prop.load(fis);
		
		String data= prop.getProperty(key);
		
		return data;
		
	}

}
