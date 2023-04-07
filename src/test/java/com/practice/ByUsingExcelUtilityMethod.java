package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericUtilities.ExcelUtility;

public class ByUsingExcelUtilityMethod
{
	@Test(dataProvider = "data")
	public void dataa(String name,String src,String  dest)
	{
		System.out.println("employee----->"+name+"---company---->"+src+"---designation--->"+dest);
	}

	@DataProvider
	public Object[][] data() throws Throwable
	{
		ExcelUtility elib = new ExcelUtility();
		Object[][] value = elib.readMulSetOfData("Sheet7");
		return value;
	}
	
}

