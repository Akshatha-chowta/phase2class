package Page;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	SoftAssert soft=new SoftAssert();
	
	@BeforeMethod
	public void setup() {
	System.getProperty("webdriver.chrome.driver", "C:\\WebDriver\\WebProject");
	 driver=new ChromeDriver();
	driver.get("https://www.simplilearn.com/");
     driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
     report=new ExtentReports("akshu.html");
	}
	
	@Test
	@Parameters({"Username","Password"})
	public void login(String un, String pwd1) {
		LoginPage obj=new LoginPage();
		obj.logintest(un, pwd1);
	/*try {
	Assert.assertEquals(Actualmsg, Expectedmsg);
	test.log(LogStatus.PASS, "expected and actual mzg  match");
	}
	catch(Throwable e) {
		
	test.log(LogStatus.FAIL, "expected and actual mzg does not match");
	}*/
}
	
	@AfterMethod
	public void teardown() {
		report.endTest(test);
		report.flush();
		driver.close();
		soft.assertAll();
	}
}
