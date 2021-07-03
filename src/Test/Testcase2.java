package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
	//before test and after test will execute for each testcases inside class
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}

	@Test
	public void logintest() {
		// TODO Auto-generated method stub
		System.out.println("inside login");
	}
	@Test(enabled=false)
	public void signuptest() {
		// TODO Auto-generated method stub
		System.out.println("inside signup");
	}
	@Test(enabled=true)
	public void profiledetails() {
		// TODO Auto-generated method stub
		System.out.println("inside profile");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("afetr method");
	}
}
