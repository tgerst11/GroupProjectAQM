<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Module Data, ${moduleName}</title>		
	<style type="text/css">
		<%@include file="/moduleData.css"%>
	</style>
	</head>

	<body>
	
	<div class = "header">
        <ul>
        <li> <a href = "${pageContext.servletContext.contextPath}/homePage"> Home </a></li>
       </ul>	
	</div>
		
		<div class= "contentRight">
		<div class = "bold">AQI Report: </div>
		<br>
		${aqiMessage}
		<br><br>
		<div class = "bold">Pollution Report: </div>
		<br>
		${mainPolMessage}
		</div>
		<script>
			window.onload = function () {

			var chart = new CanvasJS.Chart("chartContainer", {
			theme:"light2",
			animationEnabled: true,
			title:{
				text: "Data History of ${moduleName} Module"
			},
			axisY :{
				includeZero: false,

			},
			toolTip: {
				shared: "true"
			},
			legend:{
				cursor:"pointer",
				itemclick : toggleDataSeries
			},
			data: [{
				type: "spline",
				visible: false,
				showInLegend: true,
				yValueFormatString: "##.00",
				name: "AQI",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: "${point.date}", y: ${point.AQI} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				visible: false,
				yValueFormatString: "##.00%",
				name: "Humidity",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: "${point.date}", y: ${point.humidity}/100 },
					</c:forEach>
				]
			},
			{
				type: "spline",
				visible: false,
				showInLegend: true,
				yValueFormatString: "##.00 m/s",
				name: "Wind Speed",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: "${point.date}", y: ${point.windSpeed} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				yValueFormatString: "##.00°",
				name: "Wind Direction",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: "${point.date}", y: ${point.windDir} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				yValueFormatString: "##.00 hPa",
				name: "Pressure",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: "${point.date}", y: ${point.pressure} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				yValueFormatString: "##.00°C",
				name: "Temperature",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: "${point.date}", y: ${point.temp} },
					</c:forEach>
				]
			}]
	});
	chart.render();

	function toggleDataSeries(e) {
		if (typeof(e.dataSeries.visible) === "undefined" || e.dataSeries.visible ){
			e.dataSeries.visible = false;
		} else {
			e.dataSeries.visible = true;
		}
	chart.render();
	}

	}
	</script>
	<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
	<div id="chartContainer" style="height: 500px; width: 75%; align: center; padding-top:50px; "></div>
	
	<table class="container">
			<thead>
				<tr>
					<th><h1>Date</h1></th>
					<th><h1>Time</h1></th>
					<th><h1>AQI</h1></th>
					<th><h1>Main Pollutant</h1></th>
					<th><h1>Humidity (%)</h1></th>
					<th><h1>Wind Speed (m/s)</h1></th>
					<th><h1>Wind Direction (Heading)</h1></th>
					<th><h1>Coordinates</h1></th>
					<th><h1>Pressure (hPa)</h1></th>
					<th><h1>Temperature (°C)</h1></th>
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
	
	</body>
</html>