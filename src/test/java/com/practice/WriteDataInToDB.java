package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class WriteDataInToDB {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		int result = 0;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");
		Statement state = con.createStatement();
		String query = "insert into students values('balaji',10,'BTM','sandeep',10)";
		  result = state.executeUpdate(query);
		}
		catch(Exception e) {
		}
		finally {
			
			if(result==1) {
				System.out.println("data is updated");
			}
			else {
				System.out.println("data is not updated");
			}
		}
	}
}
