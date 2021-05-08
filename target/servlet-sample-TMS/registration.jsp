
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<jsp:include page="_header.jsp"/>

<form action="/reg" method="post">
    <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="name">
    </div>
    <div class="mb-3">
        <label for="login" class="form-label">Login</label>
        <input type="text" class="form-control" id="login" aria-describedby="emailHelp" name="login">
    </div>
    <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" id="password" aria-describedby="emailHelp" name="password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<c:if test="${requestScope.message != null}">
    <div class="alert alert-primary" role="alert">
            ${requestScope.message}
    </div>
</c:if>

</body>
</html>
