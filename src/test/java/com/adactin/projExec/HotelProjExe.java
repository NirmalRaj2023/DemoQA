package com.adactin.projExec;

import com.adactin.pageExecution.BookHotelExe;
import com.adactin.pageExecution.SearchHotelExec;
import com.baseclass.BaseClass;

public class HotelProjExe extends BookHotelExe {

	public static void main(String[] args) {
		SetProperty("chrome");
		BaseClass.toGetUrl("http://adactinhotelapp.com/");
		username();
		password();
		login();
		location();
		Hotels();
		Roomtype();
		NumberofRooms();
//		CheckInDate();
//		CheckOutDate();
		AdultsperRoom();
		ChildrenperRoom();
		search();
		radiobutton();
		continu();
		firstname();
		lastname();
		address();
		creditcardnum();
		creditcardType();
		creditcardmonth();
		creditcardyear();
		cvvnumr();
		booknw();
	}

}
