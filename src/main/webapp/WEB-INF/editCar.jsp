<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


    <form target="/editCar" method="get">
        <input type="number" name="id" placeholder="id Car">
        <input type="submit" value="Submit Query">
    </form>

    <form method="post" target="/editCar">
        <h3>Edit Car</h3>
        <div class="form-row">
            <div class="form-group"> ID:
                <input type="number" class="form-control" value="${car.id}" name="id">
            </div>
            <div class="form-group"> Model :
                <input type="text" class="form-control" value="${car.model}" name="model">
            </div>
            <div class="form-group"> Brand :
                <input type="text" class="form-control" value="${car.brand}" name="brand">
            </div>
            <div class="col"> Production year :
                <input type="text" class="form-control" value="${car.production_year}" name="production_year">
            </div>
            <div class="col"> Number Plate:
                <input type="text" class="form-control" value="${car.number_plate}" name="number_plate">
            </div>
            <div class="col"> Next Vehicle Inspection:
                <input type="date" class="form-control" value="${car.next_vehicle_inspection}" name="next_vehicle_inspection">
            </div>
            <div class="col"> Client ID
                <input type="number" class="form-control" value="${car.client_id}" name="client_id">
            </div>
        </div>
        <input type="submit" value="Submit Query">

    </form>

</body>
</html>
