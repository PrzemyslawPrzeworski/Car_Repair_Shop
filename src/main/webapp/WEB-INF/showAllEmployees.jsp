<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 18:37
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
           <th>first_name</th>
           <th>second_name</th>
           <th>address</th>
           <th>telephone</th>
           <th>note</th>
           <th>manhour_cost</th>
        </tr>

        <c:forEach items="${allEmployees}" var="employee">
            <tr>
                <th scope="row">${employee.id}</th>
                <td>${employee.first_name}</td>
                <td>${employee.second_name}</td>
                <td>${employee.address}</td>
                <td>${employee.telephone}</td>
                <td>${employee.note}</td>
                <td>${employee.manhour_cost}</td> <br>
            </tr>
        </c:forEach>
    </table>




</body>
</html>
