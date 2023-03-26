package com.adactin.pageExecution;

import com.adactin.locators.BookHotelLocators;
import com.adactin.locators.LoginPageLocators;
import com.baseclass.BaseClass;

public class LogiPageExec extends BookHotelLocators {
public static void username() {
	
	BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.username),readprop("username"));
}
public static void password() {
	BaseClass.typedata(BaseClass.findElementByid(LoginPageLocators.Password),readprop("Password"));
	}
public static void login() {
	BaseClass.clickopt(BaseClass.findElementByid(LoginPageLocators.login));
	}


public static void main(String[] args) {
		

	}

}
