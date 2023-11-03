package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
WebDriver driver;
	
	
	
	public Search_hotel(WebDriver runner_driver)
	{
		this.driver=runner_driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	

	@FindBy(name="hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(id="room_type")
	private WebElement Room_type;
	public WebElement getRoom_type() {
		return Room_type;
	}
	
	@FindBy(id="room_nos")
	private WebElement Number_of_room;
	public WebElement getNumber_of_room() {
		return Number_of_room;
	}

	@FindBy(id="datepick_in")
	private WebElement Check_in_date;
	public WebElement getCheck_in_date() {
		return Check_in_date;
	}

	@FindBy(id="datepick_out")
	private WebElement Check_out_date;
	public WebElement getCheck_out_date() {
		return Check_out_date;
	}

	@FindBy(id="adult_room")
	private WebElement Adult_room;
	public WebElement getAdult_room() {
		return Adult_room;
	}

	@FindBy(id="child_room")
	private WebElement Childern_room;
	public WebElement getChildern_room() {
		return Childern_room;
	}
	
	@FindBy(id="Submit")
	private WebElement Search_button;
	public WebElement getSearch_button() {
		return Search_button;
	}

}
