package com.shettyv1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoardItems {

	
	
	WebDriver ldriver;
	
		
		public dashBoardItems(WebDriver rdriver)
		
		{
			ldriver = rdriver;
			
			PageFactory.initElements(rdriver, this);
		}
		
		

		
		@FindBy(xpath="//div[@class='container']//div[1]//div[1]//div[1]//button[2]")
	    WebElement addToKart;

		
		@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	    WebElement goToCart;
		
		@FindBy(css="li:nth-child(5) button:nth-child(1)")
	    WebElement signOut;
		
		
		
	
		public void selectItem()
		{
			addToKart.click();
			
		}
		
	
		
		public void goToDCart()
		{
			
			goToCart.click();
		}
		
		
		public void chkSignOut()
		{
			signOut.click();
			
		}
		
		
		
		
}
