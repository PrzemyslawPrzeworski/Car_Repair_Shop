<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 06.07.18
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Add Employee</h1>
    <form action="#" method="post">
        <input type="hidden" name="id" value="${employee.id}"/>
        <input type="text" name="firstName" placeholder="firstName" value="${employee.firstName}"/>
        <input type="text" name="secondName" placeholder="secondName" value="${employee.secondName}"/>
        <input type="text" name="address" placeholder="address" value="${employee.address}"/>
        <input type="text" name="telephone" placeholder="telephone" value="${employee.telephone}"/>
        <input type="text" name="note" placeholder="note" value="${employee.note}"/>
        <input type="text" name="manHourCost" placeholder="manHourCost" value="${employee.manHourCost}"/>
        <input type="submit">
    </form>

</body>
</html>
