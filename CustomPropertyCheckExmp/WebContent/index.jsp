<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./welcome.sh" method="POST">
	<pre>
		Name	:	<input type="text" name="username"/>
		Cont	:	<input type="text" name="usercont"/>
		DOB	:	<input type="text" name="userdob"/>
		Skills	:	<select name="skills" multiple="multiple" style="width:100px">
						<option value="java">Java</option>
						<option value="VB">VB</option>
						<option value="C">C</option>
						<option value="C++">C++</option>
					</select>
		<input type="submit" value="Submit"/>	 
	</pre>
</form>

</body>
</html>