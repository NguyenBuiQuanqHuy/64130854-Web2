
<%@page import="java.util.Date"%>
<%@page import="java.sql.DatabaseMetaData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP Example</title>
</head>
<body>
	<h1>Hello JSP 64CLC</h1>
	<%= new Date().toString() %>
	<%
		int x;
	x= 5;
	int y=x+99;
	%>
	<hr>
	<%=y %>
	<hr>
	<%out.print(y) ;%>
</body>
</html>