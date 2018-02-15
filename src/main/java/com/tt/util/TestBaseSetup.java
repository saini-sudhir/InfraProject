package com.tt.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import com.tt.config.ObjectRepository;


public class TestBaseSetup {
	
	
	protected static WebDriver driver;
//	static String driverPath = "E://Software/Jar/chromedriver_win32";  
	
	
	public static Calendar cald = Calendar.getInstance();
	public static String captureFilePath;
	public static String currentExecutionFoldername;
	public static String currentExecutionReportPath;
//	public static final ExtentReports reports = ExtentReports.get(TestBaseSetup.class);
	static SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	public static Date executionStartTime = cald.getTime();
	public static Logger log;
	public static String currentMethodName;
	
	

	public WebDriver getDriver() {
		return driver;
	}

/*	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}  */
 
	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
	//	System.setProperty("webdriver.chrome.driver", driverPath
	//			+ "chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

/*	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}   */

	@Parameters({ "browserType", "appURL" })
	@BeforeSuite
	public void initializeTestBaseSetup(String browserType, String appURL) throws FileNotFoundException, IOException {
//		try {
		//	setDriver(browserType, appURL);
//			driver =  initChromeDriver(appURL);
//		} catch (Exception e) {
//			System.out.println("Error....." + e.getStackTrace());
//		}
		
		
	


	

		Webdriver(appURL);
		Application();
		
	}
	
	private void Webdriver(String appURL){
		try{
			driver =  initFirefoxDriver(appURL);
		}
		catch(Exception e){
			System.out.println("Error....." + e.getStackTrace());
		}
		
		
	}
	
	private void Application(){
		
    	System.out.println("Wait for the Page load");
		WebDriverWait wait = new WebDriverWait(driver, 120L);

		try {

			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(ObjectRepository.Logo)));
		
			 if (driver.findElement(By.xpath(ObjectRepository.Logo)).getText()
						.equalsIgnoreCase("Amazon")) {
					System.out.println("Get the Logo Text in HomaPage  :: "
							+ driver.findElement(By.xpath(ObjectRepository.Logo)).getText());
					

				} else {

					System.out.println("Home Page is not Loaded :: "
							+ driver.findElement(By.xpath(ObjectRepository.Logo)).getText());

				}

		
		}

		catch (Throwable t) {
			t.printStackTrace();
			System.out.println("Home Page is not Loaded:::" + t);

		}

		log.info("Logger Info:: Going out of Setup Method");
      }	

	
//	@AfterSuite
//	public void tearDown() {
//		driver.quit();
//	}
	


	
}
