<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Save</h1>
<form action="./empsave.sh">
	<pre>
		Name: <input type="text" name="empName"/>
		Cont: <input type="text" name="empCont"/>
		Address: <textarea cols="20" rows="3" name="empAddrs"></textarea>
		<input type="submit" value="Submit"/>
	</pre>
</form>


<h1>Employee Update</h1>
<form action="./empupdate.sh">
	<pre>
		Id:   <input type="text" name="empId"/>
		Name: <input type="text" name="empName"/>
		Cont: <input type="text" name="empCont"/>
		Address: <textarea cols="20" rows="3" name="empAddrs"></textarea>
		<input type="submit" value="Submit"/>
	</pre>
</form>

</body>
</html>