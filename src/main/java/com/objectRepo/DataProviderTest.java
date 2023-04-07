package com.objectRepo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "data")
	public void getData(String src,String dest,String loc)
	{
		//System.out.println("from----->"+src+"  to----->"+dest+"  location---->"+loc);
		Reporter.log("from----->"+src+"  to----->"+dest+"  location---->"+loc);
	}
	
	
	
	@DataProvider
	public Object[][] data()
	{
	Object[][] obj=new Object[2][3];
		 obj[0][0]="Qspider";
		 obj[0][1]="TestYantra";
		 obj[0][2]="Bangalore";
		 
		 obj[1][0]="TestYantra";
		 obj[1][1]="software";
		 obj[1][2]="solutions";
		 return obj;
	 }
	
}
