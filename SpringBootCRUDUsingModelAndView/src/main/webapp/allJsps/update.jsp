<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h1> Welcome to Update Page</h1>
<br><br>
<a href="/home">Home</a><br><br>
	<c:if test="${not empty laptop}">
	
	<form action="/create/updateOne">
	  <label for="lapId">Laptop Id:</label><br>
	  <input type="text" readonly id="lapId" name="lapId" placeholder="Id for Laptop" value="${laptop.lapId}"><br>
	  <label for="lapName">Laptop Name:</label><br>
	  <input type="text" id="lapName" name="lapName" placeholder="Name for Laptop" value="${laptop.lapName}"><br>
	  <label for="color">Laptop Color:</label><br>
	  <input type="text" id="color" name="color" placeholder="Color for Laptop" value="${laptop.color}"><br><br>
	  <button type="submit">Update</button> <span ></span> <button type="reset">Reset</button>
	</form>
	
	</c:if>
	
</body>
</html>