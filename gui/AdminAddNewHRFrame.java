package tnpapp.gui;

import java.sql.SQLException;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import tnpapp.dao.HrDAO;
import tnpapp.pojo.CurrentUser;
import tnpapp.pojo.HrPOJO;
import tnpapp.sendmail.SendMail;

public class AdminAddNewHRFrame extends javax.swing.JFrame {

    private String password;
    private String cpassword;
    
    public AdminAddNewHRFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblCurrentUser.setText(CurrentUser.getName());
        loadId();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCurrentUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAddNewHR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblHrId = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcProfession = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtCPassword = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 185, 63));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 76, 980, 163));

        lblCurrentUser.setFont(new java.awt.Font("Gabriola", 1, 34)); // NOI18N
        lblCurrentUser.setText("User");
        jPanel1.add(lblCurrentUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 257, 320, 33));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 34)); // NOI18N
        jLabel4.setText("Welcome,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 257, -1, 33));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 638, 1100, 10));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 140, 30));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 660, 140, 30));

        btnAddNewHR.setText("Add New HR");
        btnAddNewHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewHRActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 280, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addNewEmp.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 396, 195, 209));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 750, 10));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel5.setText("Company Name :-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, 24));

        lblHrId.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        lblHrId.setText("HR-101");
        jPanel1.add(lblHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 297, 68, 24));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 149, 10));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel7.setText("HR Id :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 297, -1, 24));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 210, 10));

        jLabel9.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 80, 21));

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel10.setText("Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 354, -1, 21));

        txtName.setBackground(new java.awt.Color(173, 192, 234));
        txtName.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 210, 20));

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel11.setText("Mobile No");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 110, 21));

        txtMobile.setBackground(new java.awt.Color(173, 192, 234));
        txtMobile.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        txtMobile.setBorder(null);
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 224, 20));

        txtPassword.setBackground(new java.awt.Color(173, 192, 234));
        txtPassword.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, 140, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 330, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 330, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 330, 40));

        jLabel15.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel15.setText("Profession in");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, -1, 21));

        txtMail.setBackground(new java.awt.Color(173, 192, 234));
        txtMail.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        txtMail.setBorder(null);
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 210, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 330, 40));

        jLabel17.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel17.setText("Email");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, 21));

        jcProfession.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jcProfession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Profession", "Developer", "Aptitude", "Digital Marketing" }));
        jPanel1.add(jcProfession, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 290, 30));

        jLabel18.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        jLabel18.setText("Confirm Password ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, -1, 21));

        txtCPassword.setBackground(new java.awt.Color(173, 192, 234));
        txtCPassword.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        txtCPassword.setBorder(null);
        jPanel1.add(txtCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 140, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 330, 40));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 20, 450));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, 240, 20));

        txtCompany.setBackground(new java.awt.Color(243, 246, 254));
        txtCompany.setFont(new java.awt.Font("Gabriola", 1, 20)); // NOI18N
        txtCompany.setBorder(null);
        jPanel1.add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadId(){
        try{
            int id = HrDAO.getNewHrId();
            lblHrId.setText("HR-" + id);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in Generating HR ID...", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private boolean validateInputs(){
        password = String.valueOf(txtPassword.getPassword());
        cpassword = String.valueOf(txtCPassword.getPassword());
        return !(txtName.getText().isEmpty() || txtMail.getText().isEmpty() || txtMobile.getText().isEmpty() || txtCompany.getText().isEmpty() || password.isEmpty() || cpassword.isEmpty());
    }
    
    private boolean matchPassword(){
//        System.out.println(password);
//        System.out.println(cpassword);
        return(password.equals(cpassword));
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private boolean validateProfession(){
        return !(jcProfession.getSelectedIndex() == 0);
    }
    
    private void clearAll(){
        txtCPassword.setText("");
        txtCompany.setText("");
        txtMail.setText("");
        txtMobile.setText("");
        txtName.setText("");
        txtPassword.setText("");
        jcProfession.setSelectedIndex(0);
    }
    
    private void sendMail(){
        String mailId = txtMail.getText().trim();
        String mailSubject = "Your Login Credentials From SCALIVE Training & Placement Application";
        String mailbody = "Hello " + CurrentUser.getName() + ",\nWarm Welcome in SCALIVE Training & Placement Application. \n"
                + "\n Your Login Credentials - \n\n" 
                + "HR Id : " + CurrentUser.getId() + "\n"
                + "Email : " + CurrentUser.getUserId() + "\n"
                + "Password : " + password + "\n"
                + "\n \n Warm Regards"
                + "\n SCALIVE "
                + "\nTraing And Placement Application";
        try{
            SendMail.sendMail(mailId, mailSubject, mailbody);
        }
        catch(MessagingException ex){
            JOptionPane.showMessageDialog(null, "Facing Some Technical Issue \nWhile Sending Your Result On Your Registered Email", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private void btnAddNewHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewHRActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null, "Please fill all the Fields Correctly", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!matchPassword()){
            JOptionPane.showMessageDialog(null, "Passwords do no match", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!validateProfession()){
            JOptionPane.showMessageDialog(null, "Please Select a Profession", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            HrPOJO hr = new HrPOJO();
            hr.setHrId(lblHrId.getText());
            hr.setCompanyName(txtCompany.getText().trim());
            hr.setHrName(txtName.getText().trim());
            hr.setPhone(txtMobile.getText().trim());
            hr.setProfession(jcProfession.getSelectedItem().toString());
            hr.setType("HR");
            hr.setPassword(password);
            hr.setUserId(txtMail.getText());
            
            int result = HrDAO.addNewHr(hr);
            
            switch (result) {
                case 1:
                    JOptionPane.showMessageDialog(null, "HR Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    sendMail();
                    clearAll();
                    loadId();
                    return;
                case -1:
                    JOptionPane.showMessageDialog(null, "Email Id Already Present", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Sorry Record not Added", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
        }
        catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "DB Error while Adding New HR", "Error", JOptionPane.INFORMATION_MESSAGE);
               ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddNewHRActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Successfully Logout...", "Logout", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAddNewHRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddNewHRFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewHR;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcProfession;
    private javax.swing.JLabel lblCurrentUser;
    private javax.swing.JLabel lblHrId;
    private javax.swing.JPasswordField txtCPassword;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
