<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>


		<head>
		<style type="text/css">
		
                
                #button {
                    margin-bottom: 10px;
                	float: right;
                }
                
                .form-area{
                font-family: Tahoma;
                position: absolute;
                top:50%;
                left:30%;
                transform: translate(-50%, -50%);
                width: 400px;
                height:400px;
                box-sizing: border-box;
                background: rgba(0,0,0,0.5);
                padding: 100px;
                float: left;
                }
                
                h3{
                margin:0;
                padding:0 0 20px;
                font-weight: bold;
                color: #ffffff;
                
                }
                
                .form-area p{
                margin: 0;
                padding: 0;
                font-weight:bold;
                color:#ffffff;
                }
                
                .form-area input, select{
                margin-bottom: 20px;
                width:100%;
                
                }
                
                .form-area input[type=text],
                .form-area input[type=password]{
                border: none;
                border-bottom: 1px solid #ffffff;
                background-color:transparent;
                outline: none;
                height: 40px;
                color: #ffffff;
                display: 16px;
                
                }
                
                ::placeholder{
                color: #ffffff;
                
                }
                .form-area select{
                margin-top: 20px;
                padding: 10 px 0;
                
                }
                .form-area input[type = submit]{
                border:none;
                height: 40px;
                outline:none;
                color: #000000;
                font-size: 15px;
                background-color: lightblue;
               
                cursor: pointer;
                border-radius:20px;
                }
                .check input[type = submit]{
                border:none;
                height: 40px;
                outline:none;
                color: #000000;
                font-size: 15px;
                background-color: lightblue;
               
                cursor: pointer;
                border-radius:20px;
                }
                
                .form-area input[type=submit]:hover{
                background-color: gray;
                color:#ffffff;
           
                
                }
                .check input[type=submit]:hover{
                background-color: gray;
                color:#ffffff;
        
                }
                .form-area a{
                color:#fffffff;
                text-decoration: none;
                font-size:14px;
                font-weight:bold;
                }
                
        		body{
        			width:100%;
        			height:100%;
        			height:700px;
        			width: 1024px;
        			background-size:cover;
        			/*background-color:#00000;*/
        			background-image: url(././images/homebak.jpg);
        			background-repeat:no-repeat;  
        			
        			/*
        			background-size:cover;
        			change depending on place?
        			background-repeat:no-repeat;  
        			*/
      		
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
        		
        		ul li2 a{
        			text-decoration:none;
        			color: white;
        			display: block;
        		}
        		
        		ul li a:hover{
        			background:gray;
        		}
        		
        		ul li2 a:hover{
        			background:gray;
        		}
        		
        		ul li{

        			float:right;
        			width: 200px;
        			height:40px;
        			background-color: black;
        			opacity: .8;
        			line-height:40px;
        			text-align: center;
       				font-size: 20px;
        			margin-right: 2px;
        		}
        		ul li2{
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
        		
      
        		#login {
        			float: left;
        			font-weight: bold;
        		}

        		.footer{
        		background-opacity: 50%;
        		position: fixed;
        		left:0;
        		bottom:0;
        		width: 100%;
        		font-family: sans-serif;
        		font-size: 10px;
        		text-align: center;
        		color: white;
        		background: rgba(255,255,255,0.3);
        		
        		}
        		
        		.header{
        		background: rgba(0,0,0,0.5);
        		position: fixed;
        		left:0;
        		top:20px;
        		width: 100%;
        		font-family: Tahoma;
        		color: white;
        		text-align: center;
        		font-size: 50px;
        		padding: 10px;
        	
        		}
        		
        		.check{
        		font-family: Tahoma;
                position: absolute;
                top:50%;
               	left: 70%;
                transform: translate(-50%,-50%);
                box-sizing: border-box;
                background: rgba(0,0,0,0.5);
                padding:40px;
                float: left;
           
        		}
        		.module{
        		margin:0;
                text-align: center;
                font-weight: bold;
                color: #ffffff;
                margin-bottom: 30px;
        		}
     			
     			.radio{
     			color: white;
     			margin-right: 0;
     			padding-left: 10px;
     			}
     		
     			
        		
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
	
		<form action="${pageContext.servletContext.contextPath}/moduleData" method="post">
		<p>Username:</p>
		<input type="text" name="username" placeholder="Enter username" size="12" value="${username}"/>
		<p>Password:</p>
		<input type="text" name="password" placeholder="Enter password" size="12" value="${password}" />
		<input type="submit" name = "submit" value= "Sign In">
		</form>
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
	<p>Made with &lt;3 by a team of 4 York College of Pennsylvania CS320 Spring 2020 Students: David, Dylan, Mikayla, and Trevor</p>
	</div>
	
</html>