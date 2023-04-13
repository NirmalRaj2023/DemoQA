package com.adactin.projExec;

import java.time.LocalDateTime;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import com.adactin.pageExecution.BookHotelExe;
import com.adactin.pageExecution.SearchHotelExec;
import com.baseclass.BaseClass;

public class HotelProjExe extends BookHotelExe {

@BeforeClass
public static void bc() {
	System.out.println("BeforeClass");
}
@Before
public void before() {
		SetProperty("chrome");
		BaseClass.toGetUrl("http://adactinhotelapp.com/");
		username();
		password();
		login();
}
public void after() {
	System.out.println(LocalDateTime.now());
}
@Test
public void main() {
	
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
		implicitlyWait(20);
	//	scrollwheel(4);
	//	scroll("window.scrollBy(0,10000)");
    //  findElementByid("logout");
//		scroll("arguments[0].scrollIntoView(true)");
		findElementByid("order_no");
//		System.out.println(attributteGet());
//		String val=element.getAttribute("value");
		BaseClass.excelwrite("newwe", 0, 0, attributteGet());
}
@AfterClass
public static void close() {
	System.out.println("After CLass");
}
}


