<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="/css/loginstyle.css" rel="stylesheet" type="text/css">
<link rel="icon" type="image/png" href="https://img.icons8.com/doodle/480/000000/girl.png">
<style>


body,html {
  
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("https://images.wallpaperscraft.com/image/city_blur_glare_115698_1920x1080.jpg");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}


fieldset
{

border: 1px solid #781351;
width: 20em;
}

legend
{
color: #fff;
background: #ffa20c;
border: px solid #781351;
padding: 2px 6px
}

label
{
width: 4em;
float: left;
text-align: right;
margin-right: 0.5em;
display: block
}

.submit input
{
font-size:20px;
margin-left: 0 em;
}


input
{
color: #781351;
background: #ffff;
border: 2px solid black;
}

.button {
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 24px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}



</style>

</head>
<body>

<div class="bg"> 

<form action="LoginController" method="post">
<fieldset>
        <legend>Login Page</legend>

<p>
		<lable>Enter Username : </lable> 
		<input type="text" name="username"> <BR>
</p>

<p>	
		<lable>Enter Password : </lable>
		<input type="password" name="password"> <BR>
	</p>
	
<button class="button"><span>Login </span></button>
</fieldset>
	
</form>

</div>
</body>
</html>