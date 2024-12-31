Feature: As a admin user, I should be able to login 

	@Smoke
  Scenario: User should be able to login with valid credentails
    Given User is able to access the application
    When User enters "admin@email.com" in the email field
    And User enter "admin@123" in password field
    And User clicks on login button
    Then User should be able to access dashboard
    