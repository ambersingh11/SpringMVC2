<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All requests</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
</head>
<body>
	<c:forEach items="${dataList}" var="req">
		<spring:url value="/findRequest/${req.name}" var="url" htmlEscape="true"></spring:url>
		<a href="${url}">${req.name} </a>
		<c:out value="${req.mobileNumber}"></c:out>
		<br>
	</c:forEach>
</body>
</html>