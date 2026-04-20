<%@ page language="java" contentType="text/html" %>
<%
    // Set session timeout to 1 minute
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);
    }

    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire in 1 minute.</p>
        <a href="welcome.jsp">Refresh Page</a>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Please enter your name again.</p>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>