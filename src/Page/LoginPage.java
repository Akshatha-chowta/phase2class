package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
=======
>>>>>>> 7c7b1fb54b48b21bf04bc14dbcc68bba5ce6c1e7
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
<<<<<<< HEAD
import Test.logintest;
import Test.Baseclass;
=======
>>>>>>> 7c7b1fb54b48b21bf04bc14dbcc68bba5ce6c1e7

public class LoginPage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
<<<<<<< HEAD
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement UserName;
	@FindBy(xpath="//input[@id='password']")
			WebElement Password;
	@FindBy(xpath="//input[@id='login-button']")
			WebElement Login;
			
	
	public LoginPage() {
		driver=Baseclass.driver;
		report=Baseclass.report;
		test=Baseclass.test;
		PageFactory.initElements(driver, this);
	}

	public void logintest1(String uname, String pass) {
		UserName.sendKeys(uname);
		Password.sendKeys(pass);
		Login.click();
		
		
=======
	public LoginPage() {
		driver=LoginTest.driver;
		report=LoginTest.report;
		test=LoginTest.test;
	}

	public void logintest(String un, String pwd1) {
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
	//soft.assertEquals(Actualmsg, Expectedmsg);
	System.out.println("after soft assert");
>>>>>>> 7c7b1fb54b48b21bf04bc14dbcc68bba5ce6c1e7
}
}
