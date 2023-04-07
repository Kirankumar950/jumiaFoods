package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogout {

	
	@FindBy(xpath="//img[@src='images/bookingSystem/user-icn.png']")
	private WebElement imgbtn;
	
	@FindBy(xpath="//a[@href=\"logout.php\"]")
	private WebElement logoutbtn;
	
	public AdminLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void adminLogout()
	{
		imgbtn.click();
		logoutbtn.click();
	}
}
