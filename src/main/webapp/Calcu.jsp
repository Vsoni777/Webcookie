<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	int a=0,b=0,c=0;
	try{
	a=Integer.parseInt(request.getParameter("t1"));
	b=Integer.parseInt(request.getParameter("t2"));
	}catch(Exception e){
		
	}
	String op=(String)request.getParameter("b1");
	if(op.equals("ADD")){
		c=a+b;
	}else if(op.equals("Sub")){
		c=a-b;
	}else if(op.equals("Div")){
		c=a/b;
	}else if(op.equals("Multi")){
		c=a*b;
	}
	request.setAttribute("result", new Integer(c));
%>
<jsp:forward page="Calculator.jsp"></jsp:forward>
</body>
</html>