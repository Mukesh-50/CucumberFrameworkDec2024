package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By manageOption=By.xpath("//span[normalize-space()='Manage']");
	
	public boolean isManageDisplayed()
	{
		return driver.findElement(manageOption).isDisplayed();
	}
}
