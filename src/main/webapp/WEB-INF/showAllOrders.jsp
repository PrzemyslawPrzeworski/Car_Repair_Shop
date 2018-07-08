<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>



    <table>
        <tr>
            <th>id</th>
            <th>acceptance_date</th>
            <th>repair_date</th>
            <th>employee_id</th>
            <th>problem_description</th>
            <th>repair_description</th>
            <th>status</th>
            <th>car_id</th>
            <th>client_cost</th>
            <th>parts_cost</th>
            <th>manhour_cost</th>
            <th>manhour</th>
        </tr>

        <c:forEach items="${allOrders}" var="order">
            <tr>
                <th scope="row">${order.id}</th>
                <td>${order.acceptance_date}</td>
                <td>${order.repair_date}</td>
                <td>${order.employee_id}</td>
                <td>${order.problem_description}</td>
                <td>${order.repair_description}</td>
                <td>${order.status}</td>
                <td>${order.car_id}</td>
                <td>${order.client_cost}</td>
                <td>${order.parts_cost}</td>
                <td>${order.manhour_cost}</td>
                <td>${order.manhour}</td> <br>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
