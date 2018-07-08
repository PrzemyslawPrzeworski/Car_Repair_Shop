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
            <th>first_name</th>
            <th>second_name</th>
        </tr>

        <c:forEach items="${allClients}" var="client">
            <tr>
                <th scope="row">${client.id}</th>
                <td>${client.first_name}</td>
                <td>${client.second_name}</td> <br>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
