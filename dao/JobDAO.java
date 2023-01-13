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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tnpapp.pojo.HrJobPOJO;
import tnpapp.pojo.JobPOJO;
import tnpapp.pojo.ParticipantJobPOJO;
import tnpapp.pojo.ParticipantResultJobPOJO;
import trandpl.dbutil.DBConnection;

/**
 *
 * @author VorteX
 */
public class JobDAO {
    public static int getNewJobId()throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(jobid) from jobs");
        rs.next();
        String strid = rs.getString(1);
        int jobid = 101;
        if(strid != null){
            String id = strid.substring(4);
            jobid = Integer.parseInt(id) + 1;
        }
        return jobid;
    }
    
    public static boolean addNewJob(JobPOJO job) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into jobs values (?,?,?,?,?)");
        ps.setString(1, job.getJobId());
        ps.setString(2, job.getJobTitle());
        ps.setString(3, job.getHrId());
        ps.setString(4, job.getTags());
        ps.setString(5, String.valueOf(job.getStatus()));
        
        int x = ps.executeUpdate();
        return x == 1;
    }
    
    public static boolean removeJob(String jobId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update jobs set status = -1 where jobid = ?");
        ps.setString(1, jobId);
        return ps.executeUpdate() == 1;
    }
    
    public static List getAllJobs(String hrid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select jobid, jobtitle, tags, status from jobs where hrid = ? and status = 0");
        ps.setString(1, hrid);
        ResultSet rs = ps.executeQuery();
        List<JobPOJO> allJobList = new ArrayList<>();
        while(rs.next()){
            JobPOJO job = new JobPOJO();
            job.setJobId(rs.getString(1));
            job.setJobTitle(rs.getString(2));
            job.setTags(rs.getString(3));
            job.setStatus(rs.getInt(4));
            allJobList.add(job);
        }
        return allJobList;
    }
   
    public static List<JobPOJO> getAllJobsForSettingQuiz(String hrid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select jobid, jobtitle, tags, status from jobs where hrid = ? and status = 0");
        ps.setString(1, hrid);
        ResultSet rs = ps.executeQuery();
        List<JobPOJO> allJobList = new ArrayList<>();
        while(rs.next()){
            JobPOJO job = new JobPOJO();
            job.setJobId(rs.getString(1));
            job.setJobTitle(rs.getString(2));
            job.setTags(rs.getString(3));
            job.setStatus(rs.getInt(4));
            allJobList.add(job);
        }
        return allJobList;
    }
    
    
    public static List<JobPOJO> getAllOpenJobsByCurrentHr(String hrId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select jobid, jobtitle, tags, status from jobs where hrid = ? and status = 1 order by jobid");
        ps.setString(1, hrId);
        ResultSet rs = ps.executeQuery();
        List<JobPOJO> allJobList = new ArrayList<>();
        while(rs.next()){
            JobPOJO job = new JobPOJO();
            job.setJobId(rs.getString(1));
            job.setJobTitle(rs.getString(2));
            job.setTags(rs.getString(3));
            job.setStatus(rs.getInt(4));
            allJobList.add(job);
        }
        return allJobList;
    }
    
//    
//    public static List<JobPOJO> getAllJobsForEditQuiz(String hrid) throws SQLException {
//        Connection conn = DBConnection.getConnection();
//        PreparedStatement ps = conn.prepareStatement("select jobid, jobtitle, tags, status from jobs where hrid = ? and status = 1");
//        ps.setString(1, hrid);
//        ResultSet rs = ps.executeQuery();
//        List<JobPOJO> allJobList = new ArrayList<>();
//        while(rs.next()){
//            JobPOJO job = new JobPOJO();
//            job.setJobId(rs.getString(1));
//            job.setJobTitle(rs.getString(2));
//            job.setTags(rs.getString(3));
//            job.setStatus(rs.getInt(4));
//            allJobList.add(job);
//        }
//        return allJobList;
//    }

    public static boolean editJob(JobPOJO job) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update jobs set jobtitle = ?, tags = ? where jobid = ?");
        ps.setString(1, job.getJobTitle());
        ps.setString(2, job.getTags());
        ps.setString(3, job.getJobId());
        return ps.executeUpdate() == 1;
    }
    
    public static void setJobStatus(String jobId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update jobs set status = 1 where jobId = ?");
        ps.setString(1, jobId);
        ps.executeUpdate();
    }

    public static List<ParticipantJobPOJO> getAllAvailableJobs() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select jobid, jobtitle, companyname, tags, jobs.hrid from jobs, hr where jobs.hrid = hr.hrid and status = 1  order by jobid");
        List<ParticipantJobPOJO> ptList = new ArrayList<ParticipantJobPOJO>();
        while(rs.next()){
            ParticipantJobPOJO pt = new ParticipantJobPOJO();
            pt.setJobId(rs.getString(1));
            pt.setJobTitle(rs.getString(2));
            pt.setCompanyName(rs.getString(3));
            pt.setTags(rs.getString(4));
            pt.setHrId(rs.getString(5));
            ptList.add(pt);
        }
        return ptList;
    }
    
    public static List<ParticipantJobPOJO> getAllAppliedJobs(String pid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select jobs.jobid, jobs.jobtitle, hr.companyname, jobs.tags from jobs, hr, results where jobs.hrid = hr.hrid and jobs.jobid = results.jobid and percentage = -1 and pid = ? order by jobid");
        ps.setString(1, pid);
        ResultSet rs = ps.executeQuery();
        List<ParticipantJobPOJO> allAppliedJObsList = new ArrayList<ParticipantJobPOJO>();
        while(rs.next()){
            ParticipantJobPOJO pt = new ParticipantJobPOJO();
            pt.setJobId(rs.getString(1));
            pt.setJobTitle(rs.getString(2));
            pt.setCompanyName(rs.getString(3));
            pt.setTags(rs.getString(4));
            allAppliedJObsList.add(pt);
        }
        return allAppliedJObsList;
    }
    
    public static List<ParticipantResultJobPOJO> getAllCompletedJobs(String pid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select jobs.jobid, jobs.jobtitle, hr.companyname, jobs.tags, results.percentage from hr, results, jobs where results.jobid = jobs.jobid and jobs.hrid = hr.hrid and pid = ? and percentage != -1 order by jobid");
        ps.setString(1, pid);
        ResultSet rs = ps.executeQuery();
        List<ParticipantResultJobPOJO> allCompletedJobs= new ArrayList<>();
        while(rs.next()){
            ParticipantResultJobPOJO pojo = new ParticipantResultJobPOJO();
            pojo.setJobId(rs.getString(1));
            
            pojo.setJobTitle(rs.getString(2));
            pojo.setCompanyName(rs.getString(3));
            pojo.setTags(rs.getString(4));
            pojo.setPercentage(Double.parseDouble(rs.getString(5)));
            allCompletedJobs.add(pojo);
        }
        return allCompletedJobs;
    }
    
    public static List<HrJobPOJO> getAllJobsForAdmin() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select jobid, jobtitle, companyname, hr.hrid, status from jobs, hr where jobs.hrid = hr.hrid order by jobid");
        List<HrJobPOJO> HrJobList = new ArrayList<HrJobPOJO>();
        while(rs.next()){
            HrJobPOJO pojo = new HrJobPOJO();
            pojo.setJobId(rs.getString(1));
            pojo.setJobTitle(rs.getString(2));
            pojo.setCompanyName(rs.getString(3));
            pojo.setHrId(rs.getString(4));
            pojo.setStatus(rs.getInt(5));
            HrJobList.add(pojo);
        }
        return HrJobList;
    }
    
    public static List<ParticipantJobPOJO> getAllAvailableJobsForHr(String hrid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareCall("select jobid, jobtitle, companyname, tags, jobs.hrid from jobs, hr where jobs.hrid = hr.hrid and status = 1 and hr.hrid = ? order by jobid");
        ps.setString(1, hrid);
        ResultSet rs = ps.executeQuery();
        List<ParticipantJobPOJO> ptList = new ArrayList<ParticipantJobPOJO>();
        while(rs.next()){
            ParticipantJobPOJO pt = new ParticipantJobPOJO();
            pt.setJobId(rs.getString(1));
            pt.setJobTitle(rs.getString(2));
            pt.setCompanyName(rs.getString(3));
            pt.setTags(rs.getString(4));
            pt.setHrId(rs.getString(5));
            ptList.add(pt);
        }
        return ptList;
    }
    
    public static void main(String[] args) {
        try{
            List<ParticipantJobPOJO> allParticipants = getAllAvailableJobsForHr("HR-101");
            for(ParticipantJobPOJO pt:allParticipants){
                System.out.println(pt.getJobId() + " ");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}































