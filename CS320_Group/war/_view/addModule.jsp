<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Add Module</title>
		<style type="text/css">
			.error {
				color: red;
				font-weight: bold;
			}
			
			.success {
				color: blue;
				font-weight: bold;
			}
			
			.success_title {
				color: darkblue;
				font-style: italic;
				font-weight: bold;			
			}
			
			tr.label {
				text-align: right;
			}
		</style>
	</head>

	<body>
			
		<form action="${pageContext.servletContext.contextPath}/insertBook" method="post">
			<table>
				<tr>
					<td class="label">Module Name:</td>
					<td><input type="text" name="module_name" size="20" value="${module_name}" /></td>
				</tr>
				<tr>
					<td class="label">Latitude:</td>
					<td><input type="text" name="module_latitude" size="20" value="${module_latitude}" /></td>
				</tr>
				<tr>
					<td class="label">Horizontal Direction:</td>
					<td><input type="text" name="horizontal_direction" size="20" value="${horizontal_direction}" /></td>
				</tr>
				<tr>
					<td class="label">Longitude:</td>
					<td><input type="text" name="module_longitude" size="20" value="${module_longitude}" /></td>
				</tr>	
				<tr>
					<td class="label">Vertical Direction:</td>
					<td><input type="text" name="vertical_direction" size="20" value="${vertical_direction}" /></td>
				</tr>
				<tr>
					<label for="horizontal_direction">Horizontal Direction:  </label>
						<select id="horizontal_direction">
					  		<option value="E">E</option>
					  		<option value="W">W</option>
					</select>
				</tr>
				<tr>
					<label for="vertical_direction">Vertical Direction:  </label>
						<select id="vertial_direction">
					  		<option value="N">N</option>
					  		<option value="S">S</option>
					</select>
				</tr>
				<tr>
					<label for="status">Status:  </label>
						<select id="status">
					  		<option value="on">on</option>
					  		<option value="off">off</option>
					</select>
				</tr>					
			</table>
			
			<input type="Submit" name="submitaddmodule" value="Add Module to Database">
		</form>
		<br>
		<form action="${pageContext.servletContext.contextPath}/homePage" method="post">
			<input type="Submit" name="submithome" value="Home">
		</form>		
	</body>
</html>