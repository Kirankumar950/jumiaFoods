package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOrders {

	
	@FindBy(xpath="//td[.='scott']/following-sibling::td[7]/a[2]")
	private WebElement userbtn;
	
	

	
	public AllOrders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void allorders()
	{
		userbtn.click();
	}
}
