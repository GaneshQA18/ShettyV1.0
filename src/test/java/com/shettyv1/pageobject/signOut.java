package com.shettyv1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signOut {
	
	//8
	
WebDriver ldriver;
	
	public signOut(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//button[normalize-space()='Sign Out']")
	WebElement signOutBtn;
	
	public void signOutButton()
	{
		signOutBtn.click();
	}
	

}
