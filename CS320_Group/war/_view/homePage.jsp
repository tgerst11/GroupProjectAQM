<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Home Page of the York College AQM</title>
		
		<style type="text/css">
		
                /*
                #button {
                        margin-bottom: 10px;
                   
                */
         
        		body{
        		/*
        		Play around with resizing
        		*/
        		background-color:#00000;
        	
        		background-image: url(././images/background.jpg);
        		/*
        		change depending on place?
        		*/
        		
        		background-size:cover;
        		background-repeat:no-repeat;
        		
        	
        		
        		
        		}
        		
        		.header{
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
        		
        		.logo{
        			width:5px;
    				padding-top: 5px;
    				padding-left: 0px;
    				padding-bottom: 0px;
        		}
        		
      
        		
        		.welcome{
        			padding-left: 0px;
        			padding-right:300px;
        			padding-top:100px;
        		
        			text-align: center;
        			font-weight: bold;
        			font-family: arial;
        			font-size: 70px;
        		}
      
        		#login {
        			float: left;
        			font-weight: bold;
        		}
        		
        		
        	
        </style>

		
	</head>

	<body>
	
	<div class = "header">
		
		
        <ul>
        <li> <a href = "${pageContext.servletContext.contextPath}/moduleList"> Module List </a>
        	<ul>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleData"> Harrisburg, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleData"> York, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleData"> Hershey, PA </a></li>
	        	<li> <a href = "${pageContext.servletContext.contextPath}/moduleData"> Lancaster, PA </a></li>
        	</ul>
        <li> <a href = "${pageContext.servletContext.contextPath}/homePage"> Home </a></li>
       </ul>
      
       
      <!--  
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
		</div>
		<div id = "login">
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
				<div id = "button">
					<input type="Submit" name="submit" value="Login">
				</div>
		</div>
		<form action="${pageContext.servletContext.contextPath}/homePage" method="get">
			</form>
			<div class = "welcome">
			Viewing Air Quality Data for Susquehanna Valley, PA 
			
			</div>
			

	</body>
</html>