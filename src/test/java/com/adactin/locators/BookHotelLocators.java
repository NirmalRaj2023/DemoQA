package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelLocators extends SelectHotelLocator {

	
	public void BookHotelLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_type")
	private WebElement creditcardType;
	@FindBy(id="cc_num")
	private WebElement creditcardnum;
	@FindBy(id="cc_exp_month")
	private WebElement creditcardmonth;
	@FindBy(id="cc_exp_year")
	private WebElement creditcardyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumr;
	@FindBy(id="book_now")
	private WebElement booknw;
	
	
//	public static String firstname="first_name";
//	public static String lastname="last_name";
//	public static String address="address";
//	public static String creditcardType="cc_type";
//	public static String creditcardnum="cc_num";
//	public static String creditcardmonth="cc_exp_month";
//	public static String creditcardyear="cc_exp_year";
//	public static String cvvnumr="cc_cvv";
//	public static String booknw="book_now";
	
	public WebElement getFirstname() {
		return firstname;
	}


	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}


	public WebElement getAddress() {
		return address;
	}


	public void setAddress(WebElement address) {
		this.address = address;
	}


	public WebElement getCreditcardType() {
		return creditcardType;
	}


	public void setCreditcardType(WebElement creditcardType) {
		this.creditcardType = creditcardType;
	}


	public WebElement getCreditcardnum() {
		return creditcardnum;
	}


	public void setCreditcardnum(WebElement creditcardnum) {
		this.creditcardnum = creditcardnum;
	}


	public WebElement getCreditcardmonth() {
		return creditcardmonth;
	}


	public void setCreditcardmonth(WebElement creditcardmonth) {
		this.creditcardmonth = creditcardmonth;
	}


	public WebElement getCreditcardyear() {
		return creditcardyear;
	}


	public void setCreditcardyear(WebElement creditcardyear) {
		this.creditcardyear = creditcardyear;
	}


	public WebElement getCvvnumr() {
		return cvvnumr;
	}


	public void setCvvnumr(WebElement cvvnumr) {
		this.cvvnumr = cvvnumr;
	}


	public WebElement getBooknw() {
		return booknw;
	}


	public void setBooknw(WebElement booknw) {
		this.booknw = booknw;
	}


	public static void main(String[] args) {
		

	}

}
