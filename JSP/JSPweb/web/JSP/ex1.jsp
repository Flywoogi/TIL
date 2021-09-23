<%--
  Created by IntelliJ IDEA.
  User: hadong-wook
  Date: 2021/09/23
  Time: 1:55 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        String str = "Hello JSP";
        int su1 = 5, su2 =7;
        public int method() {
            return su1 + su2;
        }
    %>
    <% out.println("msg"); %>
    <%= method() %>
</body>
</html>
