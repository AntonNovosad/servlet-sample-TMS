
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<jsp:include page="_header.jsp"/>

<form action="/profile" method="post">

    Login: ${sessionScope.user.login}
    <nav class="nav">
        <a class="nav-link calculation" aria-current="page" href="calculation">Calculation</a>
        <a class="nav-link history" href="history">History</a>
        <a class="nav-link update" href="update">Update</a>
    </nav>
</form>
</body>
</html>
