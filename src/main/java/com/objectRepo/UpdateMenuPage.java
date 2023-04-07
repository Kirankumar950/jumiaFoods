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

public class UpdateMenuPage {

	
	@FindBy(name="file")
	private WebElement filebtn;
	
	@FindBy(name="res_name")
	private WebElement resbtn;
	
	
	@FindBy(name="submit")
	private WebElement savebtn;
	
	public UpdateMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void updatemenu(WebDriver driver,ExcelUtility elib,WebDriverUtility wlib) throws Throwable
	{
//		 String expectedres2 = "Add Menu to Restaurant";
//			String actualres2 = driver.findElement(By.xpath("//h4[.='Add Menu to Restaurant']")).getText();
//			if(actualres2.equals(expectedres2)) {
//				System.out.println("Add Menu to Restaurant page is displayed");
//			}
//			else {
//				System.out.println("Add Menu to Restaurant page is not displayed");
//			}

			HashMap<String, String> fil = elib.readMultipleDataFromExcel("Sheet3");
			for(Entry<String, String> set:fil.entrySet())
			{
				WebElement data = driver.findElement(By.name(set.getKey()));
				data.clear();
				data.sendKeys(set.getValue());
			}
		String path = elib.readDataFromExcel("Sheet3", 3, 1);
			File f=new File(path);
		     String abpath = f.getAbsolutePath();
		     filebtn.sendKeys(abpath);
	         //driver.findElement(By.name("file")).sendKeys(abpath);
		    WebElement res = resbtn;
		    wlib.select("Check Post", res);
		    savebtn.click();
//			String expectedres3 = "Record Updated!";
//			String actualres3 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']")).getText();
//				if(actualres3.equals(expectedres3)) {
//					System.out.println("Record Updated! msg is displayed");
//				}
//				else {
//					System.out.println("Record Updated! msg is not displayed");
//				}
	}
}
