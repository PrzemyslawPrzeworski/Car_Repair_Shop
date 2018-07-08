<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


    <h1>Find Car by ID</h1>
    <form action="#" method="post">

        <input type="text" name="id" placeholder="Car id"/>
        <input type="submit">

    </form>

    <tr>
        id <th scope="row">${car.id}</th> <br>
        model <td>${car.model}</td> <br>
        brand <td>${car.brand}</td> <br>
        production_year <td>${car.production_year}</td> <br>
        number_plate <td>${car.number_plate}</td> <br>
        next_vehicle_inspection <td>${car.next_vehicle_inspection}</td> <br>
        client_id <td>${car.client_id}</td> <br>

    </tr>

</body>
</html>