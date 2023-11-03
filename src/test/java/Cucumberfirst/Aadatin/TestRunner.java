package Cucumberfirst.Aadatin;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//Adatinfeature", glue = { "com.stepdefinition" }, plugin = { "pretty",
		"html:target/cucumber-report", "junit:target/cucumber-report/Cucumber.xml" }, monochrome = true) // json:target/cucumber.json

public class TestRunner extends Base1 {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		driver = browser_launch("edge");

	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}
}
