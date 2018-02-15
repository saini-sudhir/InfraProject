package com.tt.testMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tt.config.ObjectRepository;

import com.tt.pageModel.HomePage;
import com.tt.pageModel.LoginPage;
import com.tt.util.TestBaseSetup;



public class testLogin extends TestBaseSetup {
	
	   private WebDriver driver;
	         
	       @BeforeMethod
	        public void setUp(){
	    	   driver = getDriver();
	       }
	
	
	        @Parameters({"usernm","incorrectpwd"})
	        @Test(description = "Performs an unsuccessful login")
	    	public void loginwithIncorrectPwd(String usernm, String incorrectpwd) throws InterruptedException{
	    	
	    	System.out.println("Enter details in Login Page... ");
	    	
	        new LoginPage(driver).incorrectLogin(usernm, incorrectpwd);
	    	//Assert.assertEquals(EP.getErrortext(), "Error Message");

	    }
 
}
