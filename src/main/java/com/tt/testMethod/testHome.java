package com.tt.testMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.tt.config.ObjectRepository;
import com.tt.pageModel.HomePage;
import com.tt.util.TestBaseSetup;

public class testHome extends TestBaseSetup{
	
	    private WebDriver driver;

	       @BeforeMethod
	        public void setUp(){
	    	   driver = getDriver();
	       }
	
	       @Test(description = "click Login Button")
	    	public void clickLogin() throws InterruptedException{
	    	
	    	  System.out.println("clickLogin... ");
	    	  //Explicit wait till SignIn Button visible
              
	    	  WebDriverWait wait=new WebDriverWait(driver,60);
              wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(ObjectRepository.SignIn))));
           
              new HomePage(driver).clickSignIn();
	    	
	    }
	    
	    
	    
	    
//	       @AfterTest
//	        public void tearDown() throws Exception {
//	          driver.quit();
//	     }
	 
//	    @Test(priority=1)
//	    public void test() throws InterruptedException{
//	        driver.get("http://www.amazon.com");
////	      validate if we are at the home page
//	        String homeHeading = new HomePage(driver).getHomeHeading() ;
//	        Assert.assertEquals(homeHeading, "This is HOMEPAGE", "not at the home page");
////	      redirect to the login page
//	        new HomePage(driver).clickLoginButton();
////	      fill the login form
//	        new LoginPage(driver)
//	        .usernameAs("foo@bar.com")
//	        .passwordAs("secret")
//	        .submit();
////	      check if redirected to account page with user name foo@bar.com
//	        String accountHeading = new HomePage(driver).getHomeHeading() ;
//	        Assert.assertEquals(accountHeading, "Welcome foo@bar.com ", "not at the account page");
//	    }

}
