package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserInfoDao {
    public List<UserInfo> selectList() throws Exception {
        ArrayList<UserInfo> userInfos = null;
        Connection conn = DBAction.getInstance().getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM USERINFO ORDER BY NAME ASC");
            userInfos = new ArrayList<UserInfo>();
            while (rs.next()){
                UserInfo userinfo = new UserInfo()
                
            }
        }
    }
}
