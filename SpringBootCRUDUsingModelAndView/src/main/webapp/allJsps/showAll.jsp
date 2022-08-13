<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All</title>
</head>
<body>
<h1> Welcome to Show All Page</h1>
<br><br>
<a href="/create">Create</a><br><br>
	<c:if test="${not empty laptops}">
		<table border=1 align=center style="text-align:center">
			<thead>
	          <tr>
	             <th>LapId</th>
	             <th>LapName</th>
	             <th>LapColor</th>
	             <th>ACTION1</th>
	             <th>ACTION2</th>
	          </tr>
	    	</thead>
	    	<tbody>
		    	<c:forEach items="${laptops}" var="lap">
		    		<tr><td>${lap.lapId}</td><td>${lap.lapName}</td><td>${lap.color}</td>
		    		<td><a href="/update/${lap.lapId}">Update</a></td><td><a href="/delete/${lap.lapId}">Delete</a></td></tr>
				</c:forEach>
	    	</tbody>
		</table>
	</c:if>
</body>
</html>