<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Title here</title>
</head>
<body>
	<h1 style="color: red; text-align: center">Student Registration
		Form</h1>
	<form action="register" method="post">
		<table align="center">
			<tr>
				<td>Student No</td>
				<td><input type="text" name="sno"></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Student Address</td>
				<td><input type="text" name="saddrs"></td>
			</tr>
			<tr>
				<td>Student Average</td>
				<td><input type="text" name="savg"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>