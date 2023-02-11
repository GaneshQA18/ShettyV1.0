package com.shettyv1.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shettyv1.pageobject.dashBoardItems;
import com.shettyv1.pageobject.homePageLogin;

public class TC_LoginHomePage extends BaseClass {
	//1 login
	@Test
	public void verifyRegistrationAndLogin() throws InterruptedException, IOException
	{
		driver.get(url);
		
	homePageLogin homePgLogin =new homePageLogin(driver);
	homePgLogin.enterLoginEmail("abc@random.com");
	Thread.sleep(5000);
	homePgLogin.enterLoginPswd("1qaz!QAZ");
	homePgLogin.clickLoginHomePg();
	String userNameMsgErro=homePgLogin.getEmsg();
	dashBoardItems DBAddToCart = new dashBoardItems(driver);
	
	if(userNameMsgErro.equals("Login Successfully"))
		
	{
		logger.info("passed");
		Assert.assertTrue(true);
		Thread.sleep(10);
		DBAddToCart.chkSignOut();
	}
	else
	{
		logger.info("failed");
		
		//screenshot - driver,testmethod/testcase name
		captureScreenShot(driver,"verifyRegistrationAndLogin");
		Assert.assertTrue(false);
	}
	
	
	
	}

	private WebElement FindBy(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
