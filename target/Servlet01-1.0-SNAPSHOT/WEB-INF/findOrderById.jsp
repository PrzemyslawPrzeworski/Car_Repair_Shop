<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Find Order by ID</h1>
    <form action="#" method="post">

        <input type="text" name="id" placeholder="Order id"/>
        <input type="submit">

    </form>


    <tr>
        id <th scope="row">${order.id}</th> <br>
        acceptance_date <td>${order.acceptance_date}</td> <br>
        repair_date <td>${order.repair_date}</td> <br>
        employee_id <td>${order.employee_id}</td> <br>
        problem_description <td>${order.problem_description}</td> <br>
        status <td>${order.status}</td> <br>
        car_id <td>${order.car_id}</td> <br>
        client_cost <td>${order.client_cost}</td> <br>
        parts_cost <td>${order.parts_cost}</td> <br>
        manhour_cost <td>${order.manhour_cost}</td> <br>
        manhour <td>${order.manhour}</td> <br>
    </tr>

</body>
</html>
