package Test;

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
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
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
		test=report.startTest("Login test case");
	WebElement Login=driver.findElement(By.linkText("Log in"));	
	Login.click();
	test.log(LogStatus.PASS, "Successfully clicked on the login button");
	WebElement username=driver.findElement(By.name("user_login"));
	username.sendKeys(un);
	
	test.log(LogStatus.PASS, "Successfully entered un");
	WebElement pwd=driver.findElement(By.id("password"));
	pwd.sendKeys(pwd1);
	test.log(LogStatus.PASS, "Successfully entered pwd");
	WebElement Rememberme=driver.findElement(By.className("rememberMe"));
	Rememberme.click();
	test.log(LogStatus.PASS, "Successfully clicked on the remeber button");
	

	WebElement signin=driver.findElement(By.name("btn_login"));
	signin.click();
	test.log(LogStatus.PASS, "Successfully clicked on the login button");
	
	WebElement msg =driver.findElement(By.id("msg_box"));
	String Actualmsg=msg.getText();
	String Expectedmsg="The email or password you have entered is invalid";
	Assert.assertTrue(msg.isDisplayed());
	soft.assertEquals(Actualmsg, Expectedmsg);
	System.out.println("after soft assert");
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
