<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${headerMessage}</h1>
<form action="./formadmission.sh" method="POST">
	<pre>
		Name:			<input type="text" name="username"/>
		Location:		<input type="text" name="location"/>
		Mobile:			<input type="text" name="mobile"/>
		DOB:			<input type="text" name="dob"/>
		Skills:			<select name="skill" multiple="multiple" style="width:100px;">
							<option value="java">Java</option>
							<option value="vb">VB</option>
							<option value="c">C</option>
						</select>
		Country: 		<input type="text" name="address.country"/>
		State: 			<input type="text" name="address.state"/>
		City:			<input type="text" name="address.city"/>
		Pincode:		<input type="text" name="address.pincode"/>
						<input type="submit" value="Submit"/>
	</pre>
</form>

</body>
</html>