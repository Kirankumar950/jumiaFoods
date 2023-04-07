package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllRestaurants {
@FindBy(xpath=("(//td[.='American']/following-sibling::td[11]/a[2])[1]"))
private WebElement editbt;

public AllRestaurants(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void allRestaurants()
{
	editbt.click();
}
}
