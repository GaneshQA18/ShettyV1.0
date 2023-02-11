package com.shettyv1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCart {
 
	WebDriver ldriver;
	
	public MyCart(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath="//button[normalize-space()='Checkout']")
	WebElement Checkout;
	
	public void chkOutButton()
	
	{
		Checkout.click();
	}
	
	
	
}
