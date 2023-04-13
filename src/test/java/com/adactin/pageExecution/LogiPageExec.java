package com.adactin.pageExecution;

import com.adactin.locators.BookHotelLocators;
import com.adactin.locators.LoginPageLocators;
import com.baseclass.BaseClass;

public class LogiPageExec extends BookHotelLocators {
public static void username() {
	
	BaseClass.typedata(new BookHotelLocators().getUsername(),readprop("username"));
}
public static void password() {
	BaseClass.typedata(new BookHotelLocators().getPassword(),readprop("Password"));
	}
public static void login() {
	BaseClass.clickopt(new BookHotelLocators().getLogin());
	}


public static void main(String[] args) {
		

	}

}
