package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base1;
import com.loginpage.Login;
import com.pagemanager.Pagemanager;

import Cucumberfirst.Aadatin.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Base1{
	public static WebDriver driver=TestRunner.driver;
	public static Pagemanager pom=new Pagemanager(driver);
	public static Login h1=new Login (driver);
	
	
	


@Given("^Vist the browser$")
public void vist_the_browser()  {
	launch_url("https://adactinhotelapp.com/"); 
	maximize();
}
	

@When("^Enter Username$")
public void enter_Username()  {
	sendValues(pom.getinstancehp().getUsername(),"NivedithaSuresh");
}

@When("^Enter Password$")
public void enter_Password() {
	sendValues(pom.getinstancehp().getPassword(),"blackhorse");
   
}

	

	
	

	@Then("^Click on the login$")
	public void click_on_the_login()  {
		clickkk(pom.getinstancehp().getLoginButton());
	    
	}

	@Given("^User choose the location$")
	public void user_choose_the_location() {
		
		dropdown(pom.getinstancehp1().getLocation(),"index","2");
		
	   
	}

	@Then("^User choose the hotel name$")
	public void user_choose_the_hotel_name() {
		dropdown(pom.getinstancehp1().getHotels(),"index","2");
	}

	@Then("^Choose the room type\\.$")
	public void choose_the_room_type() {
		dropdown(pom.getinstancehp1().getRoom_type(),"index","2");
	}
	@Then("^Choose the number of rooms\\.$")
	public void choose_the_number_of_rooms()  {
		dropdown(pom.getinstancehp1().getNumber_of_room(),"index","5");
	}
	  
	@Then("^Enter the Check in date\\.$")
	public void enter_the_Check_in_date() {
		sendValues(pom.getinstancehp1().getCheck_in_date(),"23/10/2023");
	}

	@Then("^Enter the check out date\\.$")
	public void enter_the_check_out_date() {
		sendValues(pom.getinstancehp1().getCheck_out_date(),"30/12/2023");
	}

	@Then("^User choose the adults per room\\.$")
	public void user_choose_the_adults_per_room()  {
		dropdown(pom.getinstancehp1().getAdult_room(),"index","1");
	}

	@When("^User choose number of children per room\\.$")
	public void user_choose_number_of_children_per_room()  {
		dropdown(pom.getinstancehp1().getChildern_room(),"index","2");
	}

	@Then("^Click on the Search\\.$")
	public void click_on_the_Search() {
		clickkk(pom.getinstancehp1().getSearch_button());
	}


	@Given("^User can select the hotel name \\.$")
	public void user_can_select_the_hotel_name()  {
		 waitforvisibilityofelment(pom.getinstancehp2().getHotel_select());
		    radiobutton(pom.getinstancehp2().getHotel_select());
	   
	}

	@Then("^Click to continue\\.$")
	public void click_to_continue() {
		clickkk(pom.getinstancehp2().getContinue());
	}

	@Given("^Users first name\\.$")
	public void users_first_name()  {
		sendValues(pom.getinstancehp3().getFirst_Name(),"Niveditha");
	}

	@Given("^Users last name\\.$")
	public void users_last_name()  {
		sendValues(pom.getinstancehp3().getLast_Name(),"Sureshkumar");
	    
	}

	@Given("^Billing address of the user\\.$")
	public void billing_address_of_the_user()  {
		sendValues(pom.getinstancehp3().getAddress(),"Anna nagar ,west cost 5th street");
	}

	@Given("^Credit card number and the card type\\.$")
	public void credit_card_number_and_the_card_type() {
		sendValues(pom.getinstancehp3().getCredit_card_no(),"1234567891234567");
		dropdown(pom.getinstancehp3().getCard_type(),"index","2");
	}

	@Given("^Expiry date and the month\\.$")
	public void expiry_date_and_the_month()  {
		dropdown(pom.getinstancehp3().getExpiry_month(),"index","2");
		dropdown(pom.getinstancehp3().getExpiry_year(),"index","15");
	    
	}

	@Given("^Enter the ccv number of the user\\.$")
	public void enter_the_ccv_number_of_the_user() {
		sendValues(pom.getinstancehp3().getCVV_no(),"123");
	    
	}

	@Then("^Click the book now\\.$")
	public void click_the_book_now()  {
		clickkk(pom.getinstancehp3().getBook_now());
	    
	}

	@When("^Confirmation of user booking deatils appears Click on My ltinerary\\.$")
	public void confirmation_of_user_booking_deatils_appears_Click_on_My_ltinerary() throws Exception  {
		waitforvisibilityofelment(pom.getinstancehp4().getMy_travel());
		scroll(pom.getinstancehp4().getMy_travel());
		clickkk(pom.getinstancehp4().getMy_travel());
		waitforvisibilityofelment(pom.getinstancehp5().getYourhotel());
		clickkk(pom.getinstancehp5().getYourhotel());
		Thread.sleep(1000);
		screenshot();
		clickkk(pom.getinstancehp5().getLogout());
	    
	}


}
