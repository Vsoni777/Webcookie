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
	<h1>Calculation</h1><hr>
	<form action="Calcu.jsp" method="post">
	Enter number1:<input type="text" name="t1"><br><br><br>
	Enter number2:<input type="text" name="t2"><br><br><br>
	<%Integer rs=(Integer)request.getAttribute("result"); %>
	
		Result:<input type="text"  value=" <%
												if(rs!=null){
													out.print(rs);
												}%>
												"><br><br><br>
	<button type="submit" name="b1" value="ADD">ADD</button>
		<button type="submit" name="b1" value="Sub">Sub</button><br><br><br><br>
			<button type="submit" name="b1" value="Multi">Multi</button>
				<button type="submit" name="b1" value="Div">Div</button>
	</form>
	</center>
</body>
</html>