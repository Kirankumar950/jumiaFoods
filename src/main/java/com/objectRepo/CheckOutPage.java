package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
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
     
	@FindBy(name="submit")
	private WebElement orderbuttonmod;
	
	public  CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void checkoutpage(WebDriver driver)
	{
		orderbuttonmod.click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().accept();
		String text2 = driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().accept();
		String expectedresult4 = "My Orders";
		String actual4 = driver.findElement(By.xpath("//a[@href='your_orders.php']")).getText();
		if(actual4.equals(expectedresult4)) {
			System.out.println("myorders page is display");
		}
		else {
			System.out.println("myorders page is not display");
		}

	}
	
}
