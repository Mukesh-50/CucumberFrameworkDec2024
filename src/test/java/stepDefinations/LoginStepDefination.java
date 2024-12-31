package stepDefinations;

import org.junit.Assert;

import factory.BrowserFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefination  {
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	
	@Given("User is able to access the application")
	public void user_is_able_to_access_the_application() 
	{
		loginPage=new LoginPage(BrowserFactory.getDriver());
		
		homePage=new HomePage(BrowserFactory.getDriver());
	}

	@When("User enters {string} in the email field")
	public void user_enters_in_the_email_field(String email) 
	{
	    loginPage.typeUsername(email);
	}

	@And("User enter {string} in password field")
	public void user_enter_in_password_field(String pass) 
	{
	   loginPage.typePassword(pass);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    loginPage.clickOnLoginButton();
	}

	@Then("User should be able to access dashboard")
	public void user_should_be_able_to_access_dashboard()
	{    
		Assert.assertTrue(homePage.isManageDisplayed());
	}

}
