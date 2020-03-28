<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Module Data</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		body{
			background-color:#00000;
        	background-image: url(././images/lancaster.jpg);
        	background-size:contain;
        	background-repeat:no-repeat;  		
		}
		
		td.label {
			text-align: right;
		}
		table, th, td {
  			border: 1px solid black;
		}
		#header{
			font-size: 150%;
            font-weight: bold;
            color: #32a852;
			margin-top: 20px;
			margin-bottom: 20px;
            border-bottom: 2px solid #32a852;
		}
		#data{
			margin-left: 200px;
			margin-top: 0px;
			float: middle;
		}
		#location{
			margin-left: 0px;
			float: left;
		}
		#button {
            margin-bottom: 10px;
        }
        #login {
					float: right;
		}
		</style>
	</head>

	<body>
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
			<form action="${pageContext.servletContext.contextPath}/homePage" method="get">
					<input name="direct" type="submit" value="Home Page" />
			</form>
		</div>
		<div id = "button">
			<form action="${pageContext.servletContext.contextPath}/moduleList" method="get">
					<input name="direct" type="submit" value="Module List" />
			</form>
		</div>
		
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
			<div id="header">
				Module Data 
			</div>
		<div id = "location">
			<table>
				<th>
					Location
				</th>
				<tr>
					<td class="label">Latitude</td>
					<td>${location0}</td>
				</tr>
				<tr>
					<td class="label">Longitude</td>
					<td>${location1}</td>
				</tr>
				<tr>
					<td class="label">Altitude</td>
					<td>${location2}</td>
				</tr>
			</table>
		</div>
		
		<div id = "data">
			<table>
				<th>
					Data Reading
				</th>
				<tr>
					<td class="label">Carbon Dioxide</td>
					<td>${reading0}</td>
				</tr>
				<tr>
					<td class="label">Nitrogen</td>
					<td>${reading1}</td>
				</tr>
				<tr>
					<td class="label">Oxygen</td>
					<td>${reading2}</td>
				</tr>
				<tr>
					<td class="label">Argon</td>
					<td>${reading3}</td>
				</tr>
				<tr>
					<td class="label">Methane</td>
					<td>${reading4}</td>
				</tr>
				<tr>
					<td class="label">Neon</td>
					<td>${reading5}</td>
				</tr>
				<tr>
					<td class="label">Helium</td>
					<td>${reading6}</td>
				</tr>
				<tr>
					<td class="label">Krypton</td>
					<td>${reading7}</td>
				</tr>
			</table>
		</div>
	</body>
</html>