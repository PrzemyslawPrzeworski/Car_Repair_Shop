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
        first_name <input type="text" name="first_name" placeholder="firstName" value="${employee.first_name}"/> <br>
        second_name <input type="text" name="second_name" placeholder="secondName" value="${employee.second_name}"/> <br>
        address <input type="text" name="address" placeholder="address" value="${employee.address}"/> <br>
        telephone <input type="text" name="telephone" placeholder="telephone" value="${employee.telephone}"/> <br>
        note <input type="text" name="note" placeholder="note" value="${employee.note}"/> <br>
        manhour_cost <input type="text" name="manhour_cost" placeholder="manHourCost" value="${employee.manhour_cost}"/> <br>
        <input type="submit">
    </form>

</body>
</html>
