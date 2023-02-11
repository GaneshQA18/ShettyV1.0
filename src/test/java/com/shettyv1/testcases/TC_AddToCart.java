package com.shettyv1.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shettyv1.pageobject.dashBoardItems;
import com.shettyv1.pageobject.homePageLogin;

public class TC_AddToCart extends BaseClass {

	@Test
	public void verifyRegistrationAndLogin() throws InterruptedException
	{
		
		//2 Add to cart
		
	driver.get(url);
		
	homePageLogin homePgLogin =new homePageLogin(driver);
	homePgLogin.enterLoginEmail("abc@random.com");
	Thread.sleep(5000);
	homePgLogin.enterLoginPswd("1qaz!QAZ");
	homePgLogin.clickLoginHomePg();
	Thread.sleep(5000);
	
	
	dashBoardItems DBAddToCart = new dashBoardItems(driver);
	DBAddToCart.selectItem();
	
	
	Thread.sleep(5000);
	DBAddToCart.goToDCart();


}

}