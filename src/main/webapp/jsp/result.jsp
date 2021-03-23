<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>Result</title>
</head>
<body>
Result: ${result}
<div style="margin-top: 50px">
<table border="1">
    <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Username</th>
        <th>Password</th>
    </tr>

    <c:forEach  var="user" items="${users}">
        <tr>
            <td><c:out value="${user.firstname}"/></td>
            <td><c:out value="${user.lastname}"/></td>
            <td><c:out value="${user.login}"/></td>
            <td><c:out value="${user.password}"/></td>
        </tr>
    </c:forEach>

</table>
</div>
</body>
</html>