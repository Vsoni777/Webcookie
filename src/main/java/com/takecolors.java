package com;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/takecolors")
	public class takecolors extends HttpServlet {
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String username = request.getParameter("t1");
	        String color = request.getParameter("t2");
	        Cookie usernameCookie = new Cookie("username", username);
	        Cookie colorCookie = new Cookie("color", color);
	        response.addCookie(usernameCookie);
	        response.addCookie(colorCookie);
	        response.sendRedirect("GetCookie");
	    }
	}


