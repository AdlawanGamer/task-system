/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminPage;

import TaskManagement.LoginPage;
import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;

/**
 *
 * @author QUBIN
 */
public class AdminDashboard extends javax.swing.JFrame {

    /** Creates new form UserDashboard */
    public AdminDashboard() {
        initComponents();
    }

    //display username and role
    public void displayUser_Role(){
        Session session = Session.getInstance();
        jUserName.setText("" + session.getFullname());
        jUserRole.setText("" + session.getPosition());
    }
    
    //get number of finished task
    public int numberOfFinishedTask() {
        int taskCount = 0;
        dbConnector dbc = new dbConnector();
        try {
            String query = "SELECT COUNT(*) AS t_count FROM task WHERE t_status = 'FINISHED' AND t_archive = 'NO'";
            ResultSet resultset = dbc.getData(query);
            if (resultset.next()) {
                taskCount = resultset.getInt("t_count");
                resultset.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error fetching task count: " + ex.getMessage());
        }
        return taskCount;
    }
    
    //get number of pending task
    public int numberOfPendingTask() {
        int taskCount = 0;
        dbConnector dbc = new dbConnector();
        try {
            String query = "SELECT COUNT(*) AS t_count FROM task WHERE t_status = 'PENDING' AND t_archive = 'NO'";
            ResultSet resultset = dbc.getData(query);
            if (resultset.next()) {
                taskCount = resultset.getInt("t_count");
                resultset.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error fetching task count: " + ex.getMessage());
        }
        return taskCount;
    }
    //get number of on-going task
    public int numberOfOnGoingTask() {
        int taskCount = 0;
        dbConnector dbc = new dbConnector();
        try {
            String query = "SELECT COUNT(*) AS t_count FROM task WHERE t_status = 'ON-GOING' AND t_archive = 'NO'";
            ResultSet resultset = dbc.getData(query);
            if (resultset.next()) {
                taskCount = resultset.getInt("t_count");
                resultset.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error fetching task count: " + ex.getMessage());
        }
        return taskCount;
    }
    //get number of employee
    public int numberOfEmployee() {
        int employeeCount = 0;
        dbConnector dbc = new dbConnector();
        try {
            String query = "SELECT COUNT(*) AS u_count FROM employee";
            ResultSet resultset = dbc.getData(query);
            if (resultset.next()) {
                employeeCount = resultset.getInt("u_count");
                resultset.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error fetching employee count: " + ex.getMessage());
        }
        return employeeCount;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jHomeButton2 = new javax.swing.JButton();
        jHomeButton = new javax.swing.JButton();
        jHomeButton4 = new javax.swing.JButton();
        jLogoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jFinished = new javax.swing.JLabel();
        jUserName = new javax.swing.JLabel();
        jUserRole = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jOngoing = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPending = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jEmployeeNumber = new javax.swing.JLabel();
        jLogoutButton1 = new javax.swing.JButton();
        jLogoutButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Admin.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 60, 80, 80);

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

        jLogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLogoutButton.setForeground(new java.awt.Color(255, 0, 0));
        jLogoutButton.setText("LOGOUT");
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jLogoutButton);
        jLogoutButton.setBounds(17, 267, 130, 25);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("FINISHED TASK");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 50, 110, 20);

        jFinished.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jFinished.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jFinished);
        jFinished.setBounds(0, 0, 200, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(500, 320, 200, 80);

        jUserName.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jUserName.setText("ADMIN NAME");
        jPanel1.add(jUserName);
        jUserName.setBounds(140, 80, 270, 16);

        jUserRole.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jUserRole.setText("ADMIN ROLE");
        jPanel1.add(jUserRole);
        jUserRole.setBounds(140, 100, 270, 16);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ON-GOING TASK");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 50, 120, 20);

        jOngoing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jOngoing.setForeground(new java.awt.Color(0, 102, 255));
        jPanel3.add(jOngoing);
        jOngoing.setBounds(0, 0, 200, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(500, 190, 200, 80);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PENDING TASK");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(50, 50, 110, 20);

        jPending.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPending.setForeground(new java.awt.Color(0, 102, 255));
        jPanel4.add(jPending);
        jPending.setBounds(0, 0, 200, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(240, 320, 200, 80);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("NUMBER OF EMPLOYEE");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(20, 50, 160, 20);

        jEmployeeNumber.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jEmployeeNumber.setForeground(new java.awt.Color(0, 102, 255));
        jPanel5.add(jEmployeeNumber);
        jEmployeeNumber.setBounds(0, 0, 200, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(240, 190, 200, 80);

        jLogoutButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLogoutButton1.setText("EMPLOYEE");
        jLogoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jLogoutButton1);
        jLogoutButton1.setBounds(17, 243, 130, 25);

        jLogoutButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLogoutButton2.setText("ARCHIVE TASK");
        jLogoutButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jLogoutButton2);
        jLogoutButton2.setBounds(17, 219, 130, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

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

    private void jHomeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButton2ActionPerformed
        AccountProfile ap = new AccountProfile();
        ap.setVisible(true);
        ap.pack();
        ap.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButton2ActionPerformed

    private void jHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButtonActionPerformed
        AdminDashboard UB = new AdminDashboard();
        UB.setVisible(true);
        UB.pack();
        UB.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButtonActionPerformed

    private void jHomeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButton4ActionPerformed
        ViewAllTaskPage UT = new ViewAllTaskPage();
        UT.setVisible(true);
        UT.pack();
        UT.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButton4ActionPerformed

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        LoginPage LoginFrame = new LoginPage();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        displayUser_Role();
        jPending.setHorizontalAlignment(SwingConstants.CENTER);
        jPending.setText("" + numberOfPendingTask());
        jOngoing.setHorizontalAlignment(SwingConstants.CENTER);
        jOngoing.setText("" + numberOfOnGoingTask());
        jFinished.setHorizontalAlignment(SwingConstants.CENTER);
        jFinished.setText("" + numberOfFinishedTask());
        jEmployeeNumber.setHorizontalAlignment(SwingConstants.CENTER);
        jEmployeeNumber.setText("" + numberOfEmployee());
    }//GEN-LAST:event_formWindowActivated

    private void jLogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButton1ActionPerformed
        ListOfEmployee LE = new ListOfEmployee();
        LE.setVisible(true);
        LE.pack();
        LE.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLogoutButton1ActionPerformed

    private void jLogoutButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButton2ActionPerformed
        ArchiveTask AT = new ArchiveTask();
        AT.setVisible(true);
        AT.pack();
        AT.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLogoutButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jEmployeeNumber;
    private javax.swing.JLabel jFinished;
    private javax.swing.JButton jHomeButton;
    private javax.swing.JButton jHomeButton2;
    private javax.swing.JButton jHomeButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JButton jLogoutButton1;
    private javax.swing.JButton jLogoutButton2;
    private javax.swing.JLabel jOngoing;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jPending;
    private javax.swing.JLabel jUserName;
    private javax.swing.JLabel jUserRole;
    // End of variables declaration//GEN-END:variables

}
