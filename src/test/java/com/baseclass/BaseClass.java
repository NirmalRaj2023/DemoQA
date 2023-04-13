package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions ac;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	public static Alert alert;
	public static WebElement element;

	public static void SetProperty(String browsername) {
		if (browsername.toLowerCase().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Desktop\\Webdriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.toLowerCase().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\Desktop\\Webdriver\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.toLowerCase().contains("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\admin\\Desktop\\Webdriver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Browser Not Matching");
		}
	}

	public static void toGetUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static WebElement findElement(By by) {
		element = driver.findElement(by);
		return element;
	}

	public static WebElement findElementByid(String id) {
		element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement findElementByname(String name) {
		element = driver.findElement(By.name(name));
		return element;
	}

	public static WebElement findElementByclassName(String classsname) {
		element = driver.findElement(By.className(classsname));
		return element;
	}

	public static WebElement findElementByxpath(String xpathvalue) {
		element = driver.findElement(By.xpath(xpathvalue));
		return element;
	}

	public static WebElement findElementBycssSelector(String cssselectvalue) {
		element = driver.findElement(By.cssSelector(cssselectvalue));
		return element;
	}

	public static WebElement findElementBylinkTest(String LinkTextValue) {
		element = driver.findElement(By.linkText(LinkTextValue));
		return element;
	}

	public static WebElement findElementBypartialLinkText(String partialLinkTextvalue) {
		element = driver.findElement(By.partialLinkText(partialLinkTextvalue));
		return element;
	}

	public static WebElement clickopt(WebElement element) {
		element.click();
		return element;

	}

	public static WebElement enterText(String data) {
		element.sendKeys(data);
		return element;
	}

	public File scrennShot(String filepath) {

		ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(filepath);
		try {
			FileHandler.copy(sc, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sc;
	}

	public static WebElement dropdown(WebElement element,String drop) {
		Select ss = new Select(element);
		ss.selectByVisibleText(drop);
		return element;


	}

	public static void scrollwheel(int i) {
		Robot rr;
		try {
			rr = new Robot();
			rr.mouseWheel(i);

		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void scroll(String val) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(val, element);
	}
	
	public static String attributteGet() {
		String a= element.getAttribute("value");
		return a;
	}

	public static String readprop(String key) {
		String value = null;
		try {
			FileReader fi = new FileReader("C:\\Users\\admin\\HotelJunit\\src\\test\\resources\\Resources");
			Properties prop = new Properties();
			try {
				prop.load(fi);
				value = prop.getProperty(key);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}
		return value;
	}

	public static String excelread(String sheetname, int r, int c) {
		String value = null;
		try {
			String filePath = "C:\\Users\\admin\\HotelJunit\\src\\test\\resources\\Resources.xlsx";
			File f = new File(filePath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Data");
			//Sheet sh=wb.getSheet("sheetname");
			Row row = sh.getRow(r);
			Cell cell = row.getCell(c);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date datecellvalue = cell.getDateCellValue();
					SimpleDateFormat sc = new SimpleDateFormat("dd-MM-YYYY");
					value = sc.format(datecellvalue);
				} else {
					double numValue = cell.getNumericCellValue();
					long a = (long) numValue;
					value = String.valueOf(a);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public static void excelwrite(String sheetName, int r, int c, String value) {
		
	try {
		String filePath = "C:\\Users\\admin\\HotelJunit\\src\\test\\resources\\Resources.xlsx";
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet(sheetName);
		Row createRow = createSheet.createRow(r);
		Cell createCell = createRow.createCell(c);
		createCell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();

	}

	catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
	public static WebElement typedata(WebElement element,String data) {
		element.sendKeys(data);
		return element;
		
	}
	
	public static void implicitlyWait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}
	public static void main(String[] args) {


	}

	

}
