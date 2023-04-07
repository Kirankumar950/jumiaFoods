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

public class UpDateRestaurant {
@FindBy(name="o_hr")
private WebElement hrtext;

@FindBy(name="c_hr")
private WebElement closeHr;

@FindBy(name="o_days")
private WebElement openDays;

@FindBy(name="file")
private WebElement pat;

@FindBy(name="c_name")
private WebElement ChCategory;

@FindBy(name="submit")
private WebElement click;

@FindBy(xpath="//strong[.='Record Updated!']")
private WebElement update;


public  UpDateRestaurant(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void upDateRestaurant(WebDriverUtility wlib,WebDriver driver,ExcelUtility eLib) throws Throwable 
{
	HashMap<String,String> map = eLib.readMultipleDataFromExcel("Sheet5");
	for(Entry<String, String> set:map.entrySet())
	{
			
			WebElement data = driver.findElement(By.name(set.getKey()));
			data.clear();
			data.sendKeys(set.getValue());
			
	}

	wlib.select("7am",hrtext);
	wlib.select("7pm", closeHr);
	wlib.select("24hr-x7",openDays);
	wlib.select("Indian", ChCategory);

	String path = eLib.readDataFromExcel("Sheet5", 5, 1);
	File f=new File(path);
	String abPath = f.getAbsolutePath();
	pat.sendKeys(abPath);
	click.click();
	boolean updated = update.isDisplayed();
	//boolean updated = driver.findElement(By.xpath("//strong[.='Record Updated!']")).isDisplayed();
	if(updated==true)
	{
		System.out.println("Record Updated Successfully");
	}
	else
	{
		System.err.println("Record is not Updated");
	}

}
}
