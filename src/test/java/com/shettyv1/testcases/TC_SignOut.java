package com.shettyv1.testcases;

import org.testng.annotations.Test;

import com.shettyv1.pageobject.MyCart;
import com.shettyv1.pageobject.dashBoardItems;
import com.shettyv1.pageobject.homePageLogin;
import com.shettyv1.pageobject.myOrders;
import com.shettyv1.pageobject.orderConfirmationPage;
import com.shettyv1.pageobject.orderPage;
import com.shettyv1.pageobject.orderSummary;
import com.shettyv1.pageobject.signOut;

public class TC_SignOut extends BaseClass {
	
	//8 end to end
	
	

		@Test
		public void verifyRegistrationAndLogin() throws InterruptedException
		{
			driver.get(url);	
			logger.info("url opened");
			
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
			
		orderPage orgpg = new orderPage(driver);
		orgpg.code("123");
		orgpg.cardName("alpha");
		orgpg.Countryname("New Zealand");
		Thread.sleep(10);
		orgpg.CountrynameClick();
		Thread.sleep(10);
		orgpg.submitOrder();
		
		orderConfirmationPage orderConPg = new orderConfirmationPage(driver);
		orderConPg.CSVDnldButton();
		Thread.sleep(10);
		orderConPg.OrderHistory();  
		
		
		myOrders MyORDS = new myOrders(driver);
		MyORDS.View();
		
		
		
		orderSummary Summary =new orderSummary(driver);
		Summary.ViewOrderSummaryBtn();
		
		Thread.sleep(30);
		MyORDS.DeleteOrder();
		
		Thread.sleep(30);
		signOut Out = new signOut(driver);
		Out.signOutButton();

}
		
		

}