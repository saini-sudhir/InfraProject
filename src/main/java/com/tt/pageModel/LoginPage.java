package com.tt.pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import com.tt.config.ObjectRepository;
import com.tt.util.TestBaseSetup;



public class LoginPage extends TestBaseSetup {
	
	private WebDriver driver;
	
    public  LoginPage(WebDriver driver) {
    	  this.driver = driver;
        }
    
    public LoginPage incorrectLogin(String usernm, String incorrectpwd) throws InterruptedException{
    	
    	boolean value = false;
		Assert.assertTrue((value));        // Test Case Failed
    	
    	WebDriverWait wait=new WebDriverWait(driver,30);
    	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ap_email"))));
         
        Thread.sleep(3000);
        driver.findElement(ObjectRepository.Email).sendKeys(usernm);
     	driver.findElement(ObjectRepository.Continue).click();
        driver.findElement(ObjectRepository.pwd).sendKeys(incorrectpwd);
        driver.findElement(ObjectRepository.SignInSubmit).submit();
        
//        reports.log(LogStatus.PASS, "Login with Incorrect details:::");
//        reports.attachScreenshot(TestBaseSetup.captureCurrentScreenshot());
       	return this;
    	
    }
    
    
    
//    public LoginPage username(String email)   {
//        driver.findElement(username).sendKeys(email);
//        return  this;
//    }
//    
//    public LoginPage password(String pass)    {
//        driver.findElement(password).sendKeys(pass);
//        return  this;
//    }
//    
//    public void submit(){
//        driver.findElement(submitButton).click();
//    }

}
