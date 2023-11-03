$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adatin.feature");
formatter.feature({
  "line": 3,
  "name": "Adactin hotel booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Login scenario.",
  "description": "",
  "id": "adactin-hotel-booking;login-scenario.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Vist the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter Username",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on the login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.vist_the_browser()"
});
formatter.result({
  "duration": 3173207800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enter_Username()"
});
formatter.result({
  "duration": 192540301,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enter_Password()"
});
formatter.result({
  "duration": 110171800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_the_login()"
});
formatter.result({
  "duration": 1116378400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search the hotel and fill the required fields.",
  "description": "",
  "id": "adactin-hotel-booking;search-the-hotel-and-fill-the-required-fields.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User choose the location",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User choose the hotel name",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Choose the room type.",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Choose the number of rooms.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Enter the Check in date.",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Enter the check out date.",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User choose the adults per room.",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User choose number of children per room.",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Click on the Search.",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_choose_the_location()"
});
formatter.result({
  "duration": 253710699,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_choose_the_hotel_name()"
});
formatter.result({
  "duration": 197485000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.choose_the_room_type()"
});
formatter.result({
  "duration": 190966400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.choose_the_number_of_rooms()"
});
formatter.result({
  "duration": 210074600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enter_the_Check_in_date()"
});
formatter.result({
  "duration": 78511000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enter_the_check_out_date()"
});
formatter.result({
  "duration": 69774600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_choose_the_adults_per_room()"
});
formatter.result({
  "duration": 135013201,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_choose_number_of_children_per_room()"
});
formatter.result({
  "duration": 175148500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_the_Search()"
});
formatter.result({
  "duration": 761618901,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Choose the hotel name from the avaliable options and continue.",
  "description": "",
  "id": "adactin-hotel-booking;choose-the-hotel-name-from-the-avaliable-options-and-continue.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User can select the hotel name .",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Click to continue.",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_can_select_the_hotel_name()"
});
formatter.result({
  "duration": 129671500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_to_continue()"
});
formatter.result({
  "duration": 771876700,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Book the hotel and fill the details of the user.",
  "description": "",
  "id": "adactin-hotel-booking;book-the-hotel-and-fill-the-details-of-the-user.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "Users first name.",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Users last name.",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Billing address of the user.",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Credit card number and the card type.",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Expiry date and the month.",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Enter the ccv number of the user.",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Click the book now.",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Confirmation of user booking deatils appears Click on My ltinerary.",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.users_first_name()"
});
formatter.result({
  "duration": 110206500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.users_last_name()"
});
formatter.result({
  "duration": 105015800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.billing_address_of_the_user()"
});
formatter.result({
  "duration": 105021999,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.credit_card_number_and_the_card_type()"
});
formatter.result({
  "duration": 292344699,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.expiry_date_and_the_month()"
});
formatter.result({
  "duration": 552414200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enter_the_ccv_number_of_the_user()"
});
formatter.result({
  "duration": 89157800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_the_book_now()"
});
formatter.result({
  "duration": 162863300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.confirmation_of_user_booking_deatils_appears_Click_on_My_ltinerary()"
});
formatter.result({
  "duration": 8977963600,
  "status": "passed"
});
});