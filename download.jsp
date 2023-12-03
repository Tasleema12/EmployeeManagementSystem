<%@page import="dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> emps = (List<Employee>) request.getAttribute("objects");
	%>
	<table Border=>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>password</th>
			<th>gender</th>
			<th>date</th>
			<th>delete</th>
			<th>Update</th>
		</tr>
		<%
		for (Employee uv : emps) {
		%>
		<tr>
			<td><%=uv.getId()%></td>
			<td><%=uv.getName()%></td>
			<td><%=uv.getEmail()%></td>
			<td><%=uv.getPwd()%></td>
			<td><%=uv.getGender()%></td>
			<td><%=uv.getDate()%></td>
			<td><a href="pc?first=<%=uv.getId()%>">Remove</a></td>
			<td><a
				href="Update.jsp?id=<%=uv.getId()%>&&name=<%=uv.getName()%>&&email=<%=uv.getEmail()%>&&pwd=<%=uv.getPwd()%>&&gender=<%=uv.getGender()%>&&date=<%=uv.getDate()%>">Edit</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>