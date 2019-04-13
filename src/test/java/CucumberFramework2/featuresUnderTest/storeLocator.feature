Feature: 1800Flowers Store Locator Functionality

  Scenario:
    Given A validated user9 
    When User browse to the site9
    And User navigates to the footer9
    Then User clicks on sign-in to account9
    Then User should be taken to the sign-in page9
    Then User enters valid username9
    Then User enters valid password9
    Then User clicks on Sign-In9 
    Then User should be taken to home page9
    Then User should be able to click the store locator button
    Then User should land on the store locator page
    Then User enters zipcode
    Then User clicks on Find
    Then User should be landing on results page
    Then User clicks on the desired location
    Then User should be taken to the location information page