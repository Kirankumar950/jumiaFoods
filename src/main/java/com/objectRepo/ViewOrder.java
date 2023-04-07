package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrder {

	@FindBy(linkText="Update Order Status")
	private WebElement updatebtn;
	
	
	
	public ViewOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void viewOrder()
	{
		updatebtn.click();
	}
}
