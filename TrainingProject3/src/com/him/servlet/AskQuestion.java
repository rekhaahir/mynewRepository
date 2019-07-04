package com.him.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.him.bean.Question;
import com.him.dao.EmpDao;

@WebServlet("/AskQuestion")
public class AskQuestion extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String qus = request.getParameter("Question");

		/*
		 * HttpSession session=request.getSession(false); String
		 * n=(String)session.getAttribute("uname");
		 */

		
		Question q = new Question();
		/* int d=Integer.parseInt(n); */
		q.setQuestion(qus);
		/* q.setL_ID(d); */
		/*
		 * System.out.println("id "+d); System.out.println("login id"+n);
		 */

		try {
			HttpSession session = request.getSession(false);
			int i = (int) session.getAttribute("lid");
			//String s = (String) session.getAttribute("Uname");
			System.out.println("servlet");
			System.out.println(qus);
			System.out.println(i);
			EmpDao.AskQuestion(q, i);

			/* out.print("Hello, "+n+" Welcome to Profile"); */
			response.sendRedirect("Fetch.jsp");

			System.out.println("error");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
