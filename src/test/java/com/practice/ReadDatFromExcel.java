package com.practice;

import org.testng.annotations.Test;

public class ReadDatFromExcel {

	@Test(dataProviderClass = DataProviderFromExcel.class,dataProvider = "data1")
	public void getData1(String src,String dest,String loc)
	{
		System.out.println("ID No----->"+src+"  to----->"+dest+"  location---->"+loc);
		//Reporter.log("from----->"+src+"  to----->"+dest+"  location---->"+loc);
	}
	
	@Test(dataProviderClass=DataPro.class,dataProvider="data")
	public void getData2(int src,String dest,String loc)
	{
		System.out.println("from----->"+src+"  to----->"+dest+"  location---->"+loc);
		//Reporter.log("from----->"+src+"  to----->"+dest+"  location---->"+loc);
	}
	
	
	
	
	
	
	
	
}
