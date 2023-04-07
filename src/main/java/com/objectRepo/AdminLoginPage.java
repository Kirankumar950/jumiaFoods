package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
@FindBy(name="username")
private WebElement usernamemod;

@FindBy(name="password")
private WebElement passwordmod;

@FindBy(name="submit")
private WebElement clickmod;
 public AdminLoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void adminLogin(String un,String pw)
 {
	 usernamemod.sendKeys(un);
	 passwordmod.sendKeys(pw);
	 clickmod.click();
 }
}
