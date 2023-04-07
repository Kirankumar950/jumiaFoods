package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DishesPage {
	@FindBy(xpath="//a[@href='restaurants.php']")
	private WebElement restModClick;
	
	@FindBy(xpath="(//a[@href='index.php'])[2]")
	private WebElement hmmod;
	
	@FindBy(xpath="href=\"your_orders.php\"")
	private WebElement myordermod;
	
	@FindBy(xpath="//a[.='Choose Restaurant']")
	private WebElement choosemod;
	
	@FindBy(xpath="//a[.='Pick Your favorite food']")
	private WebElement pkmod;
	
	@FindBy(xpath="//a[.='Order and Pay']")
	private WebElement ormod;
	
@FindBy(xpath="//a[.='Pink Spaghetti Gamberoni']/../..//../../../..//input[@value='Add To Cart']")
private WebElement addtocartmod;

@FindBy(xpath="//a[@href=\"checkout.php?res_id=2&action=check\"]")
private WebElement checkoutmod;
	
	public WebElement getCheckoutmod() {
	return checkoutmod;
}
	public WebElement getAddtocartmod() {
	return addtocartmod;
}
	public DishesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getRestModClick() {
		return restModClick;
	}
	public WebElement getHmmod() {
		return hmmod;
	}
	public WebElement getMyordermod() {
		return myordermod;
	}
	public WebElement getChoosemod() {
		return choosemod;
	}
	public WebElement getPkmod() {
		return pkmod;
	}
	public WebElement getOrmod() {
		return ormod;
	}
	public void pickyourFavorite(WebDriver driver)
	{
		addtocartmod.click();
		checkoutmod.click();
		String expectedresult3 = "Order and Pay";
		String actual3 = driver.findElement(By.linkText("Order and Pay")).getText();

		if(actual3.equals(expectedresult3)) {
			System.out.println("Order and Pay is displayed");
		}
		else {
			System.out.println("Order and Pay is not displayed");
		}

	}
}
