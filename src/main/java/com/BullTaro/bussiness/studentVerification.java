package com.BullTaro.bussiness;

import java.sql.Connection;
import java.sql.SQLException;

import com.BullTaro.DataPeristance.studentData;
import com.BullTaro.dataAccess.dataStore;
import com.BullTaro.entity.student;

public class studentVerification {
	
	public boolean isValid(student student) throws SQLException
	{
		dataStore ds = new dataStore();
		Connection con = ds.getDatabaseConnection();
		
		studentData st = new studentData();
		boolean verify = st.newStudent(con, student.getStudentName());
		System.out.println(" verify in studentVerification is : "+verify);
		
		return verify;
	}
	
	public void storeData(student s) throws SQLException
	{
		
		dataStore ds = new dataStore();
		Connection con = ds.getDatabaseConnection();
		
		studentData sd = new studentData();
		sd.insertOperation(con, s);	
	}
	
	

}
