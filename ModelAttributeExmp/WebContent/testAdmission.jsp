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

	<form:errors path="student2.*"></form:errors>
	<form:form action="./test.sh" commandName="student2" method="POST">
		Name: <form:input path="stname"/><br>
		cont: <form:input path="stcont"/><br>
		<form:button name="btn" value="Submit"></form:button>
		
	</form:form>
</body>
</html>