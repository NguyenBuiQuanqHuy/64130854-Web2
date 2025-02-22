<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
	int sum(int a, int b){
		return a+b;
	}
	%>
<body>
<h1>HELLO JSP</h1>
	<%
	int a=3;
	int b=4;
	int c=sum(a, b);
	out.print(a);
	out.print("+");
	out.print(b);
	out.print("=");
	out.print(c);
	%>
</body>
</html>