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
	<div id="header">
				Module Data: ${moduleName}
			</div>
	<div class = "header">
        <ul>
        <li> <a href = "${pageContext.servletContext.contextPath}/homePage"> Home </a></li>
       </ul>
	
	</div>				
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
		<script>
			window.onload = function () {

			var chart = new CanvasJS.Chart("chartContainer", {
			theme:"light2",
			animationEnabled: true,
			title:{
				text: "Data History"
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
				yValueFormatString: "##.00mn",
				name: "AQI",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: ${point.date}, y: ${point.AQI} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				visible: false,
				yValueFormatString: "##.00mn",
				name: "Humidity",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: ${point.date}, y: ${point.humidity} },
					</c:forEach>
				]
			},
			{
				type: "spline",
				visible: false,
				showInLegend: true,
				yValueFormatString: "##.00mn",
				name: "Wind Speed",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: ${point.date}, y: ${point.windSpeed} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				yValueFormatString: "##.00mn",
				name: "Wind Direction",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: ${point.date}, y: ${point.windDir} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				yValueFormatString: "##.00mn",
				name: "Pressure",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: ${point.date}, y: ${point.pressure} },
					</c:forEach>
				]
			},
			{
				type: "spline", 
				showInLegend: true,
				yValueFormatString: "##.00mn",
				name: "Temperature",
				dataPoints: [
					<c:forEach items="${data}" var="point">
	            		{ label: ${point.date}, y: ${point.temp} },
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
	</body>
</html>