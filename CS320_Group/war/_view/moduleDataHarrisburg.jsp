<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Module Data Harrisburg, PA</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		header{
        			padding: 0px;

        		}
        		
        		ul{
        			margin: 0px;
        			padding: 0px;
        		
        			list-style-type:none;
        			font-family: sans-serif;
        		}
        		
        		ul li a{
        			text-decoration:none;
        			color: white;
        			display: block;
        		}
        		
        		ul li a:hover{
        			background:gray;
        		}
        		
        		ul li{
        			float:right;
        			width: 200px;
        			height:40px;
        			background-color:black;
        			opacity: .8;
        			line-height:40px;
        			text-align: center;
       				font-size: 20px;
        			margin-right: 2px;
        		}
        		
        		ul li ul li{
        			display: none;
        		}
        		
        		ul li:hover ul li{
        			display: block;
        		}
        		
		
		/*
                #button {
                    margin-bottom: 10px;
                   
                	*/
        		body{
        			/*
        			Play around with resizing
        			*/
        			background-color:#00000;
        	
        			background-image: url(././images/harrisburgpic.jpg);
        			/*
        			change depending on place?
        			*/
        		
        			background-size:cover;
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
			margin-bottom: 20px;
            border-bottom: 2px solid black;
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
					float: left;
		}
		</style>
	</head>

	<body>
	<div id="header">
				Module Data Harrisburg, PA
			</div>
	<div class = "header">
        <ul>
        <li> <a href = "${pageContext.servletContext.contextPath}/moduleList"> Module List </a>
        	<ul>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataHarrisburg"> Harrisburg, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataYork"> York, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataHershey"> Hershey, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataLancaster"> Lancaster, PA </a></li>
        	</ul>
        <li> <a href = "${pageContext.servletContext.contextPath}/homePage"> Home </a></li>
       </ul>
	
	</div>
	
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
		
		<!--
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
		-->
		
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
			
		<div id = "location">
			<table>
				<th>
					Location
				</th>
				<tr>
					<td class="label">City</td>
					<td>${module.city}</td>
				</tr>
				<tr>
					<td class="label">State</td>
					<td>${module.state}</td>
				</tr>
				<tr>
					<td class="label">Country</td>
					<td>${module.country}</td>
				</tr>
			</table>
		</div>
		
		<div id = "data">
			<table>
				<th>
					Data Reading
				</th>
				<tr>
					<td class="label">AQI</td>
					<td>${module.AQI}</td>
				</tr>
				<tr>
					<td class="label">Main Pollutant</td>
					<td>${module.mainPol}</td>
				</tr>
				<tr>
					<td class="label">Humidity</td>
					<td>${module.humidity}</td>
				</tr>
				<tr>
					<td class="label">Wind Speed</td>
					<td>${module.windSpeed}</td>
				</tr>
				<tr>
					<td class="label">Wind Direction</td>
					<td>${module.windDir}</td>
				</tr>
				<tr>
					<td class="label">Coordinates</td>
					<td>${module.coordinates}</td>
				</tr>
				<tr>
					<td class="label">Pressure</td>
					<td>${module.pressure}</td>
				</tr>
				<tr>
					<td class="label">Temperature</td>
					<td>${module.temp}</td>
				</tr>
			</table>
		</div>
	</body>
</html>