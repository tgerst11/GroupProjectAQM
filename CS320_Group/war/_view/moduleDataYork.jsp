<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Module Data York, PA</title>
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
        	
        			background-image: url(././images/york.jpg);
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
		#dataA{
			margin-left: 200px;
			margin-top: 0px;
			float: left;
		}
		#dataB{
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
		
		.tg  {
					border-collapse:collapse;
					border-spacing:0;
		}
		
		.tg td{
					font-family:Arial, sans-serif;
					font-size:14px;padding:10px 5px;
					border-style:solid;border-width:1px;
					overflow:hidden;
					word-break:normal;
					border-color:black;
		}
		
		.tg th{
					font-family:Arial, sans-serif;
					font-size:14px;
					font-weight:normal;
					padding:10px 5px;
					border-style:solid;
					border-width:1px;
					overflow:hidden;
					word-break:normal;
					border-color:black;
		}
		
		.tg .tg-z4dy{
					background-color:#cbcefb;
					color:#cbcefb;
					text-align:left;
					vertical-align:top
		}
		
		.tg .tg-kftd{
					background-color:#efefef;
					text-align:left;
					vertical-align:top
		}
		
		.tg .tg-5p9v{
					background-color:#cbcefb;
					color:#333333;
					text-align:left;
					vertical-align:top
		}
		
		.tg .tg-7euo{
					background-color:#ffffff;
					color:#333333;
					text-align:left;
					vertical-align:top
		}

		
		
		</style>
	</head>

	<body>
	<div id="header">
				Module Data York, PA
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
			<form action="${pageContext.servletContext.contextPath}/addModule" method="get">
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
			
		
		<div id = "dataA">
			<table class="tg">
			  <tr>
			    <th class="tg-5p9v">Location</th>
			    <th class="tg-z4dy"></th>
			  </tr>
			  <tr>
			    <td class="tg-7euo">City</td>
			    <td class="tg-7euo">York</td>
			  </tr>
			  <tr>
			    <td class="tg-kftd">State</td>
			    <td class="tg-kftd">Pennsylvania</td>
			  </tr>
			  <tr>
			    <td class="tg-7euo">Country</td>
			    <td class="tg-7euo">United States</td>
			  </tr>
			</table>
		</div>
		 
		<div id = "dataB">
			<table class="tg">
			  <tr>
			    <th class="tg-5p9v">Data</th>
			    <th class="tg-z4dy"></th>
			  </tr>
			  <tr>
			    <td class="tg-7euo">AQI</td>
			    <td class="tg-7euo">~~~~~~~~~~</td>
			  </tr>
			  <tr>
			    <td class="tg-kftd">Main Pollutant</td>
			    <td class="tg-kftd">~~~~~~~~~</td>
			  </tr>
			  <tr>
			    <td class="tg-7euo">Humidity</td>
			    <td class="tg-7euo">~~~~~~~~~~</td>
			  </tr>
			  <tr>
			    <td class="tg-kftd">Wind Speed</td>
			    <td class="tg-kftd">~~~~~~~~~~</td>
			  </tr>
			  <tr>
			    <td class="tg-7euo">Wind Direction</td>
			    <td class="tg-7euo">~~~~~~~~~~</td>
			  </tr>
			  <tr>
			    <td class="tg-kftd">Coordinates</td>
			    <td class="tg-kftd">~~~~~~~~~~</td>
			  </tr>
			  <tr>
			    <td class="tg-7euo">Pressure</td>
			    <td class="tg-7euo">~~~~~~~~~~</td>
			  </tr>
			  <tr>
			    <td class="tg-kftd">Temperature</td>
			    <td class="tg-kftd">~~~~~~~~~~</td>
			  </tr>
			</table>
		</div>
		
	</body>
</html>