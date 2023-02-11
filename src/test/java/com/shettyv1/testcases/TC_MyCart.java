package com.shettyv1.testcases;

import org.testng.annotations.Test;

import com.shettyv1.pageobject.MyCart;
import com.shettyv1.pageobject.dashBoardItems;
import com.shettyv1.pageobject.homePageLogin;

public class TC_MyCart extends BaseClass {

	@Test
	public void verifyRegistrationAndLogin() throws InterruptedException
	{
		
		//3 My Cart
		driver.get(url);
		
	homePageLogin homePgLogin =new homePageLogin(driver);
	homePgLogin.enterLoginEmail("abc@random.com");
	Thread.sleep(5000);
	homePgLogin.enterLoginPswd("1qaz!QAZ");
	homePgLogin.clickLoginHomePg();
	
	dashBoardItems DBAddToCart = new dashBoardItems(driver);
	DBAddToCart.selectItem();
	Thread.sleep(5000);
	DBAddToCart.goToDCart();
	
	
	MyCart MCRT = new MyCart(driver);
	MCRT.chkOutButton();
	
	
	
	
	}
}