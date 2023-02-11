package com.shettyv1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class myOrders {
	
	//6
	
	    WebDriver ldriver;
		
		public myOrders(WebDriver rdriver)
		{
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}

		@FindBy(xpath="(//button[contains(text(),'View')])[1]")
		WebElement viewOrder;
		
		
		
		
		@FindBy(xpath="//button[normalize-space()='Delete']")
		WebElement Delete;

		
		
		
		public void View()
		{
			viewOrder.click();
		}
		
		
		public void DeleteOrder()
		{
			Delete.click();
		}
		
		
	

}
