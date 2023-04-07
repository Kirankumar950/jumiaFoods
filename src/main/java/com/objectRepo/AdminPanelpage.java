package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanelpage {
@FindBy(xpath="//span[.='Restaurant']")
private WebElement resturantmod;

@FindBy(xpath="//a[.='Add Restaurant']")
private WebElement addrestaurantmod;

public AdminPanelpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void adminPanelpage()
{
	resturantmod.click();
	addrestaurantmod.click();
}
}
