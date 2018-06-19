<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:errors path="student1.*"/>
	<h2>${defaultMessage}</h2><br><br>
	<form method="post" action="admissionFormSubmit">
		Name:<input type="text" name="sName"><br>
		Hobby:<input type="text" name="sHobby"><br>
		
		Gender:
		<select name="sGender">
			<option value="">--Select--</option>
			<option value="Male">Male</option>
			<option value="Female">Female</option>
		</select><br>
		
		Mobile:<input type="text" name="sMobile"><br>
		DOB:<input type="text" name="sDob"><br>
		
		Skills:
		<select name="sSkills">
			<option value="0">--Select--</option>
			<option value="Core Java">Core Java</option>
			<option value="Spring Core">Spring Core</option>
			<option value="Spring MVC">Spring MVC</option>
			<option value="Spring MVC">Spring AOP</option>
		</select><br>
		<label><b>Student Address</b></label><br>
		Country:<input type="text" name="sAddress.country"><br>
		State:<input type="text" name="sAddress.state"><br>
		City:<input type="text" name="sAddress.city"><br>
		Pin Code:<input type="text" name="sAddress.pincode"><br>
		
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>