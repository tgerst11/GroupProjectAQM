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
		</style>
	</head>

	<body>
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
					<td>35.6762° N</td>
				</tr>
				<tr>
					<td class="label">Longitude</td>
					<td>139.6503° E</td>
				</tr>
				<tr>
					<td class="label">Altitude</td>
					<td>29,029 feet</td>
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
					<td>0.04%</td>
				</tr>
				<tr>
					<td class="label">Nitrogen</td>
					<td>78%</td>
				</tr>
				<tr>
					<td class="label">Oxygen</td>
					<td>21%</td>
				</tr>
				<tr>
					<td class="label">Argon</td>
					<td>0.9%</td>
				</tr>
				<tr>
					<td class="label">Methane</td>
					<td>0.000187%</td>
				</tr>
				<tr>
					<td class="label">Neon</td>
					<td>0.0018%</td>
				</tr>
				<tr>
					<td class="label">Helium</td>
					<td>0.0005%</td>
				</tr>
				<tr>
					<td class="label">Krypton</td>
					<td>0.0001%</td>
				</tr>
			</table>
		</div>
	</body>
</html>