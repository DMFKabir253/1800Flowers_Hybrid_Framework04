Feature: 1800flowers Login Functionality

Background:
    Given Not a validated user
    When User browse to the site4
    And User navigates to the footer4
    Then User clicks on sign-in to account4 
    Then User should be taken to the sign-in page4
    
    Scenario Outline: 1. Login with valid username and valid password
    When User enter user email as "<EmailAddress>"
    And User enter user password as "<Password>" 
    And User clicks on Sign-In button
    Then 1800flowers home page should display 
   	Examples:
      |EmailAddress                      |Password       |
      |dewankabir100@gmail.com           |Aa01920532258@ |
      |dfkabir253@gmail.com              |Aa01920532258@ | 
      
   Scenario Outline: 2. Login with invalid username or invalid password
    When User enter user email as "<email>"
    And User enter user password as "<password>"
    And User clicks on Sign-In
    Then Login error message should display
    Examples:
      |email                             |password       |
      |xyz123@gmail.com                  |Aa01673128743@ |
      |dfkabir253@gmail.com              |Xyz123!!       |
      
      Scenario: 5. Forget Password Functionality
    When User click the Forget Password Link
    Then Forget Password page should display
    When When User enter user email as "dewankabir100@gmail.com"
    And Click the submit button
    Then Thankyou page should display
    
    