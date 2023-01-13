/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnpapp.pojo;

/**
 *
 * @author VorteX
 */
public class ResultPOJO {

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getSelectedByHr() {
        return selectedByHr;
    }

    public void setSelectedByHr(String selectedByHr) {
        this.selectedByHr = selectedByHr;
    }
    private String pid;
    private String jobid;
    private double percentage;
    private String selectedByHr;
}
