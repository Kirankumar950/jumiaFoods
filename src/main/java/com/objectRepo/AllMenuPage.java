package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMenuPage {

	@FindBy(xpath="//td[.='Check Post']/following-sibling::td[5]/a[2]")
	private WebElement editbtn;
	
	public AllMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void allmenupage(WebDriver driver)
	{
		String expectedres = "All Menu";
		 String actualres1 = driver.findElement(By.xpath("//h4[.='All Menu']")).getText();
		 if(actualres1.equals(expectedres)) {
			 System.out.println("all menu page is displayed");
		 }
		 else {
			 System.out.println("all menu page is not displayed");
			 
		 }
		 editbtn.click();

	}
}
