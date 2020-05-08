<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Add Module</title>
		<style type="text/css">
		<%@include file="/addModule.css"%>
	</style>
	</head>

	<body>
		<div class = "header">
        	<ul>
        		<li> <a href = "${pageContext.servletContext.contextPath}/homePage"> Home </a></li>
       		</ul>
		</div>
		<div class = "form-area">	
		<form action="${pageContext.servletContext.contextPath}/addModule" method="post">
			<p>Module Location Name:</p>
			<input type="text" name="username" placeholder="Enter a Module Location Name" size="12" value="${username}"/>
			<input type="Submit" name="submitaddmodule" value="Add Module to Database">
		</form>
		</div>	
	</body>
</html>