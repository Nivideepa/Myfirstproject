package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;

	@FindBy(id= "username")

	private WebElement username;


	public Login(WebDriver runner_driver)
	{
		this.driver=runner_driver;
		 PageFactory.initElements(driver, this);
		
	}
	public WebElement getUsername() 
	
	{
		//driver.findElement(By.id("username"));
		return username;
	}

	@FindBy(id="password")
	private WebElement password;
	public WebElement getPassword()
	
	{
		//driver.findElement(By.id("password"));
		return password;
	}

	@FindBy(id="login")
	private WebElement  loginButton;
	public WebElement getLoginButton()
	{
		return loginButton;
	}
}
