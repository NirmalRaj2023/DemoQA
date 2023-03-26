package com.app.stepdefinition;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.adactin.locators.LoginPageLocators;
import com.adactin.pageExecution.BookHotelExe;
import com.baseclass.BaseClass;

import io.cucumber.java.en.*;

public class LoginCheck extends BookHotelExe {

	@Given("User enters the URL")
	public void user_enters_the_url() {
		SetProperty("chrome");
		toGetUrl("http://adactinhotelapp.com/");
					}

	@When("User Enters the Username")
	public void user_enters_the_username() {
			username();
	}

	@When("User Enters Password")
	public void user_enters_password() {
			password();
	}

	@When("User Clicks the login button")
	public void user_clicks_the_login_button() {
		login();
	}

	@Then("Validate the homepage title")
	public void validate_the_homepage_title() {

	}

	@Then("validate the user icon")
	public void validate_the_user_icon() {

	}

	@Then("Validate the sign in button is not visible")
	public void validate_the_sign_in_button_is_not_visible() {

	}

	@When("User Enters the invalid Username")
	public void user_enters_the_invalid_username() {
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.username),"daisyrubycatharin");
	}

	@When("User Enters invalid Password")
	public void user_enters_invalid_password() {
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.Password),"RP65I");
		}
	

	@When("User Enters the Username {string}")
	public void user_enters_the_username(String un) {
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.username),un);
	}
	@When("User Clicks the login button {string}")
	public void user_clicks_the_login_button(String pwd) {
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.Password),pwd);
	}





	
}
