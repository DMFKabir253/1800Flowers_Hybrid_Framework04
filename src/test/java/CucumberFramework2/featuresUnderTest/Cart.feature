Feature: 1800Flowers Add To Cart Functionality

Scenario:
 
 	Given A validated user2  
    When User browse to the site2
    And User navigates to the footer2
    Then User clicks on sign-in to account2
    Then User should be taken to the sign-in page2
    Then User enters valid username2 
    Then User enters valid password2  
    Then User clicks on Sign-In2
    Then User should be taken to home page2
    Then  Click on plants
    Then User should be taken to plan results page
    Then User clicks on Dish Garden with Fresh Cut Flowers
    Then User should be taken to the plants information page
    And User clicks on large
    And User clicks on medium
    Then User clicks on small
    Then User clicks on medium
    And User enters the postal code
    Then User selects residence type
    And User clicks on date
    Then User is presented witha popup to slect the date
    Then User selects the date
    And User cliks on the chocolate option and selects large
    Then User should be taken to the confirmation page
    Then Verify the price in the cart should be $219.96
    Then User clicks on continue shopping
    Then User clicks on checkout
    Then User should be landing on checkout page
    
    
    
    