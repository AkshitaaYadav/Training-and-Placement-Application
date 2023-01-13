/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnpapp.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author akash
 */
public class HrOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form HrOptionsFrame
     */
    public HrOptionsFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCurrentUser = new javax.swing.JLabel();
        btnViewAllParticipants = new javax.swing.JButton();
        btnViewResult = new javax.swing.JButton();
        btnViewAllOpenJobs = new javax.swing.JButton();
        btnJobModule1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 185, 63));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 74, 980, 163));

        btnLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 665, 108, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worlp-map-in-black-h9i.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 309, 502, 325));

        jLabel4.setFont(new java.awt.Font("Consolas", 2, 26)); // NOI18N
        jLabel4.setText("Welcome,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 270, -1, 33));

        lblCurrentUser.setFont(new java.awt.Font("Consolas", 2, 26)); // NOI18N
        lblCurrentUser.setText("User");
        jPanel1.add(lblCurrentUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 270, 320, 33));

        btnViewAllParticipants.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViewAllParticipants.setText("View All Participants");
        btnViewAllParticipants.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAllParticipants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllParticipantsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllParticipants, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 424, 265, 36));

        btnViewResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViewResult.setText("View Test Result");
        btnViewResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 492, 265, 36));

        btnViewAllOpenJobs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViewAllOpenJobs.setText("View All Open  Jobs");
        btnViewAllOpenJobs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAllOpenJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllOpenJobsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllOpenJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 562, 265, 36));

        btnJobModule1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnJobModule1.setText("Job Module");
        btnJobModule1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJobModule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobModule1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnJobModule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 360, 265, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Successfully Logout...", "Logout", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewAllParticipantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllParticipantsActionPerformed
        new HrViewAllParticipantsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAllParticipantsActionPerformed

    private void btnViewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewResultActionPerformed
        new HrViewTestResultFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewResultActionPerformed

    private void btnViewAllOpenJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllOpenJobsActionPerformed
        new HrViewAllOpenJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAllOpenJobsActionPerformed

    private void btnJobModule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobModule1ActionPerformed
        new HrJobModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJobModule1ActionPerformed

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
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJobModule1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewAllOpenJobs;
    private javax.swing.JButton btnViewAllParticipants;
    private javax.swing.JButton btnViewResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurrentUser;
    // End of variables declaration//GEN-END:variables
}
