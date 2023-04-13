package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BobLocators extends BaseClass {
	
	public BobLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="onetrust-accept-btn-handler")
	private WebElement close;
	
	@FindBy(xpath="(//div[@class='text-right small'])[1]")
	private WebElement tru1;
	
	@FindBy(xpath="(//div[@class='text-right small'])[2]")
	private WebElement tru2;

	@FindBy(xpath="(//div[@class='text-right small'])[3]")
	private WebElement tru3;

	@FindBy(xpath="(//div[@class='text-right small'])[4]")
	private WebElement tru4;
	
	@FindBy(xpath="(//div[@class='text-right small'])[5]")
	private WebElement tru5;
	
	@FindBy(xpath="(//div[@class='text-right small'])[6]")
	private WebElement tru6;
	
	@FindBy(xpath="(//div[@class='text-right small'])[7]")
	private WebElement tru7;
	
	@FindBy(xpath="(//div[@class='text-right small'])[8]")
	private WebElement tru8;
	
	@FindBy(xpath="(//div[@class='text-right small'])[9]")
	private WebElement tru9;
	
	@FindBy(xpath="(//div[@class='text-right small'])[10]")
	private WebElement tru10;
	
	@FindBy(xpath="(//div[@class='text-right small'])[11]")
	private WebElement tru11;
	
	@FindBy(xpath="(//div[@class='text-right small'])[12]")
	private WebElement tru12;
	
	
	
	
	
	
	
	public WebElement getClose() {
		return close;
	}







	public WebElement getTru1() {
		return tru1;
	}







	public WebElement getTru2() {
		return tru2;
	}







	public WebElement getTru3() {
		return tru3;
	}







	public WebElement getTru4() {
		return tru4;
	}







	public WebElement getTru5() {
		return tru5;
	}







	public WebElement getTru6() {
		return tru6;
	}







	public WebElement getTru7() {
		return tru7;
	}







	public WebElement getTru8() {
		return tru8;
	}







	public WebElement getTru9() {
		return tru9;
	}







	public WebElement getTru10() {
		return tru10;
	}







	public WebElement getTru11() {
		return tru11;
	}







	public WebElement getTru12() {
		return tru12;
	}







	public static void main(String[] args) {
		

	}

}
