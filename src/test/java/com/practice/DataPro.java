package com.practice;

import org.testng.annotations.DataProvider;

public class DataPro {
@DataProvider
public Object[][] data()
{
	Object[][] obj=new Object[2][3];
	 obj[0][0]=361;
	 obj[0][1]="TestYantra";
	 obj[0][2]="Bangalore";
	 
	 obj[1][0]=363;
	 obj[1][1]="software";
	 obj[1][2]="solutions";
	 return obj;
}
}
