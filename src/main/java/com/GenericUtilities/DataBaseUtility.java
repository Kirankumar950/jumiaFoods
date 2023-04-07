package com.GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	Connection con=null;
	/**
	 * 
	 * @throws Throwable
	 * @author Dell
	 */
	public void connectToDB() throws Throwable
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IpathConstants.DBURL, IpathConstants.DBUSERNAME, IpathConstants.DBPASSWORD);
	}

/**
 * 
 * @param query
 * @param expDate
 * @param columnIndex
 * @return
 * @throws Throwable
 * @author Dell
 */
	public String executeQueryAddGetData(String query,String expData,int columnIndex) throws Throwable
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag=false;
		while(result.next()) {
			String data = result.getString(columnIndex);
			if(data.equalsIgnoreCase(expData)) {
				flag=true;
				break;
			}
		}

		if(flag)
		{
			System.out.println("data is verified");
			return expData;
		}
		else {
			System.out.println("date is not update");
			return " ";
		}
	}

/**
 * 
 * @throws Throwable
 * @author Dell
 */
	public void closeDB() throws Throwable
	{
		con.close();
		System.out.println("data base connectivity is close");
	}
}