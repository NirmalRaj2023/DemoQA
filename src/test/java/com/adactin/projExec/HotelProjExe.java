package com.adactin.projExec;

import org.openqa.selenium.JavascriptExecutor;

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
		implicitlyWait();
	//	scrollwheel(4);
	//	scroll("window.scrollBy(0,10000)");
    //  findElementByid("logout");
//		scroll("arguments[0].scrollIntoView(true)");
		findElementByid("order_no");
//		System.out.println(attributteGet());
//		String val=element.getAttribute("value");
		BaseClass.excelwrite("newww", 0, 0, attributteGet());
		
	}

}
