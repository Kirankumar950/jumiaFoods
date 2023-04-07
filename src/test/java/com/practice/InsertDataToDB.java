package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertDataToDB {
	public static void main(String[] args) throws SQLException {
		Connection con =null;
		int result=0;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");
		Statement state = con.createStatement();
		String query = "insert into students values('kala',353,'hybal','sandeep',5);";
		 result = state.executeUpdate(query);
		}
		catch(Exception e) {
		}
		finally {
			if(result==1) {
				System.out.println("Data is update");
			}
			else {
				System.err.println("Data is not update");
			}
			con.close();
		}
	}
	
}	