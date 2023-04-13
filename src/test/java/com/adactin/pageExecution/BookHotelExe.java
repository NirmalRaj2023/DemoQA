package com.adactin.pageExecution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.adactin.locators.SelectHotelLocator;
import com.baseclass.BaseClass;

public class BookHotelExe extends SelectHotelExe {

	public static void firstname() {
		BaseClass.typedata(new SelectHotelExe().getFirstname() ,excelread("Data", 0, 1));
	}
	public static void lastname() {
		BaseClass.typedata(new  SelectHotelExe().getLastname(),excelread("Data", 1, 1));
	}
	public static void address() {
		BaseClass.typedata(new SelectHotelExe().getAddress(),excelread("Data", 2, 1));
	}
	public static void creditcardnum() {
		BaseClass.typedata(new SelectHotelExe().getCreditcardnum(),excelread("Data", 3, 1));
	}
	
	public static void creditcardType() {
		dropdown(new SelectHotelExe().getCreditcardType(), "VISA");
			}
	public static void creditcardmonth() {
		dropdown(new SelectHotelExe().getCreditcardmonth(), "January");
			}
	public static void creditcardyear() {
		dropdown(new SelectHotelExe().getCreditcardyear(), "2020");
			}
	public static void cvvnumr() {
		typedata(new SelectHotelExe().getCvvnumr(),excelread("Data", 4, 1));
	}
	public static void booknw() {
		clickopt(new SelectHotelExe().getBooknw());
		
	}
	

	
	
	public static void main(String[] args) {
		

	}

}
