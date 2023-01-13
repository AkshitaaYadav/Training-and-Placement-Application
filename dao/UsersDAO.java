package tnpapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import trandpl.dbutil.DBConnection;
import tnpapp.pojo.CurrentUser;
import tnpapp.pojo.HrPOJO;
import tnpapp.pojo.UsersPOJO;

public class UsersDAO {
    public static boolean validateUser(UsersPOJO user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ? and password = ? and type = ? ");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getType());
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            CurrentUser.setId(rs.getString(2));
            CurrentUser.setUserId(user.getUserId());
            CurrentUser.setType(user.getType());
            CurrentUser.setName(rs.getString(3));
            System.out.println("DAO : " + CurrentUser.getType() + CurrentUser.getUserId());
            return true;
        }
        return false;
    }
    
    public static Map<String, HrPOJO> getAHrList() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select userid, id, name from users where type = 'HR'");
        Map<String, HrPOJO> map = new HashMap<>();
        while(rs.next()){
            String userid = rs.getString(1);
            String id = rs.getString(2);
            String name = rs.getString(3);
            HrPOJO hr = new HrPOJO();
            hr.setHrId(id);
            hr.setHrName(name);
            map.put(userid, hr);
        }
        return map;
    }
    
    public static boolean updatePassword(String userId, String password) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set password = ?, active = 'y' where userid = ?");
        ps.setString(1, password);
        ps.setString(2, userId);
        return 1 == ps.executeUpdate();
    }
    
    public static boolean removeHr(String userId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set active = 'n' where userid = ?");
        ps.setString(1, userId);
        int result = ps.executeUpdate();
        return result == 1;
    }
    
    public static boolean checkOldPassword(String pid, String oldPwd) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where id = ? and password = ?");
        ps.setString(1, pid);
        ps.setString(2, oldPwd);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
    public static boolean updateParticipantPassword(String pid, String pwd) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set password = ? where id = ?");
        ps.setString(1, pwd);
        ps.setString(2, pid);
        return ps.executeUpdate() == 1;
    }
}