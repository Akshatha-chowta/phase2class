package Test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	
		// TODO Auto-generated method stub
		
	    public void onTestStart(ITestResult result) {
	        // TODO Auto-generated method stub
	    	System.out.println("test started, into listner class");
	        
	    }
	    
	    public void onTestSuccess(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }
	   
	    public void onTestFailure(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }
	    
	    public void onTestSkipped(ITestResult result) {
	        // TODO Auto-generated method stub
	    	WebDriver driver=Baseclass.driver;
	    	TakesScreenshot obj=(TakesScreenshot) driver;
	    	File myfile=obj.getScreenshotAs(OutputType.FILE);
	    	try {
	    	    FileUtils.copyFile(myfile,  new File("demo.png"));
	    	} catch (IOException e) {
	    	    // TODO Auto-generated catch block
	    	    e.printStackTrace();
	    	}

	    	}  
	    
	   
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // TODO Auto-generated method stub
	        
	    }
	    
	    public void onStart(ITestContext context) {
	        // TODO Auto-generated method stub
	        
	    }
	    
	    public void onFinish(ITestContext context) {
	        // TODO Auto-generated method stub
	        
	    
	}

}
