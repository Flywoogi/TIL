<%--
  Created by IntelliJ IDEA.
  User: hadong-wook
  Date: 2021/09/23
  Time: 3:08 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ex2.jsp</title>
</head>
<body>
    <%!
        int a;
        int b;
    %>
    <%
        a = 10;
        b = 20;
        if (b / a > 10){


    %>
    <p>
        양의 값(첫 번째) <br>
        <%= "양의 값(두 번째) "%> <br>
        <% out.println("다시 양의 값(세 번째)"); %>
        <%
            }else {
        %>
        <%
            out.println("음의 값");
        %>
        <%
            }
        %>
    </p>
</body>
</html>
