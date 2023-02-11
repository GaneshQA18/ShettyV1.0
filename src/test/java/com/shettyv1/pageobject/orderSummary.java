package com.shettyv1.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderSummary {
	
	//7 not working
	
    WebDriver ldriver;
	
	public orderSummary(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	
	@FindBy(xpath="//div[@class='btn -teal']")
	WebElement viewOrderSummary;
	
	public void ViewOrderSummaryBtn() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
	       WebElement ele = viewOrderSummary;
	       jse.executeScript("arguments[0].click()", ele);
		
	}
	

}
