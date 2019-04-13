Feature: 1800Flowers RadioOffer Functionality

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
    Then User clicks on RadioOffers tab
    Then User should be taken to page where user can enter valid code
    Then User is taken to special radio offers page