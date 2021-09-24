<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@page import ="db.DBAction, java.sql.*, dto.UserInfo" --%>
<!DOCTYPE HTML>
<html>
<head>
    <title>CheckId</title>
</head>
<body>
<%--<%!
    Connection conn = DBAction.getInstance().getConnection();
%>
<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id").trim();
    String sql = "SELECT ID FROM USERINFO WHERE ID = ?";
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();
        if(rs.next()){
        }
        }catch(SQLException e){
            e.printStackTrace();
        }
  %>--%>
    <br><p><center></center><hr><br></p>
<%--<% if(rs.next()) {%>
    <%= rs.getString(1) + "는 사용 할 수 없는 아이디 입니다."%>
<input type="button" value="닫기" onclick="window.close" />
<% } else { %>
    <% request.getParameter("id") + "는 사용 가능한 아이디 입니다." %>
    <input type="button" value="닫기" onclick="window.close()" />
<% } %>--%>
</body>
</html>
