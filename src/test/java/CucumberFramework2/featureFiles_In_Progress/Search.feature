Feature: 1800Flowers Search Functionality

  Scenario:
    Given A validated user
    When User browse to the site
    And User navigates to the footer
    Then User clicks on sign-in to account
    Then User should be taken to the sign-in page
    Then User enters valid username
    Then User enters valid password
    Then User clicks on Sign-In
    Then User should be taken to home page
    Then User clicks on the search tab
    Then User searches for tulips
    Then User should land on the tulips page