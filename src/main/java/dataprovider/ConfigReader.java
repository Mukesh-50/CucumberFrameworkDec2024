package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	public static String getProperty(String key)
	{
		String value=null;
		
		Properties pro=new Properties();
		
		try 
		{
			pro.load(new FileInputStream(new File("./configuration/config.properties")));
			
			value=pro.getProperty(key);
			
		} catch (FileNotFoundException e) 
		{
			System.out.println("FIle Not Found "+e.getMessage());
			
		} catch (IOException e) 
		{
			System.out.println("Something Went Wrong "+e.getMessage());
		}
	
		return value;
	}
	
	
}
