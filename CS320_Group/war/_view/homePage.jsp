<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>


		<head>
	<style type="text/css">
		<%@include file="/homePage.css"%>
	</style>
	
	<title>Home Page of the York College AQM</title>
	
		
	</head>

	<body>
	
	<div class= "header">
		Real-time &amp; Historical Air Quality Reports
		</div>
		
		 <!--
        <ul>
        <div class = "select">
        <li> <a href = "${pageContext.servletContext.contextPath}/moduleList"> Module List </a>
        	<ul>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataHarrisburg"> Harrisburg, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataYork"> York, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataHershey"> Hershey, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleDataLancaster"> Lancaster, PA </a></li>
        	</ul>
        	</div>
        <li2> <a href = "${pageContext.servletContext.contextPath}/homePage"> Home </a></li2>
       </ul>
      
       
     
      <div class = "logo">
		<img src = "<c:url value = '././images/logo.JPG'/>" alt = "AQM Logo" width= "100"/>
		</div>
       
        </div>
        -->
        
    
		<!--
		<div id = "button">
		<form action="${pageContext.servletContext.contextPath}/moduleList" method="get">
				<input name="direct" type="submit" value="Module List" />
		</form>
		-->
	
		<div class = "form-area">
	
		<form action="${pageContext.servletContext.contextPath}/homePage" method="post">
		<p>Username:</p>
		<input type="text" name="username" placeholder="Enter username" size="12" value="${username}"/>
		<p>Password:</p>
		<input type="text" name="password" placeholder="Enter password" size="12" value="${password}" />
		<input type="submit" name = "login" value= "Sign In">
		</form>
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
		</div>
	
		<div class = "check">
		<div class = "module">
		 Select a Module
		 </div>
		<form action="${pageContext.servletContext.contextPath}/moduleData" method= "get">
		<c:forEach items="${modules}" var="module">
		 <div class = "radio">
		  <input type="radio" id="${module.name}" name="module" value="${module.name}"> <!-- change value to be the city -->
		  <label for="${module.name}">${module.name}</label><br>
		  <br>
		  </div>
		  </c:forEach>
		  
		  <input type="submit" name = "submit" value= "Choose Selected Modules" >
		</form>
		<!-- 
		<form action="${pageContext.servletContext.contextPath}/homePage" method="post">
				<table>
					<tr>
						<td class="label">Username:</td>
						<td><input type="text" name="username" size="12" value="${username}" /></td>
						<td class="label">Password:</td>
						<td><input type="text" name="password" size="12" value="${password}" /></td>
					</tr>
				</table>
				
				
				
				<div id = "button">
					<input type="Submit" name="submit" value="Login">
					
					
				</div>
				-->
		</form>
				
				
				
				
		</div>
		<form action="${pageContext.servletContext.contextPath}/homePage" method="post">
			</form>
	
			

	</body>
	
	<div class = "footer">
	<p>Made with &lt;3 by a team of 4 <a href="https://youtube.com/watch?v=dQw4w9WgXcQ" >York College of Pennsylvania</a> CS320 Spring 2020 Students: David, Dylan, Mikayla, and Trevor</p>
	</div>
	
	
	
	
	
</html>