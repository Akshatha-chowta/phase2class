package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Test.logintest;
import Test.Baseclass;

public class LoginPage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
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
		
		
}
}
