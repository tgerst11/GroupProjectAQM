<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Module Data Hershey, PA</title>
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
        	
        			background-image: url(././images/hersheyPic5.jpg);
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
  			border: 1px solid white;
		}
		#header{
			
			font-size: 150%;
            font-weight: bold;
			margin-bottom: 20px;
            border-bottom: 2px solid black;
            color: #FFFFFF;
		}
		#data{
			margin-left: 200px;
			margin-top: 0px;
			float: middle;
			color: #FFFFFF;
		}
		#location{
			margin-left: 0px;
			float: left;
			color: #FFFFFF;
		}
		#button {
            margin-bottom: 10px;
        }
        #login {
					float: left;
					background-color:#efefef;
					border: 1px solid #efefef;
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

		@charset "UTF-8";
@import url(https://fonts.googleapis.com/css?family=Open+Sans:300,400,700);

body {
 
  font-weight: 300;
  line-height: 1.42em;
  color:#A7A1AE;
  text-align: center;

}

h1 {
  font-size:3em; 
  font-weight: 300;
  line-height:1em;
  text-align: center;
  color: #FFFF00;
}

h2 {
  font-size:1em; 
  font-weight: 300;
  text-align: center;
  display: block;
  line-height:1em;
  padding-bottom: 2em;
  color: #FB667A;
}

h2 a {
  font-weight: 700;
  text-transform: uppercase;
  color: #FB667A;
  text-decoration: none;
  text-align: center;
}

.container th h1 {
  font-weight: bold;
  font-size: 1em;
  text-align: left;
  color: #FCE166;
}

.container td {
	  font-weight: normal;
	  font-size: 1em;
  -webkit-box-shadow: 0 2px 2px -2px #0E1119;
	   -moz-box-shadow: 0 2px 2px -2px #0E1119;
	        box-shadow: 0 2px 2px -2px #0E1119;
}

.container {
	float: bottom;
	text-align: left;
	overflow: hidden;
	width: 80%;
	margin-top: 150px;
    display: table;
    background-color:black;
    opacity: 0.9;
}

.container td, .container th {
	padding-bottom: 2%;
	padding-top: 2%;
  	padding-left:2%;  
}

/* Background-color of the odd rows */
.container tr:nth-child(odd) {
	background-color: #383434;
	opacity: 0.9;
}

/* Background-color of the even rows */
.container tr:nth-child(even) {
	background-color: #1f1f1f;
	opacity: 0.9;
}

.container th {
	background-color:black;
	opacity: 0.9;
}

.container td:first-child { color: #ffc642;
 }

.container tr:hover {
    background-color: #0b487d;
-webkit-box-shadow: 0 6px 6px -6px #00ff00;
	-moz-box-shadow: 0 6px 6px -6px #ff0000;
	box-shadow: 0 6px 6px -6px #0E1119;
	opacity: 0.9;
}

.container td:hover {
  background-color: #FCE166;
  color: black;
  font-weight: bold;
  
  box-shadow: #FEDF08 -1px 1px, #FEDF08 -2px 2px, #FEDF08 -3px 3px, #FEDF08 -4px 4px, #FEDF08 -5px 5px, #FEDF08 -6px 6px;
  transform: translate3d(6px, -6px, 0);
  
  transition-delay: 0s;
	  transition-duration: 0.4s;
	  transition-property: all;
  transition-timing-function: line;
}

@media (max-width: 800px) {
.container td:nth-child(4),
.container th:nth-child(4) { display: none; }
}
		</style>
	</head>

	<body>
	<div id="header">
				Module Data Hershey, PA
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
			
		<table class="container">
			<thead>
				<tr>
					<th><h1>Date</h1></th>
					<th><h1>Time</h1></th>
					<th><h1>AQI</h1></th>
					<th><h1>Main Pollutant</h1></th>
					<th><h1>Humidity</h1></th>
					<th><h1>Wind Speed</h1></th>
					<th><h1>Wind Direction</h1></th>
					<th><h1>Coordinates</h1></th>
					<th><h1>Pressure</h1></th>
					<th><h1>Temperature</h1></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${data}" var="point">
					<tr>
						<td>${point.date}</td>
						<td>${point.time}</td>
						<td>${point.AQI}</td>
						<td>${point.mainPol}</td>
						<td>${point.humidity}</td>
						<td>${point.windSpeed}</td>
						<td>${point.windDir}</td>	
						<td>${point.coordinates}</td>
						<td>${point.pressure}</td>
						<td>${point.temp}</td>		            
					</tr>
				</c:forEach>
			</tbody>
		</table>
		  <script type="text/javascript">
  window.onload = function () {
    var chart = new CanvasJS.Chart("chartContainer",
    {

      title:{
      text: "Earthquakes - per month"
      },
       data: [
      {
        type: "line",

        dataPoints: [
        { x: new Date(2012, 00, 1), y: 450 },
        { x: new Date(2012, 01, 1), y: 414 },
        { x: new Date(2012, 02, 1), y: 520 },
        { x: new Date(2012, 03, 1), y: 460 },
        { x: new Date(2012, 04, 1), y: 450 },
        { x: new Date(2012, 05, 1), y: 500 },
        { x: new Date(2012, 06, 1), y: 480 },
        { x: new Date(2012, 07, 1), y: 480 },
        { x: new Date(2012, 08, 1), y: 410 },
        { x: new Date(2012, 09, 1), y: 500 },
        { x: new Date(2012, 10, 1), y: 480 },
        { x: new Date(2012, 11, 1), y: 510 }
        ]
      }
      ]
    });

    chart.render();
  }
  </script>
 <script type="text/javascript" src="https://canvasjs.com/assets/script/canvasjs.min.js"></script></head>
<body>
  <div id="chartContainer" style="height: 300px; width: 100%; margin-top: 100px;">
  </div>
</body>
	</body>
</html>