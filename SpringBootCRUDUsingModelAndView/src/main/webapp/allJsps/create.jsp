<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
<h1> Welcome to Create Page</h1>
<br><br>
<a href="/home">Home</a><br><br>

<form action="/create/createOne">
  <label for="lapId">Laptop Id:</label><br>
  <input type="text" id="lapId" name="lapId" placeholder="Id for Laptop"><br>
  <label for="lapName">Laptop Name:</label><br>
  <input type="text" id="lapName" name="lapName" placeholder="Name for Laptop"><br>
  <label for="color">Laptop Color:</label><br>
  <input type="text" id="color" name="color" placeholder="Color for Laptop"><br><br>
  <button type="submit">Create</button> <span ></span> <button type="reset">Reset</button>
</form>


</body>
</html>