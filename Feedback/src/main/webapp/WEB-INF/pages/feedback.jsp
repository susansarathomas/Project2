<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Form</title>
</head>
<body>

<form method="post" action="/feedback">
	<br>
	<h3 style="margin-left: 13%" >FEEDBACK FORM</h3>
	<br>
	Name:<br>		
	<input type = "text" name = "name"  required placeholder="Enter your name" style="font-size: 10pt; height: 30px; width:500px; "> <br><br>
	Email:<br>	
	<input type = "email" name = "email"  required placeholder="Enter your email" style="font-size: 10pt; height: 30px; width:500px; "> <br><br>
	Date:<br>
	<input type = "Date" name = "date" required><br> <br>
	Subject:<br>
	<input type = "text" name = "subject" align="center" placeholder="Enter your subject of your feedback " required style="font-size: 10pt; height: 30px; width:500px; "> <br><br>
	Message:<br>
	<textarea name="message" cols="70" rows="10"></textarea><br><br>
	
<!-- 	<input type = "submit" value = "register"required>  -->
	<button type= "submit" style="margin-left: 15%; background-color:  #e7e7e7;font-size: 16px;">Submit Feedback</button>
</form>

</body>
</html>

