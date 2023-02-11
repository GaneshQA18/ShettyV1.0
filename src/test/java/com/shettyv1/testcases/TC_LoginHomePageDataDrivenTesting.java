package com.shettyv1.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shettyv1.pageobject.dashBoardItems;
import com.shettyv1.pageobject.homePageLogin;
import com.shettyv1.utilities.ReadExcelFile;

public class TC_LoginHomePageDataDrivenTesting extends BaseClass {
	
	

	
	
	//1 login
	@Test(dataProvider = "LoginDataProvider")
	public void verifyRegistrationAndLogin(String userEmail,String userPwd) throws InterruptedException, IOException
	{
		
		
		//driver.get(url);
		
	homePageLogin homePgLogin =new homePageLogin(driver);
	homePgLogin.enterLoginEmail(userEmail);
	Thread.sleep(5000);
	homePgLogin.enterLoginPswd(userPwd);
	homePgLogin.clickLoginHomePg();
	String userNameMsgErro=homePgLogin.getEmsg();
	Thread.sleep(5000);
	dashBoardItems DBAddToCart = new dashBoardItems(driver);
	
	if(userNameMsgErro.equals("Login Successfully"))
		
	{
		logger.info("passed");
		Assert.assertTrue(true);
		Thread.sleep(5000);
		DBAddToCart.chkSignOut();
		
	}
	else
	{
		logger.info("failed");
		
		//screenshot - driver,testmethod/testcase name
		captureScreenShot(driver,"verifyRegistrationAndLogin");
		Assert.assertTrue(false);
		
	}
	
	
	
	}


	//TestData\MyStoreTestData.xlsx
	
	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\MyStoreTestData.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;
	}

}


	
	
