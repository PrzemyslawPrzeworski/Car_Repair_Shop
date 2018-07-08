<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Find Employee by ID</h1>
    <form action="#" method="post">

        <input type="text" name="id" placeholder="Employee id"/>
        <input type="submit">

    </form>

    <tr>
        id <th scope="row">${employee.id}</th> <br>
        first_name <td>${employee.first_name}</td> <br>
        second_name <td>${employee.second_name}</td> <br>
        address <td>${employee.address}</td> <br>
        telephone <td>${employee.telephone}</td> <br>
        note <td>${employee.note}</td> <br>
        manhour_cost <td>${employee.manhour_cost}</td> <br>

    </tr>





</body>
</html>
