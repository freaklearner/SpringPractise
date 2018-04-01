<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script type="text/javascript">
	function request(){
		var frm = document.forms('login').elements('username').value;
		//alert(frm);
		var url = "./welcome/"+frm;
		//alert(url);
		var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		    	//alert("responseText");
		    	document.write(this.responseText);
		    }
		   };
		  xhttp.open("GET",url, false);
		  xhttp.send();
		//var elements = document.getElementById('login').elements;
		/*for(i=0;i<elements.length;i++){
			if(elements[i].name == "username"){
				//alert(elements[i].value);
				var url = "./welcome/"+elements[i].value
				var xmlhttp = new XMLHttpRequest();
				xmlhttp.open('GET',,false);
				xmlhttp.send(null);
				document.write(xmlhttp.responseText);
			}
		*/
	}
	</script>
</head>
<body>
<form name="login">
	<pre>
		Name <input type="text" name="username"/>	
		<button name="submit" onclick="request();">Submit</button>
	</pre>
</form>
</body>
</html>