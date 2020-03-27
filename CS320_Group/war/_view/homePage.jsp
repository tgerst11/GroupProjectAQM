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
        		.heading {
        			font-size: 150%;
        			text-align: center;
  					font-family: "Lucida Console", Courier, monospace;
  					border-bottom: 5px solid #ff9d00;
				}
				#login {
					float: right;
				}
							table, th, td {
  				border: 1px solid black;
			}
        <%--insert error color for when login isn't right --%>
        </style>
		
	</head>

	<body>
		<p class="heading">Welcome to the Air Quality Monitor Home Page</p>
		<div id = "login">
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
		</div>
		<div id = "button">
		<form action="${pageContext.servletContext.contextPath}/moduleList" method="get">
				<input name="direct" type="submit" value="Module List" />
		</form>
		</div>
	</body>
</html>
