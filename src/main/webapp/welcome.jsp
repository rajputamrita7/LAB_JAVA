<%@ page language="java" contentType="text/html" %>
<%
    String name = request.getParameter("username");
    String timeStr = request.getParameter("time");

    if (name != null && timeStr != null) {
        int time = Integer.parseInt(timeStr);

        // Set session expiry (convert minutes → seconds)
        session.setMaxInactiveInterval(time * 60);

        session.setAttribute("user", name);
        session.setAttribute("expiry", time);
    }

    String user = (String) session.getAttribute("user");
    Integer expiry = (Integer) session.getAttribute("expiry");
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
        <p>Session will expire in <%= expiry %> minute(s).</p>

        <a href="check.jsp">Click here to check session</a>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>