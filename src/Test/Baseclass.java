package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Baseclass {
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	XSSFWorkbook wbook;
	XSSFSheet sheet;
	
	SoftAssert soft = new SoftAssert();
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
<<<<<<< HEAD
		driver.get("https://www.saucedemo.com/");
=======
		driver.get("https://www.simplilearn.com/");
>>>>>>> 7c7b1fb54b48b21bf04bc14dbcc68bba5ce6c1e7
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		report = new ExtentReports("ExtentReport.html");
		
		FileInputStream fis = new FileInputStream("exceldata.xlsx");
		
		wbook = new XSSFWorkbook(fis);
		
		sheet = wbook.getSheetAt(0);
		
	}
	
	@AfterMethod
	public void teardown() {
		
		
		report.endTest(test);
		report.flush();
		driver.quit();
		
		//soft.assertAll();
		
	}

}