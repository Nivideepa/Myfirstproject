package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalpage1 {
	WebDriver driver;

	public Finalpage1(WebDriver runner_driver) {
		this.driver=runner_driver;
		 PageFactory.initElements(driver, this);
		
	}

	@FindBy(name="ids[]")
	private WebElement yourhotel;
	public WebElement getYourhotel() {
		return yourhotel;
	}

	
	@FindBy(id="logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
@FindBy(xpath="/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td")
private WebElement checklog;
public WebElement getChecklog()
{
	return checklog;
}
}
