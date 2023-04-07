package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanel2 {
	@FindBy(xpath="//span[.='Restaurant']")
	private WebElement resturantmod;
	
	@FindBy(xpath="//a[.='All Restaurant']")
	private WebElement allrestaurantmod;

	public AdminPanel2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void adminPanel2()
	{
		 resturantmod.click();
		 allrestaurantmod.click();
	}
}
