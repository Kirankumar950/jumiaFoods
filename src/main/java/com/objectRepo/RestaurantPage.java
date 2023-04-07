package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantPage {
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
	
	@FindBy(xpath="(//a[@href=\"dishes.php?res_id=2\"])[3]")
	private WebElement vmmod;
	
	public WebElement getVmmod() {
		return vmmod;
	}
	public RestaurantPage(WebDriver driver)
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
	public void chooseRestaurant(WebDriver driver)
	{
		vmmod.click();
		String expectedresult2 = "Pick Your favorite food";
		String actual2 = driver.findElement(By.linkText("Pick Your favorite food")).getText();
		if(actual2.equals(expectedresult2)) {
			System.out.println("Pick Your favorite food page is displayed");
		}
		else {
			System.out.println("Pick Your favorite food page is not displayed");
		}

	}
}
