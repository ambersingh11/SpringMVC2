<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Request</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
	<form:form action="ShowForm" method="POST">
	<form:errors path="*"/><br>
		<label>Name</label>
		<form:input path="name"></form:input>
		<label>Mobile Number</label>
		<form:input path="mobileNumber"></form:input>
		<label>Email</label>
		<form:input path="email"></form:input>
		<label>Type</label>
		<form:select path="type" items="${type}"></form:select>
		<input type="submit" value="Add">
	</form:form>
</body>
</html>