<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Welcome</h1>
	<%
		String user=(String)session.getAttribute("username");
		if(user!=null){
			%>
			<h1  Style="color:red;"><%=user %></h1>
			<% 
		}
	%>

	<a href="ProfileServlet"><button>Logout</button></a>
	</center>
</body>
</html>