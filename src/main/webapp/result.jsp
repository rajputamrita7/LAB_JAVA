<%@ page language="java" contentType="text/html" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Student Result</h2>

<p><b>Roll No:</b> <%= request.getAttribute("roll") %></p>
<p><b>Name:</b> <%= request.getAttribute("name") %></p>

<p><b>Subject 1:</b> <%= request.getAttribute("sub1") %></p>
<p><b>Subject 2:</b> <%= request.getAttribute("sub2") %></p>
<p><b>Subject 3:</b> <%= request.getAttribute("sub3") %></p>
<p><b>Subject 4:</b> <%= request.getAttribute("sub4") %></p>
<p><b>Subject 5:</b> <%= request.getAttribute("sub5") %></p>

<p><b>Average:</b> <%= request.getAttribute("avg") %></p>
<p><b>Result:</b> <%= request.getAttribute("result") %></p>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>