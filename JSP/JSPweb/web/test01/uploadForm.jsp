<%--
  Created by IntelliJ IDEA.
  User: hadong-wook
  Date: 2021/09/30
  Time: 10:29 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${contextPath}/upload.do"
                        method="post" enctype="multipart/form-data">
        <input type="file" name="file1"><br>
        <input type="file" name="file2"><br>
        <input type="text" name="param1"><br>
        <input type="text" name="param2"><br>
        <input type="text" name="param3"><br>
        <input type="submit" value="업로드">
    </form>
</body>
</html>
