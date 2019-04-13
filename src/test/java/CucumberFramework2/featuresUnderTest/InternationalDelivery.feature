Feature: International Delivery Functionality





Background: 
    Given A validated user3
    When User browse to the site3
    And User navigates to the footer3
    Then User clicks on sign-in to account3 
    Then User should be taken to the sign-in page3
    Then User enters username3
    Then User enters Password3
    Then User Clicks on sign-in3
    Then User lands on home page3
    
    Scenario: 1. Choose Bangladesh as designated country
    When User clicks on International Delivery
    And User lands on International Delivery Page
    And User enters designated country
    Then User clicks on the search button 
    Then User should get results
   	
      
   Scenario: 2. Choose Canada as designated country
    When User clicks on Internationl Delivery2
    And User lands on International Delivery Page2
    And User enters designated country2
    Then User clicks on the search button2
    Then User should get results2
    Then User clicks on Birthday
    Then User should lan on brthday results page
    
    
    
    
    