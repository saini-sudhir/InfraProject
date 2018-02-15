package com.tt.pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;
import com.tt.config.ObjectRepository;
import com.tt.util.TestBaseSetup;


public class HomePage extends TestBaseSetup {
	
	    WebDriver driver;
	    By loginButton = By.id("login");
	    
	    public  HomePage(WebDriver driver)  {
	        this.driver = driver;
           }
	    
	    //get the heading (the main heading which is present at the home page)
//	    public String getHomeHeading()  {
//	        String heading = driver.findElement(homeHeading).getText();
//	        return  heading;
//	    }
//	    public HomePage clickLoginButton()  {
//	        driver.findElement(loginButton).click();
//	        return  this;
//	    }
	    
	    
	    
	    
//	    public HomePage clickSignIn(){
//	    	 
//	    	 driver.findElement(By.id(ObjectRepository.SignIn)).click();
//	       	 return this;
//	    }
	    
	    public LoginPage clickSignIn() throws InterruptedException {
	    
	    	 driver.findElement(By.id(ObjectRepository.SignIn)).click();
	    ////	 reports.log(LogStatus.PASS, "Click SignIn Button:::");
	    //	 reports.attachScreenshot(TestBaseSetup.captureCurrentScreenshot());
	    	 return new LoginPage(driver);
	    	 
	    	
	    }


}
