<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form target="/editOrder" method="get">
        <input type="number" name="id" placeholder="id Order">
        <input type="submit" value="Submit Query">
    </form>

    <form method="post" target="/editOrder">
        <h3>Edit Order</h3>
        <div class="form-row">
            <div class="form-group"> ID:
                <input type="number" class="form-control" value="${order.id}" name="id">
            </div>
            <div class="form-group"> Acceptance Date :
                <input type="text" class="form-control" value="${order.acceptance_date}" name="acceptance_date">
            </div>
            <div class="form-group"> Repair Date :
                <input type="text" class="form-control" value="${order.repair_date}" name="repair_date">
            </div>
            <div class="col"> Employee ID :
                <input type="number" class="form-control" value="${order.employee_id}" name="employee_id">
            </div>
            <div class="col"> Problem Description :
                <input type="text" class="form-control" value="${order.problem_description}" name="problem_description">
            </div>
            <div class="col"> Repair Description:
                <input type="text" class="form-control" value="${order.repair_description}" name="repair_description">
            </div>
            <div class="col"> Status :
                <input type="text" class="form-control" value="${order.status}" name="status">
            </div>
            <div class="col"> Car ID :
                <input type="number" class="form-control" value="${order.car_id}" name="car_id">
            </div>
            <div class="col"> Client cost :
                <input type="number" class="form-control" value="${order.client_cost}" name="client_cost">
            </div>
            <div class="col"> Parts cost:
                <input type="number" class="form-control" value="${order.parts_cost}" name="parts_cost">
            </div>
            <div class="col"> Man-hour cost:
                <input type="number" class="form-control" value="${order.manhour_cost}" name="manhour_cost">
            </div>
            <div class="col"> Man-hour :
                <input type="number" class="form-control" value="${order.manhour}" name="manhour">
            </div>
        </div>
        <input type="submit" value="Submit Query">

    </form>

</body>
</html>
