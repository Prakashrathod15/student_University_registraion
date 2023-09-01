package com.BullTaro.Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BullTaro.bussiness.studentVerification;
import com.BullTaro.entity.student;


@WebServlet("/studentRegistration")
public class studentRegistration extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentName = request.getParameter("studentName");
	    String studentPassword = request.getParameter("password");
	    
	    student student = new student(studentName, studentPassword);
	    
	    
	    studentVerification st = new studentVerification();
	    
	    boolean verify = false;
		try {
			verify = st.isValid(student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		PrintWriter out = response.getWriter();
		System.out.println(" value of verify in studentRegistration is "+verify);
	    if(verify)
	    {
	    	try {
				st.storeData(student);
				out.println(" data inserted successfully ");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    } else {
	    	
	    	out.println(" Student already registerd ");
	    }
	    
	    
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
