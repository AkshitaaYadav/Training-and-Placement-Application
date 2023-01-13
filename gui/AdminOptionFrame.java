package tnpapp.gui;

import javax.swing.JOptionPane;
import tnpapp.pojo.CurrentUser;

public class AdminOptionFrame extends javax.swing.JFrame {

    public AdminOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblCurrentUser.setText(CurrentUser.getName());
    }

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
        btnHrModule = new javax.swing.JButton();
        btnViewAllJob = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnSelectedStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 710, 108, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 346, 502, 325));

        jLabel4.setFont(new java.awt.Font("Consolas", 2, 26)); // NOI18N
        jLabel4.setText("Welcome,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 270, -1, 33));

        lblCurrentUser.setFont(new java.awt.Font("Consolas", 2, 26)); // NOI18N
        lblCurrentUser.setText("User");
        jPanel1.add(lblCurrentUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 270, 320, 33));

        btnHrModule.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHrModule.setText("HR Module");
        btnHrModule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHrModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHrModuleActionPerformed(evt);
            }
        });
        jPanel1.add(btnHrModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 349, 265, 36));

        btnViewAllJob.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViewAllJob.setText("View All Job");
        btnViewAllJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAllJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 422, 265, 36));

        btnViewStudent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViewStudent.setText("View Students");
        btnViewStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 492, 265, 36));

        btnSelectedStudent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSelectedStudent.setText("View All Selected Students");
        btnSelectedStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelectedStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectedStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectedStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 562, 265, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 651));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Successfully Logout...", "Logout", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed
    
    private void btnHrModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHrModuleActionPerformed
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHrModuleActionPerformed

    private void btnViewAllJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllJobActionPerformed
        new AdminViewAllJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAllJobActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        new AdminViewAllParticipantsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnSelectedStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectedStudentActionPerformed
        new AdminViewSelectedParticipantsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSelectedStudentActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHrModule;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSelectedStudent;
    private javax.swing.JButton btnViewAllJob;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurrentUser;
    // End of variables declaration//GEN-END:variables
}
