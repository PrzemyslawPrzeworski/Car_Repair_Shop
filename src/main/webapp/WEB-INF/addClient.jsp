<%--
  Created by IntelliJ IDEA.
  User: milena
  Date: 07.07.18
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Client</title>
</head>
<body>

    <h1>Add Client</h1>
    <form action="#" method="post">
    <form>
        <input type="hidden" name="id" value="${client.id}">
        <input type="text" name="first_name" placeholder="name" value="${client.first_name}" >
        <input type="text" name="second_name" placeholder="surname" value="${client.second_name}">
        <input type="date" name="birthday">
        <input type="submit">
    </form>

</body>
</html>
