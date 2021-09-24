<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: hadong-wook
  Date: 2021/09/23
  Time: 3:47 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ex3.jsp</title>
    <style>
        table{
            width: 100%;
            border: 1px solid #444444;
        }
        tr {
            color: greenyellow;
        }
        th, td {
            border-bottom: 1px solid #444444;
            border-left: 1px solid #444444;
            padding: 10px;
        }
    </style>
</head>
<body>
    <%!
        int sum;
        Calendar cal;
    %>
    <%
        cal = Calendar.getInstance();
        String[] yoil = {"일", "월", "화", "수", "목","금","토"};
    %>
    <table border="5">
        <tr>
            <%
                for (int i = 2; i <10; i++){
            %>
            <td>
                <% out.print(i + " 단 "); %>
            </td>
            <%
                }
            %>
        </tr>
        <%
            for (int i = 1; i < 10; i++){
        %>
        <tr>
            <%
                for (int j = 2; j < 10; j++){
                    sum = i * j;
            %>
            <td>
                <%= j + "*" + i + "=" + sum%>
            </td>
            <%
                }
            %>
        </tr>
        <%
            }
        %>
        <%
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH) + 1;
            int date = cal.get(Calendar.DATE);
            int hour = cal.get(Calendar.HOUR);
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);
            int day = cal.get(Calendar.DAY_OF_WEEK);
        %>
        <%=
        year + " 년" + month + " 월" + date + " 일" + hour + " 시" + minute + " 분" + second + "초 입니다. (오늘은 \""  + yoil[day - 1] + "\"요일 입니다)"
        %>
    </table>
</body>
</html>
