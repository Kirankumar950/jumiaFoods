package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanelPage3 {

	@FindBy(xpath="//span[.='Menu']")
	private WebElement menubtn;
	
	@FindBy(xpath="//a[.='Add Menu']")
	private WebElement addmenubtn;
	
		
	public AdminPanelPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void adminpanel() throws Throwable
	{
		menubtn.click();
		addmenubtn.click();
	}
}
