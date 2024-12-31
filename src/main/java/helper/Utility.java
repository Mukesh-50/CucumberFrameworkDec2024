package helper;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	
	public static byte[] captureScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		/*
		 * Base64 - String
		 * File - File
		 * Byte - Byte[]
		 * 
		 */
		
		byte[]arr= ts.getScreenshotAs(OutputType.BYTES);
		
		return arr;
	}
	

}
