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
public class ParticipantJobPOJO extends JobPOJO{

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
        
    private String companyName;
    
}
