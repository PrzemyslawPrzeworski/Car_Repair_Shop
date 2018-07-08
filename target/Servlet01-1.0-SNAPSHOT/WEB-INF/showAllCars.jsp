<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 19:34
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
            <th>model</th>
            <th>brand</th>
            <th>production_year</th>
            <th>number_plate</th>
            <th>next_vehicle_inspection</th>
            <th>client_id</th>
        </tr>

        <c:forEach items="${allCars}" var="car">
            <tr>
                <th scope="row">${car.id}</th>
                <td>${car.model}</td>
                <td>${car.brand}</td>
                <td>${car.production_year}</td>
                <td>${car.number_plate}</td>
                <td>${car.next_vehicle_inspection}</td>
                <td>${car.client_id}</td> <br>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
