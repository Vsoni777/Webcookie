package com.Servelt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBservice;
import com.Dao.User;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User log=new User();
		log.setUser(request.getParameter("userid"));
		log.setPass(request.getParameter("pass"));
		String target="";
		DBservice db=new DBservice();
		boolean isvalid=db.check(log);
		System.out.println(isvalid);
		if(isvalid==true)
		{
			HttpSession session = request.getSession(false);
			if(session!=null)
			{
				session.invalidate();
			}
			session = request.getSession(true);
			session.setAttribute("username", log.getUser());
			target="/logout.jsp";
		}else
	{
		request.setAttribute("sms","Invalid Username/Password");
		target="/Login.jsp";
	}	
		RequestDispatcher rd = getServletContext().getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
