package com.app.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.When;

public class Rerunfailedcases {

	@When("user enters correct assertion")
	public void user_enters_correct_assertion() {
		System.out.println("user enters correct assertion");
		Assert.assertEquals("Nirmal", "Nirmal");
	}
	


	@When("user enters invalid assertion")
	public void user_enters_invalid_assertion() {
		System.out.println("user enters invalid assertion");
		Assert.assertEquals("Nirmal", "Nirmal");
	}


	@When("user enters no assertion")
	public void user_enters_no_assertion() {
		System.out.println("user enters no assertion");
		
	}





	
	
	
	
}
