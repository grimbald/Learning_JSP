<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" type="com.gowor.MyBean" scope="session" />
	<div class="panel panel-default">
		<div class="panel-heading">Your data:</div>
		<div class="panel-body">
			<ul class="list-group">
				<li class="list-group-item">Login: <jsp:getProperty name="bean"
						property="login" /></li>
				<li class="list-group-item">Remember Me: <jsp:getProperty
						property="rememberMe" name="bean" /></li>
			</ul>
		</div>
	</div>
</body>
</html>