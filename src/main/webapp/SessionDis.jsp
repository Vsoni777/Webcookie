<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
		<%
		
		String user = (String)session.getAttribute("username");
		if(user!=null)
		{
		out.println(user);
		%>
		<p>Thank For Visiting Our Website</p>
		<%
		}
		session.invalidate();
		%>
		<br>
		<a href="Login.jsp">Click Here for Login Again.....!</a>
</body>
</html>