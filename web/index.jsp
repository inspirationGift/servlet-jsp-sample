<%@ page import="main.Test" %><%--
  Created by IntelliJ IDEA.
  User: mark
  Date: 18.07.2020
  Time: 00:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--to iterate--%>
<%--to have access to any class--%>
<%
    for (int i = 0; i < 10; i++) {
        out.println("<p>Hello " + i + "</p>");
    }
    out.println(Test.str());
%>
<%--&lt;%&ndash;http://localhost:8080/index.jsp?n=Mark&ndash;%&gt; to have access doGet of Servlet--%>
<%
    String n = request.getParameter("n");
%>
<%=
"<p>Hello " + n + "</p>"
%>

</body>
</html>
