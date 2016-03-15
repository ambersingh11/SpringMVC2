<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>One Car Rental request with following details added</b>
	<ol>
		<li>${command.name}</li>
		<li>${command.mobileNumber}</li>
		<li>${command.email}</li>
		<li>${command.type}</li>
	</ol>	
	<br>
	<a href="showAll">View Bookings</a>
	<a href="">Cancel Bookings</a>
	<a href="">Booking History</a>
	
	<form action="check">
	<label>Enter your name again</label>
	<input type="text" name="name"/>
	<input type="submit" value="Look"/>
	</form><br>
	Previous Bookings
	<p>${lastBooking}</p>
</body>
</html>