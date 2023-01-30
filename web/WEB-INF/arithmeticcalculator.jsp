<%-- 
    Document   : arithmeticcalculator
    Created on : 29-Jan-2023, 3:20:28 PM
    Author     : amand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="first"><br>
            Second: <input type="number" name="second"><br>
            <input type="submit" value="+" name="value">
            <input type="submit" value="-" name="value">
            <input type="submit" value="*" name="value">
            <input type="submit" value="%" name="value"><br>
            Result: ${result}
        </form>
        
        <p> ${message}</p>
        <p> ${value} </p>
        
        <a href ="age"> Age Calculator</a> 
        
    </body>
</html>
