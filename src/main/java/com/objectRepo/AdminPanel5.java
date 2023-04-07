package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanel5 {

	
	@FindBy(xpath="//a[@href='all_orders.php']")
	private WebElement orderbtn;
	
	
	public AdminPanel5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void adminpanel5()
	{
		orderbtn.click();
	}
	
   }
