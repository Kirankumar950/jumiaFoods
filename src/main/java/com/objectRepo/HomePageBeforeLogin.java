package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBeforeLogin {
	@FindBy(xpath="(//a[@href='index.php'])[2]")
	private WebElement hmmod;
	
	@FindBy(xpath="//a[@href='restaurants.php']")
	private WebElement restModClick;
	
@FindBy(xpath="//a[@href=\"login.php\"]")
private WebElement loginmod;

@FindBy(xpath="//a[.='Register']")
private WebElement registermod;

public HomePageBeforeLogin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void homepageBeforeLogin()
{
	loginmod.click();
}
}
