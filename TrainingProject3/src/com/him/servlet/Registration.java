package com.him.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.him.bean.RegistrationBean;
import com.him.dao.EmpDao;

@WebServlet("/Registration")  
@MultipartConfig(maxFileSize = 16177216)
public class Registration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
	
		InputStream inputStream = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Password = request.getParameter("Password");
		String ConfirmPassword = request.getParameter("ConfirmPassword");
		String EmailId	= request.getParameter("EmailId");
		String UserName = request.getParameter("UserName");
		
		/* Part photo = request.getPart("photo"); */
		
		
		/* Part filepart = request.getPart("photo"); */
		/* inputStream = filepart.getInputStream(); */
		/*
		 * Part part = request.getPart("photo"); inputStream = part.getInputStream();
		 */
		
		/*
		 * Part filepart =request.getPart("photo");
		 * 
		 * System.out.println("//checking servlet"); System.out.println(filepart); if
		 * (filepart != null) { // prints out some information for debugging
		 * System.out.println(filepart.getName());
		 * System.out.println(filepart.getSize());
		 * System.out.println(filepart.getContentType());
		 * 
		 * // obtains input stream of the upload file inputStream =
		 * filepart.getInputStream(); }
		 */
		/*
		 * InputStream inputStream1 ; Part filePart = request.getPart("photo");
		 */
		String Company = request.getParameter("Company");	
		
		RegistrationBean rs = new RegistrationBean();
		
		rs.setFirstName(FirstName);
		rs.setLastName(LastName);
		rs.setPassword(Password);
		rs.setConfirmPassword(ConfirmPassword);
		rs.setEmailId(EmailId);
		rs.setCompany(Company);
		/* rs.setPhoto(photo); */
		/* rs.setPhoto(filepart); */
	//	rs.set
		//rs.setInputStream(inputStream1);
		rs.setUserName(UserName);
		

		
		int status = EmpDao.registration(rs);
		if(status>0)
		{
			out.print("<p>Record successfull inserted</p.");
			  request.getRequestDispatcher("index.jsp").include(request, response);  
		}else
		{
			out.print("error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	

}
