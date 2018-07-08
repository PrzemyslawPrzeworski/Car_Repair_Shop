<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 08.07.18
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form target="/editClient" method="get">
        <input type="number" name="id" placeholder="id Client">
        <input type="submit" value="Submit Query">
    </form>

    <form method="post" target="/editClient">
        <h3>Edit Client</h3>
        <div class="form-row">
            <div class="form-group"> ID:
                <input type="number" class="form-control" value="${client.id}" name="id">
            </div>
            <div class="form-group"> First Name:
                <input type="text" class="form-control" value="${client.first_name}" name="first_name">
            </div>
            <div class="form-group"> Second Name:
                <input type="text" class="form-control" value="${client.second_name}" name="second_name">
            </div>
        </div>
        <input type="submit" value="Submit Query">

    </form>

</body>
</html>
