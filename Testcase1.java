package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
//before test and after test will execute at one time for class	
	@BeforeTest
	public void beforetest() {
		System.out.println("inside beforetest");
	}

	@Test
	public void Homepagetest() {
		// TODO Auto-generated method stub
		System.out.println("inside homepage");
	}
	@Test
	public void Mainpagetest() {
		// TODO Auto-generated method stub
		System.out.println("inside homepage");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("inside aftertest");
	}
}
