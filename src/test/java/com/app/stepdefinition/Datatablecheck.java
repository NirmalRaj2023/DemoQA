package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import com.adactin.locators.LoginPageLocators;
import com.adactin.pageExecution.BookHotelExe;
import com.baseclass.BaseClass;
import io.cucumber.java.en.*;

public class Datatablecheck extends BookHotelExe {

	@Given("Login into URL")
	public void login_into_url() {
		SetProperty("chrome");
		toGetUrl("http://adactinhotelapp.com/");
			}
	

	@When("enter the credential asList")
	public void enter_the_credential_as_list(io.cucumber.datatable.DataTable dataTable) {
		List<String> aslist=dataTable.asList();
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.username),aslist.get(0));    
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.Password),aslist.get(1));
	}
	
	@When("enter the credential asLists")
	public void enter_the_credential_as_lists(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> aslists=dataTable.asLists();
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.username),aslists.get(0).get(0));    
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.Password),aslists.get(0).get(1));
		
	}



	@When("enter the credential asMap")
	public void enter_the_credential_as_map(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asmap=dataTable.asMap();
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.username),asmap.get("un"));    
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.Password),asmap.get("pwd"));
	}



	@When("enter the credential asMaps")
	public void enter_the_credential_as_maps(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asmaps=dataTable.asMaps();
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.username),asmaps.get(0).get("cred"));    
		BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.Password),asmaps.get(1).get("cred"));
	}





	
}
