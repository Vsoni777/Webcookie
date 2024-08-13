<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="CheckServlet" method="post">
	<label for="userid">Username</label><input type="text" name="userid">
	<label for="password">passWord</label><input type="password" name="pass">
	<button type="submit">Login</button>
	</form>
	<%
		String sms=(String )request.getAttribute("sms");
		if(sms!=null){
			out.println(sms);
		}
	%>
</body>
</html>