/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnpapp.gui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import tnpapp.dao.ParticipantDAO;
import tnpapp.pojo.CurrentUser;
import tnpapp.pojo.ParticipantPOJO;
import tnpapp.sendmail.SendMail;

/**
 *
 * @author VorteX
 */
public class HrViewUserProfileFrame extends javax.swing.JFrame {

    private String pid;
    private ParticipantPOJO pt;
    private String jobTitle;
    public HrViewUserProfileFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public HrViewUserProfileFrame(String pid){
        this();
        this.pid = pid;
        loadParticipantDetails(pid);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJobId = new javax.swing.JTextField();
        lblJobId = new javax.swing.JLabel();
        btnDownload = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInvite = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(243, 246, 254));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 185, 63));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 83, 980, 163));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 1, 22)); // NOI18N
        jLabel11.setText("Student Profile");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 264, 218, 33));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 645, 1100, 10));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 662, 111, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1014, 662, 111, -1));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setText("E-mail");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 401, 84, 27));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 332, 84, 27));

        txtMail.setEditable(false);
        txtMail.setBackground(new java.awt.Color(172, 192, 234));
        txtMail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtMail.setBorder(null);
        jPanel3.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 300, 30));

        lblMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel3.add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 401, 330, 40));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(172, 192, 234));
        txtName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtName.setBorder(null);
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 300, 30));

        lblName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel3.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 332, 330, 40));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel5.setText("Contact");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 468, 84, 27));

        txtPhone.setEditable(false);
        txtPhone.setBackground(new java.awt.Color(172, 192, 234));
        txtPhone.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtPhone.setBorder(null);
        jPanel3.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 290, 30));

        lblPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel3.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 330, 40));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel6.setText("Job Id");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 535, 84, 27));

        txtJobId.setEditable(false);
        txtJobId.setBackground(new java.awt.Color(172, 192, 234));
        txtJobId.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtJobId.setBorder(null);
        jPanel3.add(txtJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 290, 30));

        lblJobId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel3.add(lblJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 535, 330, 40));

        btnDownload.setText("Download");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });
        jPanel3.add(btnDownload, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 472, 119, -1));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel7.setText("Click the below Button to Download Resume");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 424, 352, -1));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel8.setText("Click the below Button to invite the Participant for Interview");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 535, 488, -1));

        btnInvite.setText("Invite");
        btnInvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInviteActionPerformed(evt);
            }
        });
        jPanel3.add(btnInvite, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 578, 118, -1));

        jLabel12.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel12.setText("Result");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 341, 84, 27));

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(172, 192, 234));
        txtResult.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtResult.setBorder(null);
        jPanel3.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 300, 30));

        lblResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel3.add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 341, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadParticipantDetails(String pid){
        try{
            pt = ParticipantDAO.getParticipantsForHr(pid);
            System.out.println("inside user prfile" + pt.getName());
            txtName.setText(pt.getName());
            txtJobId.setText(pt.getJobid());
            txtMail.setText(pt.getUserId());
            txtPhone.setText(pt.getPhone());
            txtResult.setText(pt.getResult());
            jobTitle = pt.getJobTitle();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Facing Some Technical Issue while loading student Profile", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private void sendMail(){
        String mailId = txtMail.getText();
        String mailSubject = "Interview Invitation From " + CurrentUser.getId();
        String mailbody = "Hello " + pt.getName() + ",\n\nWarm Welcome From " + CurrentUser.getId() + ",\n"
                        + "You are Qualified our First Technical Round.\n"
                        + "\nJob Description -\n"
                        + "\tJob id : " + txtJobId.getText().trim() + "\n"
                        + "\tJob Title : " + jobTitle + "\n"
                        + "\nYour Interview will be taken by " + CurrentUser.getName() + "\n"
                        + "Interview  Schedule and meeting link will be shared soon.\n" 
                        + "\n Warm Regards"
                        + "\n " + CurrentUser.getName() + "\n"
                        + "\n " + CurrentUser.getId();
        try{
            SendMail.sendMail(mailId, mailSubject, mailbody);
        }
        catch(MessagingException ex){
            JOptionPane.showMessageDialog(null, "Facing Some Technical Issue \nWhile Sending Your Result On Your Registered Email", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HrViewAllParticipantsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Successfully Logout...", "Logout", JOptionPane.INFORMATION_MESSAGE);
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        try{
            ParticipantDAO.getParticipantResume(pid);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"File Not Found!","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } 
        catch (IOException ex){
            JOptionPane.showMessageDialog(null,"File Not Found!","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } 
        catch (SQLException ez){
            JOptionPane.showMessageDialog(null,"File Not Found!","Error",JOptionPane.ERROR_MESSAGE);
            ez.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"Download Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnDownloadActionPerformed

    private void btnInviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInviteActionPerformed
        
        sendMail();
        System.out.println(txtResult.getText());
    }//GEN-LAST:event_btnInviteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HrViewUserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrViewUserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrViewUserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrViewUserProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrViewUserProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnInvite;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtJobId;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
