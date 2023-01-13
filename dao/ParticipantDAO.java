/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnpapp.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tnpapp.pojo.ParticipantPOJO;
import trandpl.dbutil.DBConnection;

/**
 *
 * @author VorteX
 */
public class ParticipantDAO {
    public static int getNewParticipantId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(pid) from participants");
        int pid = 101;
        rs.next();
        String strid = rs.getString(1);
        if(strid != null){
            String id = strid.substring(2);
            pid = Integer.parseInt(id) + 1;
        }
        return pid;
    }
    
    public static int addNewParticipant(ParticipantPOJO pt) throws SQLException, FileNotFoundException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select userid from users where userid = ?");
        ps.setString(1, pt.getUserId());
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            return -1;
        ps = conn.prepareStatement("insert into users values (?,?,?,?,?,?)");
        ps.setString(1, pt.getUserId().toUpperCase());
        ps.setString(2, pt.getPid());
        ps.setString(3, pt.getName());
        ps.setString(4, pt.getPassword());
        ps.setString(5, pt.getType());
        ps.setString(6, "y");
        int x = ps.executeUpdate();
        int y = 0;
        if(x == 1){
            ps = conn.prepareStatement("insert into participants values (?,?,?,?,?)");
            ps.setString(1, pt.getPid());
            ps.setString(2, pt.getPhone());
            ps.setString(3, pt.getSkills());
            ps.setString(4, pt.getQualification());
            File f = pt.getResume();
            InputStream fin = new FileInputStream(f.getPath());
            ps.setBlob(5, fin, (int)f.length());
            y = ps.executeUpdate();
        }
        return y;
    }
    
    public static ParticipantPOJO getDetailsOfParticipantByPid(String pid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select users.name, users.userid, participants.phone from users, participants where participants.pid = users.id and id = ?");
        ps.setString(1, pid);
        ResultSet rs = ps.executeQuery();
        ParticipantPOJO pt = new ParticipantPOJO();
        if(rs.next()){
            pt.setName(rs.getString(1));
            pt.setUserId(rs.getString(2));
            pt.setPhone(rs.getString(3));
        }
        return pt;
    }
    
    public static boolean updateResume(String pid, File resume) throws SQLException, FileNotFoundException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update participants set resume = ? where pid = ?");
        InputStream fin = new FileInputStream(resume.getPath());
        ps.setBlob(1, fin);
        ps.setString(2, pid);
        return ps.executeUpdate() == 1;
    }
    
    public static List<ParticipantPOJO> getAllParticipantsForAdmin() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select pid, users.name, phone, users.userid, skills from participants, users where participants.pid = users.id");
        List<ParticipantPOJO> ptList = new ArrayList<>();
        while(rs.next()){
            ParticipantPOJO pojo = new ParticipantPOJO();
            pojo.setPid(rs.getString(1));
            pojo.setName(rs.getString(2));
            pojo.setPhone(rs.getString(3));
            pojo.setUserId(rs.getString(4));
            pojo.setSkills(rs.getString(5));
            ptList.add(pojo);
        }
        return ptList;
    }
    
    public static List<ParticipantPOJO> getAllSelectedParticipantsForAdmin() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select participants.pid, users.name, participants.phone, users.userid, results.jobid from ((users inner join participants on users.id = participants.pid) inner join results on users.id = results.pid) where selectedbyhr = 'yes'");
        List<ParticipantPOJO> ptList = new ArrayList<>();
        while(rs.next()){
            ParticipantPOJO pojo = new ParticipantPOJO();
            pojo.setPid(rs.getString(1));
            pojo.setName(rs.getString(2));
            pojo.setPhone(rs.getString(3));
            pojo.setUserId(rs.getString(4));
            pojo.setJobid(rs.getString(5));
            ptList.add(pojo);
        }
        return ptList;
    }    
    
    public static List<ParticipantPOJO> getAllParticipantsByCurrentHr(String hrid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select users.id, users.name, users.userid, jobs.jobid from users, results, hr, jobs where results.jobid = jobs.jobid and jobs.hrid = hr.hrid and hr.hrid = ? and users.id = results.pid");
        ps.setString(1, hrid);
        ResultSet rs = ps.executeQuery();
        List<ParticipantPOJO> ptList = new ArrayList<>();
        while(rs.next()){
            ParticipantPOJO pt = new ParticipantPOJO();
            pt.setPid(rs.getString(1));
            pt.setName(rs.getString(2));
            pt.setUserId(rs.getString(3));
            pt.setJobid(rs.getString(4));
            ptList.add(pt);
        }
        return ptList;
    }
    
    public static ParticipantPOJO getParticipantsForHr(String pid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select users.name, users.userid, participants.phone, results.pid, results.percentage, jobs.jobtitle from users, participants, results, jobs where users.id = participants.pid and participants.pid = results.pid and results.jobid = jobs.jobid and participants.pid = ?"); 
        ps.setString(1, pid);
        ResultSet rs = ps.executeQuery();
        ParticipantPOJO pt = new ParticipantPOJO();
        while(rs.next()){
            pt.setName(rs.getString(1));
            pt.setUserId(rs.getString(2));
            pt.setPhone(rs.getString(3));
            pt.setJobid(rs.getString(4));
            pt.setResult(rs.getString(5));
            pt.setJobTitle(rs.getString(6));
        }
        return pt;
    }
    
    public static void getParticipantResume(String participantId)throws FileNotFoundException, IOException, SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name, resume from users, participants where users.id=participants.pid and pid=?");
        ps.setString(1, participantId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        String pname = rs.getString(1);
        pname = pname.replace(' ', '_');
        File theFile = new File(pname+".pdf");
        FileOutputStream output = new FileOutputStream(theFile);
        InputStream input = rs.getBinaryStream("resume");
        
        byte[] buffer = new byte[1024];
        while(input.read(buffer) > 0){
            output.write(buffer);
        }
        System.out.println("Saved file: "+theFile.getAbsolutePath());
    }
    
    public static List<ParticipantPOJO> getAllParticipantsResultsByHr(String hrId) throws SQLException{
        Connection conn=DBConnection.getConnection();       
        PreparedStatement ps=conn.prepareStatement("select pid,name,userid,results.jobid,jobtitle,percentage from results, users, jobs, hr where users.id=results.pid and jobs.jobid=results.jobid and jobs.hrid=hr.hrid and jobs.hrid=? order by pid");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        List<ParticipantPOJO> allParticipants=new ArrayList<>();
        while(rs.next()){
            ParticipantPOJO pt=new ParticipantPOJO();
            pt.setPid(rs.getString(1));
            pt.setName(rs.getString(2));
            pt.setUserId(rs.getString(3));
            pt.setJobid(rs.getString(4));
            pt.setJobTitle(rs.getString(5));
            pt.setResult(rs.getString(6));
            allParticipants.add(pt);
        }
        return allParticipants;
    }
    
    
    
    public static void main(String[] args) {
        try{
            List<ParticipantPOJO> allParticipants = getAllParticipantsResultsByHr("HR-101");
            for(ParticipantPOJO pt:allParticipants){
                System.out.println(pt.getName() + " ");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
































