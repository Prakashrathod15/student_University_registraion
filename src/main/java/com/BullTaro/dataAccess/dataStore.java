package com.BullTaro.dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataStore {
	
	public Connection getDatabaseConnection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/studentRegistration";
		String user = "root";
		String Password = "Vinayaksir@2022";
	
		
		Connection con = DriverManager.getConnection(url,user,Password);
		
		return con;	
	}

}
