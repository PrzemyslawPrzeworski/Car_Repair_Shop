<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form target="/editEmployee" method="get">
        <input type="number" name="id" placeholder="id Employee">
        <input type="submit" value="Submit Query">
    </form>

    <form method="post" target="/editEmployee">
        <h3>Edit Employee</h3>
        <div class="form-row">
            <div class="form-group"> ID:
                <input type="number" class="form-control" value="${employee.id}" name="id">
            </div>
            <div class="form-group"> First Name:
                <input type="text" class="form-control" value="${employee.first_name}" name="first_name">
            </div>
            <div class="form-group"> Second Name:
                <input type="text" class="form-control" value="${employee.second_name}" name="second_name">
            </div>
            <div class="col"> Address:
                <input type="text" class="form-control" value="${employee.address}" name="address">
            </div>
            <div class="col"> Telephone:
                <input type="text" class="form-control" value="${employee.telephone}" name="telephone">
            </div>
            <div class="col"> Note:
                <input type="text" class="form-control" value="${employee.note}" name="note">
            </div>
            <div class="col"> Man-hour Cost
                <input type="number" class="form-control" value="${employee.manhour_cost}" name="manhour_cost">
            </div>
        </div>
        <input type="submit" value="Submit Query">

    </form>

</body>
</html>
