<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Home Page of the York College AQM</title>
		
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
                
                .form-area input[type=submit]:hover{
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
        			height: 768px;
        			background-size:cover;
        			/*background-color:#00000;*/
        			background-image: url(././images/background.jpg);
        			background-repeat:no-repeat;  
        			
        			/*
        			background-size:cover;
        			change depending on place?
        			background-repeat:no-repeat;  
        			*/
      		
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
        		
        		.logo{
        			width:5px;
    				padding-top: 5px;
    				padding-left: 0px;
    				padding-bottom: 0px;
        		}
        		
      
        		
        		.welcome{
        			position: absolute;
        			right: 100px;
        			left: 700px;
        			top: 250px;
        			text-align: center;
        			font-weight: bold;
        			font-family: arial;
        			font-size: 70px;
        		}
      
        		#login {
        			float: left;
        			font-weight: bold;
        		}
        		.select{
        		position:absolute;
     			top:40%;
                left:60%;
        		
        		
        		}
        		
        </style>

		
	</head>

	<body>
	
	<div class = "header">
		
		
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
		<div class = "form-area">
	
		<form action="">
		<p>Username:</p>
		<input type="text" name="first" placeholder="Enter username" size="12" value="${login.username}"/>
		<p>Password:</p>
		<input type="text" name="second" placeholder="Enter password" size="12" value="${login.password}" />
		<input type="submit" value= "Sign In">
		</form>
		<!-- 
				<table>
					<tr>
						<td class="label">Username:</td>
						<td><input type="text" name="first" size="12" value="${login.username}" /></td>
						<td class="label">Password:</td>
						<td><input type="text" name="second" size="12" value="${login.password}" /></td>
					</tr>
				</table>
				
				
				
				<div id = "button">
					<input type="Submit" name="submit" value="Login">
					
					
				</div>
				-->
				
				
				
				
		</div>
		<form action="${pageContext.servletContext.contextPath}/homePage" method="get">
			</form>
		
			

	</body>
</html>