<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <h1>Find Client by ID</h1>
    <form action="#" method="post">

        <input type="text" name="id" placeholder="Employee id"/>
        <input type="submit">

    </form>


    <tr>
        id <th scope="row">${client.id}</th> <br>
        first_name <td>${client.first_name}</td> <br>
        second_name <td>${client.second_name}</td> <br>
    </tr>


</body>
</html>
