package com.shettyv1.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPage {
	
	
	WebDriver ldriver;
	
	public orderPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement CVVCode;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement NameOnCard;		
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement selectCountry;
	
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement selectCountryBox;		
			
	

	@FindBy(css=".action__submit")
    WebElement submit;
	
	public void code(String code)
	{
		CVVCode.sendKeys(code);
		
	}
	
	public void cardName(String Crdname)
	{
		NameOnCard.sendKeys(Crdname);
		
	}
	
	public void Countryname(String Cntryname) throws InterruptedException
	{
		selectCountry.sendKeys(Cntryname);
		Thread.sleep(10);
		
	}
	
	public void CountrynameClick() throws InterruptedException
	{
		
		selectCountryBox.click();
		Thread.sleep(10);
		
	}
	
	public void submitOrder()
	{

       JavascriptExecutor jse = (JavascriptExecutor)ldriver;
       WebElement ele = submit;
       jse.executeScript("arguments[0].click()", ele);
	}
	

}
