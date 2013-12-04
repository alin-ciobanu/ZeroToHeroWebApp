<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Hello World!</h2>
<p>${message}</p>

<table>
	<thead>
		<th>
			Role name
		</th>
		<th>
			ID
		</th>
	</thead>
	<c:forEach var="role" varStatus="status" items="${roleList}">
		<tr>
			<td>${role.name}</td>
			<td>${role.id}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>
