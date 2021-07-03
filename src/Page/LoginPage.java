package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
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
}
}
