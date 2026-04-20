<%@ page language="java" contentType="text/html" %>
<html>
<head>
    <title>Student Result Form</title>

    <script>
        function validateForm() {
            let f = document.forms["myForm"];

            let roll = f["rollno"].value;
            let name = f["name"].value;

            let marks = [
                f["sub1"].value,
                f["sub2"].value,
                f["sub3"].value,
                f["sub4"].value,
                f["sub5"].value
            ];

            if (roll == "" || name == "") {
                alert("Roll No and Name are required!");
                return false;
            }

            for (let i = 0; i < marks.length; i++) {
                if (marks[i] == "" || isNaN(marks[i]) || marks[i] < 0 || marks[i] > 100) {
                    alert("Enter valid marks (0-100) for all subjects!");
                    return false;
                }
            }

            return true;
        }
    </script>
</head>

<body>

<h2>Enter Student Details</h2>

<form name="myForm" action="ResultServlet" method="post" onsubmit="return validateForm()">

    Roll No: <input type="text" name="rollno"><br><br>
    Name: <input type="text" name="name"><br><br>

    Subject 1: <input type="text" name="sub1"><br><br>
    Subject 2: <input type="text" name="sub2"><br><br>
    Subject 3: <input type="text" name="sub3"><br><br>
    Subject 4: <input type="text" name="sub4"><br><br>
    Subject 5: <input type="text" name="sub5"><br><br>

    <input type="submit" value="Calculate Result">

</form>

</body>
</html>