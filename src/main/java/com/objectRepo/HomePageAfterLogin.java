package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAfterLogin {
@FindBy(xpath="//a[@href='restaurants.php']")
private WebElement restModClick;

@FindBy(xpath="(//a[@href='index.php'])[2]")
private WebElement hmmod;

@FindBy(xpath="href=\"your_orders.php\"")
private WebElement myordermod;

public HomePageAfterLogin(WebDriver driver)
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
public void getResto(WebDriver driver) {
	restModClick.click();
	String expectedresult1 = "Choose Restaurant";
	String actual1 = driver.findElement(By.linkText("Choose Restaurant")).getText();
	if(actual1.equals(expectedresult1)) {
		System.out.println("choose restaurant page is displayed");
	}
	else {
		System.out.println("choose restaurant page not is displayed");
	}

}
	

}
