package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class pomloginstepdefinitions {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait;
	LoginPage lp;
	
	
	@Given("user navigate to geodataplus website")
	public void user_navigate_to_geodataplus_website() throws Throwable {
		lp.navigateToGeoData();
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() {
	    lp.loginClick();
	}

//	@Then("user enters {string} and {string} and submits")
//	public void user_enters_and_and_submits(String string, String string2) throws Exception {
//	    lp.loginToBox(string, string2);
//	}

}
