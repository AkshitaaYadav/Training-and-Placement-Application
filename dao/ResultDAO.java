/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnpapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import trandpl.dbutil.DBConnection;
import tnpapp.pojo.ResultPOJO;

/**
 *
 * @author VorteX
 */
public class ResultDAO {
    public static boolean applyForJob(ResultPOJO result) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from results where pid = ? and jobid = ?");
        ps.setString(1, result.getPid());
        ps.setString(2, result.getJobid());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return false;
        }
        ps = conn.prepareStatement("insert into results values(?,?,?,?)");
        ps.setString(1, result.getPid());
        ps.setString(2, result.getJobid());
        ps.setDouble(3, result.getPercentage());
        ps.setString(4, result.getSelectedByHr());
        int ans = ps.executeUpdate();
        return ans == 1;
    }
    
    public static boolean setResult(ResultPOJO result) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update results set percentage = ? where pid = ? and jobid = ?");
        ps.setDouble(1, result.getPercentage());
        ps.setString(2, result.getPid());
        ps.setString(3, result.getJobid());
        return 1 == ps.executeUpdate();
    }  
}



































