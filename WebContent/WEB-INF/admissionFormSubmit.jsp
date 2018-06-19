<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC</title>
</head>
<body>
	
	<h2>${defaultMessage}</h2><br>
	
	<label><b>Name:</b></label>${student1.sName}<br><br>
	<label><b>Hobby:</b></label>${student1.sHobby}<br><br>
	<label><b>Gender:</b></label>${student1.sGender}<br><br>
	<label><b>Mobile:</b></label>${student1.sMobile}<br><br>
	<label><b>DOB:</b></label>${student1.sDob}<br><br>
	<label><b>Skills:</b></label>${student1.sSkills}<br><br>
	<label><b>Student Address</b></label><br>
	<label><b>Country:</b></label>${student1.sAddress.country}<br>
	<label><b>State:</b></label>${student1.sAddress.state}<br>
	<label><b>City:</b></label>${student1.sAddress.city}<br>
	<label><b>Pin Code:</b></label>${student1.sAddress.pincode}<br>
	
	
	<label><b><a href="admissionForm.html">Back To Form</a></b></label>
</body>
</html>