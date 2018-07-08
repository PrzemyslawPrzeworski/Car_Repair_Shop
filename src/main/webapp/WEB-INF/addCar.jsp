<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Add Car</h1>
    <form action="#" method="post">

        <input type="hidden" name="id" value="${car.id}"/>
        model <input type="text" name="model" placeholder="model" value="${car.model}"/> <br>
        brand <input type="text" name="brand" placeholder="brand" value="${car.brand}"/> <br>
        production_year <input type="text" name="production_year" placeholder="production_year" value="${car.production_year}"/> <br>
        number_plate <input type="text" name="number_plate" placeholder="number_plate" value="${car.number_plate}"/> <br>
        next_vehicle_inspection <input type="date" name="next_vehicle_inspection" placeholder="next_vehicle_inspection" value="${car.next_vehicle_inspection}"/> <br>
        client_id <input type="text" name="client_id" placeholder="client_id" value="${car.client_id}"/> <br>

        <input type="submit">
    </form>

</body>
</html>
