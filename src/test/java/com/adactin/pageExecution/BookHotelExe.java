package com.adactin.pageExecution;

import com.baseclass.BaseClass;

public class BookHotelExe extends SelectHotelExe {

	public static void firstname() {
		BaseClass.typedata(BaseClass.findElementByid(firstname), BaseClass.excelread("Data", 0, 1));
	}
	public static void lastname() {
		BaseClass.typedata(BaseClass.findElementByid(lastname), BaseClass.excelread("Data", 1, 1));
	}
	public static void address() {
		BaseClass.typedata(BaseClass.findElementByid(address), BaseClass.excelread("Data", 2, 1));
	}
	public static void creditcardnum() {
		BaseClass.typedata(BaseClass.findElementByid(creditcardnum), BaseClass.excelread("Data", 3, 1));
	}
	
	public static void creditcardType() {
		findElementByid(creditcardType);
		dropdown("American Express");
	}
	public static void creditcardmonth() {
		findElementByid(creditcardmonth);
		dropdown("January");
	}
	public static void creditcardyear() {
		findElementByid(creditcardyear);
		dropdown("2020");
	}
	public static void cvvnumr() {
		BaseClass.typedata(BaseClass.findElementByid(cvvnumr), BaseClass.excelread("Data", 4, 1));
	}
	public static void booknw() {
		findElementByid(booknw);
		clickopt(element);
	}
	

	
	
	public static void main(String[] args) {
		

	}

}
