<%@ page language="java" contentType="text/html" %>
<%
    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Check Session</title>
</head>
<body>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>! Session is still active ✅</h2>
        <a href="check.jsp">Check Again</a>
<%
    } else {
%>
        <h2>Session Expired ❌</h2>
        <p>Please enter details again.</p>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>