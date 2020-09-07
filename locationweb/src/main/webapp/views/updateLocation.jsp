<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update location service</title>
</head>
<body>
<form action="saveEditLocation" method="get" >
<pre>
id: <input type="text" name="id" value="${location.id }" readonly="readonly"> 
name: <input type="text" name="name"value="${location.name }"> 
code: <input type="text" name="code"value="${location.code }"> 
type: urban<input type="radio" name="type" value="urban" ${location.type=='urban'?'checked':''} > 
       rural<input type="radio" name="type" value="rural" ${location.type=='rural'?'checked':''} > 
     <input type="submit" value="save">
     </pre>
</form>

</body>
</html>