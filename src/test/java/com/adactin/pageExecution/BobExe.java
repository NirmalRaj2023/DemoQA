package com.adactin.pageExecution;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.adactin.locators.BobLocators;
import com.baseclass.BaseClass;

public class BobExe extends BobLocators {

	
	
	
	public static void close() {
	clickopt(new BobLocators().getClose());
			}
	
	public static void tru1() {
		
	excelwrite("BOB", 0	, 1, new BobLocators().getTru1().getText());
			}
		
	public static void tru2() {
	excelwrite("BOB", 1, 1, new BobLocators().getTru2().getText());
			}

	public static void tru3() {
		excelwrite("BOB", 2, 1, new BobLocators().getTru3().getText());
				}
	
	public static void tru4() {
		excelwrite("BOB", 3, 1, new BobLocators().getTru4().getText());
				}
	
	public static void tru5() {
		excelwrite("BOB", 4, 1, new BobLocators().getTru5().getText());
				}
	
	public static void tru6() {
		excelwrite("BOB", 5, 1, new BobLocators().getTru6().getText());
				}
	public static void tru7() {
		excelwrite("BOB", 6, 1, new BobLocators().getTru7().getText());
				}
	public static void tru8() {
		excelwrite("BOB", 7, 1, new BobLocators().getTru8().getText());
				}
	public static void tru9() {
		excelwrite("BOB", 8, 1, new BobLocators().getTru9().getText());
				}
	public static void tru10() {
		excelwrite("BOB", 9, 1, new BobLocators().getTru10().getText());
				}
	public static void tru11() {
		excelwrite("BOB", 10, 1, new BobLocators().getTru11().getText());
				}
	public static void tru12() {
		excelwrite("BOB", 11, 1, new BobLocators().getTru12().getText());
				}
	//		findElementByid("onetrust-accept-btn-handler").click();
//		//driver.findElement(By.id("onetrust-accept-btn-handler")).click();	
	
	
//	public static void retriveinfo() throws IOException {
//	
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//	    js.executeScript("window.scrollBy(0,1000)");
//		//List<WebElement> findElements = driver.findElements(By.xpath("//div[@class=\"text-right small\"]"));
//	    //for(WebElement el:findElements)
//	    WebElement e1=driver.findElement(By.xpath("//div[@class=\"text-right small\"][1]"));
//	   	System.out.println(e1.getText());
//	   	WebElement e2=driver.findElement(By.xpath("(//div[@class='text-right small'])[2]"));
//	   	System.out.println(e2.getText());	
//	   	
//	   	excelwrite("BOb", 0, 0, e1.getText());
//		excelwrite("BOb", 1, 1, e2.getText());
	  
//	   	HSSFWorkbook workbook=new HSSFWorkbook();
//	   HSSFSheet sheet=workbook.createSheet();
//	   sheet.createRow(0);
//	   sheet.getRow(0).createCell(0).setCellValue(e1.getText());
//	   sheet.getRow(1).createCell(1).setCellValue(e2.getText());	   
//			   File file=new File("C:\\Users\\admin\\BobCatPrjWithCucumber\\src\\main\\resources\\Test.xls");
//			   workbook.write(file);
//			   workbook.close();
//	}
	
	
	public static void main(String[] args) {
		

	}

}
