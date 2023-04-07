package com.objectRepo;

import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.WebDriverUtility;

public class AddMenuPage {

	@FindBy(xpath="//h4[.='Add Menu']")
	private WebElement addmenutext;
	
	@FindBy(id="lastName")
	private WebElement lastbtm;
	
	@FindBy(name="res_name")
	private WebElement resbtm;
	
	@FindBy(name="submit")
	private WebElement clickbtn;

	
	
	public AddMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void adminmenu(WebDriver driver,ExcelUtility elib,WebDriverUtility wlib) throws Throwable
	{
		 String expectedres1 = "Add Menu";
			String actual1= addmenutext.getText();
				//String actual1 = driver.findElement(By.xpath("//h4[.='Add Menu']")).getText();
		          if(actual1.equals(expectedres1)) {
		        	  System.out.println("add menu page is displayed");
		          }
		          else {
		        	  System.out.println("add menu page is not displayed");
		        	  
		          }
		          HashMap<String, String> map = elib.readMultipleDataFromExcel("Sheet1");
		          
	      	for( Entry<String, String> set:map.entrySet())
	  		{
	  			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	      	} 
		      	
		     String path = elib.readDataFromExcel("Sheet1", 3, 1);
		      	 File f=new File(path);
		          String abpath = f.getAbsolutePath();
		          lastbtm.sendKeys(abpath);
		         // driver.findElement(By.id("lastName")).sendKeys(abpath);
		        WebElement res = resbtm;
		        wlib.select("Check Post", res);
		        clickbtn.click();      
//		        boolean actual2 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']")).isDisplayed();
//		          if(actual2==true) {
//		        	  System.out.println("New Dish Added Successfully ");
//		          }
//		          else {
//		        	  System.out.println("New Dish not Added  Successfully ");
//		        	  
//		          }
		         
		}
	}

