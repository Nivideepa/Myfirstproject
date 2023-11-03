package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotelpage3 {
WebDriver driver;
	
	
	public Select_hotelpage3(WebDriver runner_driver)
	{
		this.driver=runner_driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement hotel_select;
	public WebElement getHotel_select() {
		return hotel_select;
	}
	
	@FindBy(id="continue")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
}
