<%-- 
    Document   : agecalculator
    Created on : 29-Jan-2023, 2:07:45 AM
    Author     : amand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age" value="${age}">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age Next Birthday">
        </form>
        
        <p> ${message}</p>
        <a href ="arithmetic"> Arithmetical Calculator</a> 
        
    </body>
</html>
