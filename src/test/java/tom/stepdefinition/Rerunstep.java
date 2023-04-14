package tom.stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.When;

public class Rerunstep {

	@When("User enters the correct assertion")
	public void user_enters_the_correct_assertion() {
		System.out.println("user enters correct assertion");
		Assert.assertEquals("Nirmal","Nirmal");
	}
	
	@When("User enters the wrong assertion")
	public void user_enters_the_wrong_assertion() {
		System.out.println("user enters wrong assertion");
		Assert.assertEquals("Nirmal","Nirmal");
	}
	
	@When("User enters no assertion")
	public void user_enters_no_assertion() {
		System.out.println("user enters no assertion");
	}
}
