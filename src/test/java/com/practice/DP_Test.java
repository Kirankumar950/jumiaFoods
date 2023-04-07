package com.practice;

import org.testng.annotations.Test;

public class DP_Test {

	@Test(dataProviderClass=DataPro.class,dataProvider="data")
	public void getData(String src,String dest,String loc)
	{
		System.out.println("from----->"+src+"  to----->"+dest+"  location---->"+loc);
		//Reporter.log("from----->"+src+"  to----->"+dest+"  location---->"+loc);
	}
    }
