<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Home Page</title>
		
		<style type="text/css">
                #button {
                        margin-bottom: 10px;
        		}
        
        </style>
		
	</head>

	<body>
		Welcome to the home page
		<div id = "button">
		<form action="${pageContext.servletContext.contextPath}/moduleList" method="get">
				<input name="direct" type="submit" value="Module List" />
		</form>
		</div>
	</body>
</html>
