/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPage;


import TaskManagement.*;
import config.Session;


/**
 *
 * @author QUBIN
 */
public class UserAccountProfile extends javax.swing.JFrame {

    /**
     * Creates new form DashboardPage
     */
    public UserAccountProfile() {
        initComponents();
        displayUser_Role();
    }

    //display user profile data
    public void displayUser_Role(){
        Session session = Session.getInstance();
        jFullName.setText("" + session.getFullname());
        jID.setText("" + session.getId());
        jContactNumber.setText("" + session.getContactNumber());
        jBirthdate.setText("" + session.getBirthdate());
        jGender.setText("" + session.getGender());
        jAddress.setText("" + session.getAddress());
        jPosition.setText("" + session.getPosition());
        jUsername.setText("" + session.getUsername());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jAdminRole = new javax.swing.JLabel();
        jHomeButton = new javax.swing.JButton();
        jLogoutButton = new javax.swing.JButton();
        jAdminName = new javax.swing.JLabel();
        jHomeButton1 = new javax.swing.JButton();
        jUsername = new javax.swing.JLabel();
        jAdminRole3 = new javax.swing.JLabel();
        jAdminRole4 = new javax.swing.JLabel();
        jAdminRole5 = new javax.swing.JLabel();
        jAdminRole6 = new javax.swing.JLabel();
        jAdminRole7 = new javax.swing.JLabel();
        jAdminRole8 = new javax.swing.JLabel();
        jAdminRole9 = new javax.swing.JLabel();
        jFullName = new javax.swing.JLabel();
        jID = new javax.swing.JLabel();
        jContactNumber = new javax.swing.JLabel();
        jBirthdate = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jAddress = new javax.swing.JLabel();
        jPosition = new javax.swing.JLabel();
        jHomeButton2 = new javax.swing.JButton();
        jHomeButton3 = new javax.swing.JButton();
        jHomeButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCOUNT PROFILE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Admin.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 60, 80, 80);

        jAdminRole.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole.setText("USERNAME:");
        jPanel1.add(jAdminRole);
        jAdminRole.setBounds(230, 370, 100, 16);

        jHomeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jHomeButton.setText("HOME");
        jHomeButton.setFocusPainted(false);
        jHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jHomeButton);
        jHomeButton.setBounds(17, 173, 130, 24);

        jLogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLogoutButton.setForeground(new java.awt.Color(255, 0, 0));
        jLogoutButton.setText("LOGOUT");
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jLogoutButton);
        jLogoutButton.setBounds(17, 219, 130, 25);

        jAdminName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jAdminName.setText("PROFILE INFORMATION");
        jPanel1.add(jAdminName);
        jAdminName.setBounds(230, 100, 280, 30);

        jHomeButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jHomeButton1.setText("CHANGE PASSWORD");
        jHomeButton1.setFocusPainted(false);
        jHomeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jHomeButton1);
        jHomeButton1.setBounds(440, 444, 190, 30);

        jUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jUsername.setText("USERNAME");
        jPanel1.add(jUsername);
        jUsername.setBounds(390, 370, 260, 16);

        jAdminRole3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole3.setText("ID NUMBER:");
        jPanel1.add(jAdminRole3);
        jAdminRole3.setBounds(230, 190, 100, 16);

        jAdminRole4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole4.setText("CONTACT NUMBER:");
        jPanel1.add(jAdminRole4);
        jAdminRole4.setBounds(230, 220, 150, 16);

        jAdminRole5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole5.setText("BIRTHDATE:");
        jPanel1.add(jAdminRole5);
        jAdminRole5.setBounds(230, 250, 90, 16);

        jAdminRole6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole6.setText("GENDER:");
        jPanel1.add(jAdminRole6);
        jAdminRole6.setBounds(230, 280, 70, 16);

        jAdminRole7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole7.setText("ADDRESS:");
        jPanel1.add(jAdminRole7);
        jAdminRole7.setBounds(230, 310, 90, 16);

        jAdminRole8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole8.setText("POSITION:");
        jPanel1.add(jAdminRole8);
        jAdminRole8.setBounds(230, 340, 90, 16);

        jAdminRole9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jAdminRole9.setText("NAME:");
        jPanel1.add(jAdminRole9);
        jAdminRole9.setBounds(230, 160, 60, 16);

        jFullName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jFullName.setText("FULLNAME");
        jPanel1.add(jFullName);
        jFullName.setBounds(390, 160, 230, 16);

        jID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jID.setText("ID NUMBER");
        jPanel1.add(jID);
        jID.setBounds(390, 190, 250, 16);

        jContactNumber.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jContactNumber.setText("CONTACT NUMBER");
        jPanel1.add(jContactNumber);
        jContactNumber.setBounds(390, 220, 250, 16);

        jBirthdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBirthdate.setText("BIRTHDATE");
        jPanel1.add(jBirthdate);
        jBirthdate.setBounds(390, 250, 180, 16);

        jGender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jGender.setText("GENDER");
        jPanel1.add(jGender);
        jGender.setBounds(390, 280, 210, 16);

        jAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jAddress.setText("ADDRESS");
        jPanel1.add(jAddress);
        jAddress.setBounds(390, 310, 240, 16);

        jPosition.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jPosition.setText("POSITION");
        jPanel1.add(jPosition);
        jPosition.setBounds(390, 340, 240, 16);

        jHomeButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jHomeButton2.setText("PROFILE");
        jHomeButton2.setFocusPainted(false);
        jHomeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jHomeButton2);
        jHomeButton2.setBounds(17, 150, 130, 24);

        jHomeButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jHomeButton3.setText("UPDATE PROFILE");
        jHomeButton3.setFocusPainted(false);
        jHomeButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jHomeButton3);
        jHomeButton3.setBounds(230, 444, 190, 30);

        jHomeButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jHomeButton4.setText("TASK");
        jHomeButton4.setFocusPainted(false);
        jHomeButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jHomeButton4);
        jHomeButton4.setBounds(17, 196, 130, 24);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButtonActionPerformed
        UserDashboard UB = new UserDashboard();
        UB.setVisible(true);
        UB.pack();
        UB.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButtonActionPerformed

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        LoginPage LoginFrame = new LoginPage();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    private void jHomeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButton1ActionPerformed
        UserChangePassword cp = new UserChangePassword();
        cp.setVisible(true);
        cp.pack();
        cp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButton1ActionPerformed

    private void jHomeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButton2ActionPerformed
        UserAccountProfile ap = new UserAccountProfile();
        ap.setVisible(true);
        ap.pack();
        ap.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButton2ActionPerformed

    private void jHomeButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButton3ActionPerformed
        UserUpdateProfile up = new UserUpdateProfile();
        up.setVisible(true);
        up.pack();
        up.setLocationRelativeTo(null);
        up.setDetails();
        this.dispose();
    }//GEN-LAST:event_jHomeButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        displayUser_Role();
    }//GEN-LAST:event_formWindowActivated

    private void jHomeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButton4ActionPerformed
        UserTaskTable UT = new UserTaskTable();
        UT.setVisible(true);
        UT.pack();
        UT.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UserAccountProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAccountProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAccountProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAccountProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAddress;
    private javax.swing.JLabel jAdminName;
    private javax.swing.JLabel jAdminRole;
    private javax.swing.JLabel jAdminRole3;
    private javax.swing.JLabel jAdminRole4;
    private javax.swing.JLabel jAdminRole5;
    private javax.swing.JLabel jAdminRole6;
    private javax.swing.JLabel jAdminRole7;
    private javax.swing.JLabel jAdminRole8;
    private javax.swing.JLabel jAdminRole9;
    private javax.swing.JLabel jBirthdate;
    private javax.swing.JLabel jContactNumber;
    private javax.swing.JLabel jFullName;
    private javax.swing.JLabel jGender;
    private javax.swing.JButton jHomeButton;
    private javax.swing.JButton jHomeButton1;
    private javax.swing.JButton jHomeButton2;
    private javax.swing.JButton jHomeButton3;
    private javax.swing.JButton jHomeButton4;
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPosition;
    private javax.swing.JLabel jUsername;
    // End of variables declaration//GEN-END:variables
}
