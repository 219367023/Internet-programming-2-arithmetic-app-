<%-- 
    Document   : add_outcome
    Created on : 03 Mar 2025, 5:21:42 PM
    Author     : Jacob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Outcome Page</title>
    </head>
    <body>
        <h1>Add Outcome</h1>
        <%
            Integer num1 = (Integer)request.getAttribute("n1");
            Integer num2 = (Integer)request.getAttribute("n2");
            Integer sum = (Integer)request.getAttribute("s");
            
        
        %>
        
        <p>
            The sum of <b><%=num1%></b> and <b><%=num2%></b> is<b> <%=sum%></b>
        </p>
        
        
    </body>
</html>
