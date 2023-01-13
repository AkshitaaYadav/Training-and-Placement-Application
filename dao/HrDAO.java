package tnpapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tnpapp.pojo.HrPOJO;
import trandpl.dbutil.DBConnection;

public class HrDAO {
    public static int getNewHrId() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(hrid) from hr");
        int hrId = 101;
        rs.next();
        String strid = rs.getString(1);
        System.out.println(strid);
        if(strid != null){
            String id =  strid.substring(3);
            hrId = Integer.parseInt(id) + 1;
        }
        return hrId;
    }
    
    public static int addNewHr(HrPOJO hr) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select userid from users where userid=?");
        ps.setString(1, hr.getUserId());
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            return -1;
        }
        ps = conn.prepareStatement("insert into users values (?, ?, ?, ?, ?, ?)");
        ps.setString(1, hr.getUserId().toUpperCase());
        ps.setString(2, hr.getHrId());
        ps.setString(3, hr.getHrName());
        ps.setString(4, hr.getPassword());
        ps.setString(5, hr.getType());
        ps.setString(6, "y");
        int x = ps.executeUpdate();
        int y = 0;
        if(x == 1){
            ps = conn.prepareStatement("insert into hr values (?, ?, ?, ?)");
            ps.setString(1, hr.getHrId());
            ps.setString(2, hr.getPhone());
            ps.setString(3, hr.getCompanyName());
            ps.setString(4, hr.getProfession());
            y = ps.executeUpdate();
        }
        return y;
    }
    
    public static List<HrPOJO> getAllHrDetails() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
//        String sql = "select hr.hrid, users.userid, users.name, hr.phone, hr.companyname from hr, users where hr.hrid = users.id";
        ResultSet rs = st.executeQuery("select hr.hrid, users.userid, users.name, hr.phone, hr.companyname from hr, users where hr.hrid = users.id and users.active = 'y'");
        List<HrPOJO> allHrList = new ArrayList<>();
        while(rs.next()){
            HrPOJO hr = new HrPOJO();
            hr.setHrId(rs.getString(1));
            hr.setUserId(rs.getString(2));
            hr.setHrName(rs.getString(3));
            hr.setPhone(rs.getString(4));
            hr.setCompanyName(rs.getString(5));
            allHrList.add(hr);
        }
        return allHrList;
    }
    
    public static String getCompanyName(String hrId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select companyname from hr where hrid = ?");
        ps.setString(1, hrId);
        System.out.println(hrId);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            return rs.getString(1);
        System.out.println(rs.getString(1));
        return "";
    }
    
//    public static List<String> getAllHrIds() throws SQLException {
//        Connection conn = DBConnection.getConnection();
//        Statement s = conn.createStatement();
//        ResultSet rs = s.executeQuery("select hrid from hr");
//        List<String> hrList = new ArrayList<>();
//        while(rs.next()){
//            hrList.add(rs.getString(1));
//        }
//        return hrList;
//    }
    
    
//    public static void main(String[] args) {
//        try{
//            System.out.println(HrDAO.getAllHrIds());
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
}
