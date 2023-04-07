package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {
@FindBy(xpath="//td[.=' mutton fry']/following-sibling::td[3]")
private WebElement dispatchmod;
public MyOrdersPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void myOrdersPage()
{
	String actual=dispatchmod.getText();
	String expectedresult5 = "Dispatch";
	if(actual.equals(expectedresult5)) {
		System.out.println("order is dispatch");
	}
	else {
		System.out.println("order is not dispatch");
	}
}
}
