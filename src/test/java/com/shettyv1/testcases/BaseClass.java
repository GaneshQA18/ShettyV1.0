 package com.shettyv1.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.shettyv1.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	ReadConfig readConfig = new ReadConfig();
	
	String url = readConfig.getBaseUrl();
	String browser= readConfig.getBrowser();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
		case "msedge":
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver= new FirefoxDriver();
			break;
				
		default:
			driver=null;
			break;
		
		
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		
		
		logger=LogManager.getLogger("ShettyV1");
		
		
		
		
	}		
	
	
	public void waitForWebElementToApper(WebElement findBy )
	
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	
	
    /*@AfterClass
	public void tearDown()
	{
		
		driver.quit();
		
	}
	*/
	
	
	
	//user method to capture screen shot
	
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
			//step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
			//step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			
			File dest = new File(System.getProperty("user.dir")+ "\\Screenshots\\" + testName +".png");
		
			//step3: copy image file to destination
			
			FileUtils.copyFile(src, dest);
		}
		
		
}


                           


