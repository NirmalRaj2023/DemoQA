package com.adactin.pageExecution;

import com.adactin.locators.BookHotelLocators;
import com.adactin.locators.LoginPageLocators;
import com.baseclass.BaseClass;

public class SearchHotelExec extends LogiPageExec {
	
	public static void location() {
		
		dropdown(new LogiPageExec().getLocation(),"Sydney");		
		}
	
public static void Hotels()
{
		dropdown(new LogiPageExec().getHotels(),"Hotel Creek");

	}

public static void Roomtype() {
	

	dropdown(new LogiPageExec().getRoomtypee(),"Standard");

}
public static void NumberofRooms() {
	
	dropdown(new LogiPageExec().getNumberofRooms(),"2 - Two");
		
}
public static void AdultsperRoom() {
	
	dropdown(new LogiPageExec().getAdultsperRoom(),"2 - Two");
	
	}
public static void ChildrenperRoom() {

	dropdown(new LogiPageExec().getChildrenperRoom(),"2 - Two");

}
public static void search() {
	
	clickopt(new LogiPageExec().getSearch());
	
}



//	public static void location() {
//		findElementByid(location);
//		dropdown("Sydney");
//	}
//	public static void Hotels() {
//		findElementByid(Hotels);
//		dropdown("Hotel Creek");
//	}
//	public static void Roomtype() {
//		findElementByid(Roomtype);
//		dropdown("Standard");
//	}
//	public static void NumberofRooms() {
//		findElementByid(NumberofRooms);
//		dropdown("2 - Two");
//	}
//	public static void CheckInDate() {
//		findElementByid(BaseClass.excelread("Credentials", 0, 1));
//		clickopt(element);
//	}
//	public static void CheckOutDate() {
//		findElementByid(BaseClass.excelread("Credentials", 0, 2));
//		clickopt(element);
//	}
//	public static void AdultsperRoom() {
//		findElementByid(AdultsperRoom);
//		dropdown("2 - Two");
//	}
//	public static void ChildrenperRoom() {
//		findElementByid(ChildrenperRoom);
//		dropdown("1 - One");
//	}
//	public static void search() {
//		findElementByid(search);
//		clickopt(element);
//	}
		
	public static void main(String[] args) {
	

	}

}
