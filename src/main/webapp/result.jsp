<%@ page language="java" contentType="text/html" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>User Details Submitted Successfully ✅</h2>

<p><b>Username:</b> <%= request.getAttribute("username") %></p>
<p><b>Email:</b> <%= request.getAttribute("email") %></p>
<p><b>Designation:</b> <%= request.getAttribute("designation") %></p>

<br>
<a href="index.jsp">Go Back to Form</a>

</body>
</html>