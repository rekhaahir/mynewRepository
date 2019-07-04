package com.him.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.him.bean.Question;
import com.him.dao.EmpDao;

@WebServlet("/LoginDetails")
public class LoginDetails extends HttpServlet {

	public LoginDetails() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("Uname");
		String p = request.getParameter("pwd");

		try {
			Question q = new Question();

			if (EmpDao.validate(n, p, q)) {

				/*
				 * Question q = new Question(); HttpSession session=request.getSession();
				 * session.setAttribute("uname",q.getL_ID());
				 */

				HttpSession session = request.getSession();
				//session.setAttribute("Uname", q.getName());
				session.setAttribute("lid", q.getNew_LID());
				

				java.util.List<Question> listuser = EmpDao.FetchData(q);
				request.setAttribute("listuser", listuser);
				
				RequestDispatcher rd = request.getRequestDispatcher("Fetch.jsp");
				rd.forward(request, response);

//				out.print("User Valid.");
//				response.sendRedirect("Fetch.jsp");

			} else {

				out.print("User Invalid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
