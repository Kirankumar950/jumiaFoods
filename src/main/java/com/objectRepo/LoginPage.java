package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="username")
private WebElement user;
@FindBy(name="password")
private WebElement pass;
@FindBy(name="submit")
private WebElement lgclick;
 
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLgclick() {
	return lgclick;
}

public void login(String username,String password) {
	user.sendKeys(username);
	pass.sendKeys(password);
	lgclick.click();
}


}
