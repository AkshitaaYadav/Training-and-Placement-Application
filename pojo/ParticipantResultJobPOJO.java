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
public class ParticipantResultJobPOJO extends ParticipantJobPOJO{

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    private double percentage;
}
