<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create location srvice</title>
</head>
<body>
<form action="saveLoc" method="get" >
<pre>
id: <input type="text" name="id"> 
name: <input type="text" name="name"> 
code: <input type="text" name="code"> 
type: urban<input type="radio" name="type" value="urban "> 
       rural<input type="radio" name="type" value="rural"> 
     <input type="submit" value="save">
     </pre>
</form>
${msg}

<a href="displayLocations">View All Locations</a>
</body>
</html>