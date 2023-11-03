

Feature: Adactin hotel booking 


 
 @tag 
 Scenario: Login scenario.
  Given Vist the browser
  When Enter Username
  And Enter Password 
  Then Click on the login 
 

@tag
  Scenario: Search the hotel and fill the required fields.
    Given User choose the location
    Then User choose the hotel name
    And Choose the room type.
    And Choose the number of rooms.
    And Enter the Check in date.
    And Enter the check out date.
    Then User choose the adults per room.
    When User choose number of children per room.
    Then  Click on the Search.
     
   
   @tag
    Scenario: Choose the hotel name from the avaliable options and continue.
    Given User can select the hotel name .
    Then Click to continue.
     @tag

  Scenario:  Book the hotel and fill the details of the user.
  
     Given Users first name.
     And Users last name.
     And Billing address of the user.
     And Credit card number and the card type.
      And Expiry date and the month.
    And Enter the ccv number of the user.
    Then Click the book now.
    When Confirmation of user booking deatils appears Click on My ltinerary.
   