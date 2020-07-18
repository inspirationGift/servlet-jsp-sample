<%@ page import="main.Cart" %><%--
  Created by IntelliJ IDEA.
  User: mark
  Date: 18.07.2020
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Your cart</title>
</head>
<body>
<%
    Cart cart = (Cart) session.getAttribute("cart");
%>


<%
    out.println("<p>Name: " + cart.getName() + "</p>");
%>

<%
    out.println("<p>Quantity: " + cart.getQuantity() + "</p>");
%>

</body>
</html>
