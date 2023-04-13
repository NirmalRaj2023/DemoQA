package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLocators extends LoginPageLocators{
	
	public SearchHotelLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement Hotels;
	@FindBy(id="room_type")
	private WebElement Roomtypee;
	@FindBy(id="room_nos")
	private WebElement NumberofRooms;
	@FindBy(id="adult_room")
	private WebElement AdultsperRoom;
	@FindBy(id="child_room")
	private WebElement ChildrenperRoom;
	@FindBy(id="Submit")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoomtypee() {
		return Roomtypee;
	}

	public void setRoomtypee(WebElement roomtypee) {
		Roomtypee = roomtypee;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}




	public WebElement getHotels() {
		return Hotels;
	}




	public void setHotels(WebElement hotels) {
		Hotels = hotels;
	}




	




	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}




	public void setNumberofRooms(WebElement numberofRooms) {
		NumberofRooms = numberofRooms;
	}




	public WebElement getAdultsperRoom() {
		return AdultsperRoom;
	}




	public void setAdultsperRoom(WebElement adultsperRoom) {
		AdultsperRoom = adultsperRoom;
	}




	public WebElement getChildrenperRoom() {
		return ChildrenperRoom;
	}




	public void setChildrenperRoom(WebElement childrenperRoom) {
		ChildrenperRoom = childrenperRoom;
	}




	public WebElement getSearch() {
		return search;
	}




	public void setSearch(WebElement search) {
		this.search = search;
	}
	
	
	
	
	
	//public static String location="location";
//	public static String Hotels ="hotels";
//	public static String Roomtype="room_type";
//	public static String NumberofRooms="room_nos";
//	public static String CheckInDate="datepick_in";
//	public static String CheckOutDate="datepick_out";
//	public static String AdultsperRoom="adult_room";
//	public static String ChildrenperRoom="child_room";
//	public static String search="Submit";
	public static void main(String[] args) {
	

	}

}
