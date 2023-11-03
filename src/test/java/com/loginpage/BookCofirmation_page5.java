package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookCofirmation_page5 {
	WebDriver driver;
	public BookCofirmation_page5(WebDriver runner_driver) {

		this.driver=runner_driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="my_itinerary")
	private WebElement my_travel;
	public WebElement getMy_travel() {
		return my_travel;
	}

}
