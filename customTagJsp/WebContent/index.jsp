<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mta" uri="./WEB-INF/myTag.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Test of JSP custom tag</h1>
	<mta:myTag customString="Ha ha ha!"/>
	<mta:header date="<%= new Date(System.currentTimeMillis()).toString() %>">heheszki</mta:header>
	
	<mta:lista>
		<mta:pozycja>jeden</mta:pozycja>
		<mta:pozycja>dwa</mta:pozycja>
	</mta:lista>
</body>
</html>