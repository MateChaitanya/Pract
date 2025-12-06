<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spring MVC Hello</title>
</head>
<body>
    <h2>${message}</h2>
    <p>Hello, <b>${user.name}</b>!</p>
    <p><a href="${pageContext.request.contextPath}/hello">Reload /hello</a></p>
</body>
</html>
