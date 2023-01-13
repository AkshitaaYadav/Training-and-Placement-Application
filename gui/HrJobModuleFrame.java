package tnpapp.gui;

import javax.swing.JOptionPane;
import tnpapp.pojo.CurrentUser;

public class HrJobModuleFrame extends javax.swing.JFrame {

    public HrJobModuleFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblCurrentUser.setText(CurrentUser.getName());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCurrentUser = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAddNewJob = new javax.swing.JButton();
        btnRemoveJob = new javax.swing.JButton();
        btnEditJob = new javax.swing.JButton();
        btnSetQuiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 185, 63));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 76, 980, 163));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 34)); // NOI18N
        jLabel4.setText("Welcome,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 257, -1, 33));

        lblCurrentUser.setFont(new java.awt.Font("Gabriola", 1, 34)); // NOI18N
        lblCurrentUser.setText("User");
        jPanel1.add(lblCurrentUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 257, 320, 33));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 656, 111, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 656, 111, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hrjob.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 363, 211, 206));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new/removeJob.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 386, 185, 183));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new/editJob.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 395, 196, 181));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new/setQuiz.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 382, 196, 192));

        btnAddNewJob.setText("Add New Job");
        btnAddNewJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 588, 230, 40));

        btnRemoveJob.setText("Remove Job");
        btnRemoveJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 588, 240, 40));

        btnEditJob.setText("Edit Job");
        btnEditJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 587, 240, 41));

        btnSetQuiz.setText("Set Quiz");
        btnSetQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetQuizActionPerformed(evt);
            }
        });
        jPanel1.add(btnSetQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 587, 230, 41));

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HrOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Successfully Logout...", "Logout", JOptionPane.INFORMATION_MESSAGE);
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnEditJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditJobActionPerformed
        new HrChooseJobForEdittingFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditJobActionPerformed

    private void btnAddNewJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewJobActionPerformed
        new HrAddNewJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddNewJobActionPerformed

    private void btnRemoveJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveJobActionPerformed
        new HrRemoveJobFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRemoveJobActionPerformed

    private void btnSetQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetQuizActionPerformed
        new HrQuizOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSetQuizActionPerformed

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
            java.util.logging.Logger.getLogger(HrJobModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrJobModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrJobModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrJobModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrJobModuleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewJob;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditJob;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemoveJob;
    private javax.swing.JButton btnSetQuiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurrentUser;
    // End of variables declaration//GEN-END:variables
}
