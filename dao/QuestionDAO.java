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
import java.util.ArrayList;
import java.util.List;
import tnpapp.pojo.QuestionPOJO;
import trandpl.dbutil.DBConnection;

/**
 *
 * @author VorteX
 */
public class QuestionDAO {
    public static boolean setPaper(List<QuestionPOJO> questionList) throws SQLException {
        Connection conn = DBConnection.getConnection();
        int count = 0;
        PreparedStatement ps = conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?)");
        for(QuestionPOJO question : questionList){
            ps.setString(1, question.getJobId());
            ps.setInt(2, question.getQno());
            ps.setString(3, question.getQuestion());
            ps.setString(4, question.getOption1());
            ps.setString(5, question.getOption2());
            ps.setString(6, question.getOption3());
            ps.setString(7, question.getOption4());
            ps.setInt(8, question.getCorrectOption());
            int result = ps.executeUpdate();
            if(result == 1)
                ++count;
        }
        if(count == questionList.size())
            return true;
        return false;
    }
    
    public static List<QuestionPOJO> getQuestionPaperByJobId(String jobId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from questions where jobid = ?");
        ps.setString(1, jobId);
        ResultSet rs = ps.executeQuery();
        List<QuestionPOJO> questionList = new ArrayList<QuestionPOJO>();
        while(rs.next()){
            QuestionPOJO question = new QuestionPOJO();
            question.setJobId(rs.getString(1));
            question.setQno(rs.getInt(2));
            question.setQuestion(rs.getString(3));
            question.setOption1(rs.getString(4));
            question.setOption2(rs.getString(5));
            question.setOption3(rs.getString(6));
            question.setOption4(rs.getString(7));
            question.setCorrectOption(rs.getInt(8));
            questionList.add(question);
        }
        return questionList;
    }
    
    public static boolean editQuestionPaper(List<QuestionPOJO> questionList) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update questions set question = ?, option1 = ?, option2 = ?, option3 = ?, option4 = ?, correctoption = ? where jobid = ? and qno = ?");
        int count = 0;
        for(QuestionPOJO question : questionList){
            ps.setString(1, question.getQuestion());
            ps.setString(2, question.getOption1());
            ps.setString(3, question.getOption2());
            ps.setString(4, question.getOption3());
            ps.setString(5, question.getOption4());
            ps.setInt(6, question.getCorrectOption());
            ps.setString(7, question.getJobId());
            ps.setInt(8, question.getQno());
            int result = ps.executeUpdate();
            if(result == 1)
                ++count;
        }
        return count == questionList.size();
    }
    
    public static List<Integer> getAllCorrectOptions(String jobId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select correctoption from questions where jobid = ?");
        ps.setString(1, jobId);
        ResultSet rs = ps.executeQuery();
        List<Integer> correctAnsList = new ArrayList<>();
        while(rs.next()){
            correctAnsList.add(Integer.parseInt(rs.getString(1)));
        }
        return correctAnsList;
    }
    
//    public static void main(String[] args) {
//        List<Integer> correctAnsList = new ArrayList<>();
//        try{
//            correctAnsList = QuestionDAO.getAllCorrectOptions("Job-104");
//            System.err.println(correctAnsList);
//        }
//        catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
}





























