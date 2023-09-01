package com.BullTaro.DataPeristance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.BullTaro.entity.student;

public class studentData {
	
	public boolean newStudent(Connection con, String studentName) throws SQLException
	{
		String query =  "select Name from registration;";
		
		Statement stmt = con.createStatement();
		
		ResultSet res = stmt.executeQuery(query);
		
		boolean verify = true;
		
		while(res.next())
		{
		   if(res.getString(1).equals(studentName))
		   {
			   verify = false;
		   }
		}
       stmt.close();
       con.close();
		return verify;
	}
	
	public void insertOperation(Connection con, student s) throws SQLException
	{
		String query = "insert into registration values( 1 ,";
		
		String studentName = s.getStudentName();
		String password = s.getPassword();
		
		query = query+studentName+" ,"+password+" ) ;";
		
		Statement stmt = con.createStatement();
		stmt.execute(query);
		
		stmt.close();
		con.close();
	}

}
