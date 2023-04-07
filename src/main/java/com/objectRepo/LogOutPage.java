package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutbtn;
	
	
	
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		logoutbtn.click();
	}
}
