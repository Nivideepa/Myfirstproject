package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotelpage4 {
WebDriver driver;
	
	
	public Book_hotelpage4(WebDriver runner_driver)
	{
		this.driver=runner_driver;
		 PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="first_name")
	private WebElement First_Name;
	public WebElement getFirst_Name() {
		return First_Name;
	}
	
	@FindBy(id="last_name")
	private WebElement Last_Name;
	public WebElement getLast_Name() {
		return Last_Name;
	}
	
	
	@FindBy(id="address")
	private WebElement Address;
	public WebElement getAddress() {
		return Address;
	}
	
	@FindBy(id="cc_num")
	private WebElement Credit_card_no;
	public WebElement getCredit_card_no() {
		return Credit_card_no;
	}
	
	@FindBy(id="cc_type")
	private WebElement Card_type;
	public WebElement getCard_type() {
		return Card_type;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement Expiry_month;
	public WebElement getExpiry_month() {
		return Expiry_month;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement Expiry_year;
	public WebElement getExpiry_year() {
		return Expiry_year;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement CVV_no;
	public WebElement getCVV_no() {
		return CVV_no;
	}
	
	@FindBy(id="book_now")
	private WebElement Book_now;
	public WebElement getBook_now() {
		return Book_now;
	}
}
