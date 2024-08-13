package com;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookie")
public class GetCookie extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    out.println("Username: " + cookie.getValue() + "<br>");
                }
                if (cookie.getName().equals("color")) {
                    out.println("Favorite Color: " + cookie.getValue() + "<br>");
                }
            }
        } else {
            out.println("No cookies found!");
        }

        out.println("</body></html>");
        out.close();
    }
}
