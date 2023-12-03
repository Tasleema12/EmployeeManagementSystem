<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
ID:<input type="number" name="id" placeholder="ID" value="<%=request.getParameter("id")%>" readonly="readonly"><br>
Name:<input type="text" name="name" placeholder="Name" value="<%=request.getParameter("name")%>"><br>
Email:<input type="email" name="email" placeholder="email" value="<%=request.getParameter("email")%>"><br>
PassWord:<input type="password" name="password" placeholder="Password" value="<%=request.getParameter("pwd")%>"><br>
DOB:<input type="date" name="dob" placeholder="Date of Birth" value="<%=request.getParameter("date")%>"><br>
Male:<input type="radio" name="gender" value="male">
Female:<input type="radio" name="gender" value="female"><br>

<button type="submit">Submit</button> 
<button type="reset">Cancel</button>
</form>
</body>
</html>