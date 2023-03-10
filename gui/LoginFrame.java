package tnpapp.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import tnpapp.dao.UsersDAO;
import tnpapp.pojo.CurrentUser;
import tnpapp.pojo.UsersPOJO;

public class LoginFrame extends javax.swing.JFrame {

    private String userId;
    private String password;
    
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private boolean validateInputs(){
        userId = txtUserId.getText().trim();
        char[] pwd = txtPassword.getPassword();
        if(userId.isEmpty() || pwd.length == 0)
            return false;
        password = String.valueOf(pwd);
        return true;
    }
    
    private String validateUser(){
        if(rbtnAdmin.isSelected())
            return "Admin";
        else if(rbtnHr.isSelected())
            return "HR";
        else if(rbtnStudent.isSelected())
            return "Student";
        else
            return null;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnHr = new javax.swing.JRadioButton();
        rbtnStudent = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 245, 64));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homePage.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 578, 420));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Email or User Id :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 208, -1, -1));

        txtUserId.setBackground(new java.awt.Color(172, 192, 234));
        txtUserId.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtUserId.setBorder(null);
        jPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 263, 390, 36));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 40));

        txtPassword.setBackground(new java.awt.Color(172, 192, 234));
        txtPassword.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 350, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Password :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 318, 136, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 412, 440, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Select User Type :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 160, -1));

        rbtnAdmin.setBackground(new java.awt.Color(243, 246, 254));
        buttonGroup1.add(rbtnAdmin);
        rbtnAdmin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtnAdmin.setText("Admin");
        jPanel1.add(rbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        rbtnHr.setBackground(new java.awt.Color(243, 246, 254));
        buttonGroup1.add(rbtnHr);
        rbtnHr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtnHr.setText("Company Hr");
        jPanel1.add(rbtnHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        rbtnStudent.setBackground(new java.awt.Color(243, 246, 254));
        buttonGroup1.add(rbtnStudent);
        rbtnStudent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtnStudent.setText("Student");
        jPanel1.add(rbtnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 440, 10));

        btnLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 130, -1));

        btnSignUp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 120, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 260, 120));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 210, -1, 190));

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null, "Please fill Entries Correctly", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            UsersPOJO user = new UsersPOJO();
            user.setPassword(password);
            user.setUserId(userId.toUpperCase().trim());
            System.out.println("userid : " + user.getUserId());
            String type = validateUser();
            if(type == null){
                JOptionPane.showMessageDialog(null, "Please Select User Type", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else{
                user.setType(type);
                System.out.println("type "+CurrentUser.getType());
            }
            // communication with the DAO
            try{
                if(UsersDAO.validateUser(user)){
                    
                    System.out.println(validateUser());
                    switch (CurrentUser.getType()) {
                        case "Admin":
                            JOptionPane.showMessageDialog(null, "Welcome Admin " + CurrentUser.getName(), "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                            new AdminOptionFrame().setVisible(true);
                            this.dispose();
                            break;
                        case "HR":
                            JOptionPane.showMessageDialog(null, "Welcome HR " + CurrentUser.getName(), "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                            new HrOptionsFrame().setVisible(true);
                            this.dispose();
                            break;
                        case "Student":
                            JOptionPane.showMessageDialog(null, "Welcome Student " + CurrentUser.getName(), "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                            new ParticipantOptionsFrame().setVisible(true);
                            this.dispose();
                            break;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid User Id or Password or User Type", "Error", JOptionPane.ERROR_MESSAGE);
//                    return;
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "We are facing Some Technical Issue", "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
//                return;
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        new ParticipantSignUpFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnHr;
    private javax.swing.JRadioButton rbtnStudent;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
