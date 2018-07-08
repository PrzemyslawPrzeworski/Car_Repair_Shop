<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Add Order</h1>
    <form action="#" method="post">

        <input type="hidden" name="id" value="${order.id}"/>
        Acceptance Date
        <input type="date" name="acceptance_date" placeholder="acceptance_date" value="${order.acceptance_date}"/> <br>
        Repair Date
        <input type="date" name="repair_date" placeholder="repair_date" value="${order.repair_date}"/><br>
        Employee ID
        <input type="text" name="employee_id" placeholder="employee_id" value="${order.employee_id}"/> <br>
        Problem description
        <input type="text" name="problem_description" placeholder="problem_description" value="${order.problem_description}"/> <br>
        Repair description
        <input type="text" name="repair_description" placeholder="repair_description" value="${order.repair_description}"/> <br>
        Status
        <input type="text" name="status" placeholder="status" value="${order.status}"/> <br>
        Car ID
        <input type="text" name="car_id" placeholder="car_id" value="${order.car_id}"/> <br>
        Client cost
        <input type="text" name="client_cost" placeholder="client_cost" value="${order.client_cost}"/> <br>
        Parts cost
        <input type="text" name="parts_cost" placeholder="parts_cost" value="${order.parts_cost}"/> <br>
        Manhour cost
        <input type="text" name="manhour_cost" placeholder="manhour_cost" value="${order.manhour_cost}"/> <br>
        Manhour
        <input type="text" name="manhour" placeholder="manhour" value="${order.manhour}"/> <br>

        <input type="submit">
    </form>

</body>
</html>
