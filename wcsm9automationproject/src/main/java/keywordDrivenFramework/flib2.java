package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class flib2 
{
	public String readData(String excelPath, String property ) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");
		
		Properties prop =new Properties();
		
		prop.load(fis);
		
		String data= prop.getProperty(property);
		
		return data;
		
	}

}
