package com.tt.util;

import org.testng.ITestListener;
import org.testng.ITestContext;

import org.testng.ITestResult;
import com.tt.util.TestBaseSetup;

public class TestListeners implements ITestListener  {
	
	
	TestBaseSetup testbase = new TestBaseSetup();
	
    public void onTestFailure(ITestResult result) {
/*    	System.out.println("***** Error "+result.getName()+" test has failed *****");
    	String methodName=result.getName().toString().trim();
    
    	try {
			testbase.captureCurrentScreenshot1(methodName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed TC to take screenshot"+ e.getStackTrace());   
		}  */
    }
    
    
    
//    public void takeScreenShot(String methodName) {
//    	//get the driver
//    	driver=TestBase.getDriver();
//    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         //The below method will save the screen shot in d drive with test method name 
//            try {
//				FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
//				System.out.println("***Placed screen shot in "+filePath+" ***");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//    }
	public void onFinish(ITestContext context) {}
  
    public void onTestStart(ITestResult result) {   }
  
    public void onTestSuccess(ITestResult result) {   }

    public void onTestSkipped(ITestResult result) {   
    	
       	
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

    public void onStart(ITestContext context) {   }

}
