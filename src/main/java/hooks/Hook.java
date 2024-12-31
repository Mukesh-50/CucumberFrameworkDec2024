package hooks;

import org.openqa.selenium.WebDriver;

import dataprovider.ConfigReader;
import factory.BrowserFactory;
import helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
	
	public WebDriver driver;
	
	@Before
	public void startSession()
	{
		System.out.println("LOG:INFO - Running Before Hook- Creating Browser Session");
		
		driver=BrowserFactory.startBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
	}

	@After
	public void closeSession()
	{
		System.out.println("LOG:INFO - Running After Hook- Deleting Browser Session");
		driver.quit();
	}
	
	@AfterStep
	public void tearDown(Scenario scenario)
	{
		
		
		if(scenario.isFailed())
		{
			System.out.println("LOG:INFO - Running AfterStep Hook- Step Failed - Capturing Screenshot");
			System.out.println("LOG:INFO - Adding Screenshot To The Report");
			
			byte []arr=Utility.captureScreenshot(driver);
			
			scenario.attach(arr, "image/png", scenario.getName());
		}
		
	}
	
}
