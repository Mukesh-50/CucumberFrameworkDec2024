package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@id='email1']");
	
	By password=By.xpath("//input[@id='password1']");
	
	By loginButton=By.xpath("//button[normalize-space()='Sign in']");
	
	public void typeUsername(String email)
	{
		driver.findElement(username).sendKeys(email);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
}
