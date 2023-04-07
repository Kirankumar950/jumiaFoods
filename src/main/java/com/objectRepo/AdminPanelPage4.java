package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanelPage4 {

	
	@FindBy(xpath="//span[.='Menu']")
	private WebElement menubtn;
	
	@FindBy(xpath="//a[.='All Menues']")
	private WebElement allmenubtn;
	
	
	
	public AdminPanelPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void adminpanel() throws Throwable
	{
		menubtn.click();
		allmenubtn.click();
	}
}
