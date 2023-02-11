package com.shettyv1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderConfirmationPage

{
	
	//5
WebDriver ldriver;
	
	public orderConfirmationPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(css=".btn.btn-primary.mt-3.mb-3")
	WebElement CSV;
	
	@FindBy(css="label[routerlink='/dashboard/myorders']")
	WebElement OrderHistoryPage;
	
	
	

	public void CSVDnldButton()
	{
		CSV.click();
	}
	
	public void OrderHistory()
	{
		OrderHistoryPage.click();
	}
	
	
	
	
	
	
}
