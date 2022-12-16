
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--instance variables--%>
<%! private String username = ""; %>
<%! private String password = ""; %>

<%-- java code being evaluated --%>
<%-- There must be a request in order to be true --%>
<%--  --%>
<%
    if (request != null) {
        username = request.getParameter("username");
        password = request.getParameter("password");

        if (username != null && password != null) {

            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("profile.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }

        }
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <form method="post" action="login.jsp">
        <label for="username">Email:</label>
        <input type="text" id="username" name="username"><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="login"/>
    </form>
</div>

</body>
</html>
