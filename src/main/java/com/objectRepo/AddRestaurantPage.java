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

public class AddRestaurantPage {

	@FindBy(name="o_hr")
	private WebElement openhourtextf;
	
	@FindBy(name="c_hr")
	private WebElement closehourtext;
	
	@FindBy(name="o_days")
	private WebElement openDayatext;
	
	@FindBy(name="file")
	private WebElement fileuptext;
	
	@FindBy(name="c_name")
	private WebElement categorytext;
	
	@FindBy(name="submit")
	private WebElement savemod;

public AddRestaurantPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void addRestaurantPage(WebDriver driver,ExcelUtility eLib,WebDriverUtility wlib) throws Throwable
{
	HashMap<String, String> map = eLib.readMultipleDataFromExcel("Sheet6");

	for(Entry<String, String> set:map.entrySet())
	{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	}
	String path = eLib.readDataFromExcel("Sheet5", 5, 1);
	File f=new File(path);
	String abPath = f.getAbsolutePath();
	fileuptext.sendKeys(abPath);
	wlib.select("11am",openhourtextf );
	wlib.select("9pm", closehourtext);
	wlib.select("Mon-Sat", openDayatext);
	wlib.select("American", categorytext);
	savemod.click();
	Boolean RestoAdded = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']")).isDisplayed();
	System.out.println(RestoAdded);
	if(RestoAdded==true)
	{
		System.out.println("New Restaurant Added Successfully");
	}
	else
	{
		System.err.println("Restaurant Not Added");
	}
}


}
