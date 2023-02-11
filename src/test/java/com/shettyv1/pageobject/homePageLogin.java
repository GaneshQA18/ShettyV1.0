package com.shettyv1.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePageLogin {
	
	WebDriver ldriver;
	
	public homePageLogin(WebDriver rdriver)
	
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	

	@FindBy(xpath="//input[@id='userEmail']")
   WebElement loginEmail;
	
	@FindBy(id="userPassword")
	WebElement loginPwd;
	
	@FindBy(id="login")
	WebElement clickLogin;
	
	//delete
	
	@FindBy(css="[class*='flyInOut']")
	WebElement userNameMsgErro;
	
	
	
	public void enterLoginEmail(String emailId)
	{
		loginEmail.sendKeys(emailId);
		
	}
	
	public void enterLoginPswd(String pswd)
	{
		loginPwd.sendKeys(pswd);
		
	}
	
	public void clickLoginHomePg()
	{
		clickLogin.click();
		
	}
	
	//delete
	public String getEmsg()
	{
		String txt =userNameMsgErro.getText();
		return txt;
		
	}

}
