package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Test.Baseclass;

public class producthome {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addcart;

	
	public producthome() {
		driver=Baseclass.driver;
		report=Baseclass.report;
		test=Baseclass.test;
		PageFactory.initElements(driver, this);
	}
public void selectproduct() {
	
	addcart.click();

}
}
