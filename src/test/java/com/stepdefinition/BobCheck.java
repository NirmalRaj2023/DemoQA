package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;

import com.adactin.pageExecution.BobExe;

import io.cucumber.java.en.*;

public class BobCheck extends BobExe {

	@Given("User Enters The URL")
	public void user_enters_the_url() {
		SetProperty("chrome");
		toGetUrl("https://www.bobcat.com/in/en/equipment/loaders/compact-track-loaders");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("User Retrive the info from webpage")
	public void user_retrive_the_info_from_webpage()  {

		close();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");
		tru1();
		tru2();
		tru3();
		tru4();
		tru5();
		tru6();
		tru7();
		tru8();
		tru9();
		tru10();
		tru11();
		tru12();
		
	}

	@Then("I validate the homepage title")
	public void i_validate_the_homepage_title() {

	}

	
	
}
