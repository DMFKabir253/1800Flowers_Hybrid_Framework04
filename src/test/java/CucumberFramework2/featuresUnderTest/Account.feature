Feature: Account Page Functionality





Background: 
    Given A validated user 
    When User browse to the site
    And User navigates to the footer
    Then User clicks on sign-in to account
    Then User should be taken to the sign-in page
    Then User clicks on account tab
    Then User should land on account page
    
    Scenario: 1. Change Telephone number
    When User clicks on Billing Address
    And User clicks edit
    And User changes the telephone number
    Then User clicks the save button
    Then User should get confirmation message
   	
      
   Scenario: 2. User wants to get exclusive discounts
    When User clicks on Billing address
    And User clicks on edit
    And User should be taken to billing Information page
    Then User clicks the checkbox to sign up for exclusive discounts
    Then User clicks the save button
    Then User should get confirmation message
   
      
    