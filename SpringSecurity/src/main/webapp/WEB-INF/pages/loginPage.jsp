<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<c:if test ="${not empty error}"><div>${error}</div></c:if>
<c:if test ="${not empty message}"><div>${message}</div></c:if>
	<form name='login' action="<c:url value='/loginPage' />"  method='post'>
		<table class="table table-striped">
			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username" value="Enter UserName"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" value="Enter password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
		<input type ="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
</body>
</html>