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
        <%--insert error color for when login isn't right --%>
        </style>
		
	</head>

	<body>
		Welcome to the home page
		<div id = "button">
		<form action="${pageContext.servletContext.contextPath}/moduleList" method="get">
				<input name="direct" type="submit" value="Module List" />
		</form>
		</div>
		<form action="${pageContext.servletContext.contextPath}/homePage" method="get">
			<table>
				<tr>
					<td class="label">Username:</td>
					<td><input type="text" name="first" size="12" value="${login.username}" /></td>
				</tr>
				<tr>
					<td class="label">Password:</td>
					<td><input type="text" name="second" size="12" value="${login.password}" /></td>
				</tr>
			</table>
			<input type="Submit" name="submit" value="Login">
		</form>
	</body>
</html>
