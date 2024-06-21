

package UserPage;

import TaskManagement.LoginPage;
import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class UpdateUserTask extends javax.swing.JFrame {

    /** Creates new form UserDashboard */
    public UpdateUserTask() {
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
        Session session = Session.getInstance();
        int id = session.getId();
        int studentCount = 0;
        dbConnector dbc = new dbConnector();
        try {
            String query = "SELECT COUNT(*) AS t_count FROM task WHERE t_status = 'FINISHED' AND u_id = '"+id+"'";
            ResultSet resultset = dbc.getData(query);
            if (resultset.next()) {
                studentCount = resultset.getInt("t_count");
                resultset.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error fetching task count: " + ex.getMessage());
        }
        return studentCount;
    }
    
    //get number of pending task
    public int numberOfPendingTask() {
        Session session = Session.getInstance();
        int id = session.getId();
        int studentCount = 0;
        dbConnector dbc = new dbConnector();
        try {
            String query = "SELECT COUNT(*) AS t_count FROM task WHERE t_status = 'PENDING' AND u_id = '"+id+"'";
            ResultSet resultset = dbc.getData(query);
            if (resultset.next()) {
                studentCount = resultset.getInt("t_count");
                resultset.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error fetching task count: " + ex.getMessage());
        }
        return studentCount;
    }
    //get number of on-going task
    public int numberOfOnGoingTask() {
        Session session = Session.getInstance();
        int id = session.getId();
        int studentCount = 0;
        dbConnector dbc = new dbConnector();
        try {
            String query = "SELECT COUNT(*) AS t_count FROM task WHERE t_status = 'ON-GOING' AND u_id = '"+id+"'";
            ResultSet resultset = dbc.getData(query);
            if (resultset.next()) {
                studentCount = resultset.getInt("t_count");
                resultset.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error fetching task count: " + ex.getMessage());
        }
        return studentCount;
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
        jUserName = new javax.swing.JLabel();
        jUserRole = new javax.swing.JLabel();
        jDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
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
        jLogoutButton.setBounds(17, 219, 130, 25);

        jUserName.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jUserName.setText("USER NAME");
        jPanel1.add(jUserName);
        jUserName.setBounds(140, 80, 270, 16);

        jUserRole.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jUserRole.setText("USER ROLE");
        jPanel1.add(jUserRole);
        jUserRole.setBounds(140, 100, 270, 16);

        jDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jDescription);
        jDescription.setBounds(210, 290, 510, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Task Description");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 320, 130, 20);

        jID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jID);
        jID.setBounds(210, 210, 200, 30);

        jStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ON-GOING", "FINISHED" }));
        jPanel1.add(jStatus);
        jStatus.setBounds(470, 210, 250, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Task ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 240, 70, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Status");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 240, 70, 20);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.setPreferredSize(new java.awt.Dimension(73, 26));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 410, 150, 26);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setText("CANCEL");
        jButton2.setPreferredSize(new java.awt.Dimension(73, 26));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 410, 150, 26);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Update Task");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 170, 330, 22);

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
        UserAccountProfile ap = new UserAccountProfile();
        ap.setVisible(true);
        ap.pack();
        ap.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButton2ActionPerformed

    private void jHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButtonActionPerformed
        UpdateUserTask UB = new UpdateUserTask();
        UB.setVisible(true);
        UB.pack();
        UB.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jHomeButtonActionPerformed

    private void jHomeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButton4ActionPerformed
        UserTaskTable UT = new UserTaskTable();
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
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id = Integer.valueOf(jID.getText());
        String status = (String)jStatus.getSelectedItem();
        System.out.println(""+status + id);
        //inserting data to database
        dbConnector dbc = new dbConnector();
        String query = "UPDATE task SET "
                + "t_status = '"+status+"' "
                + "WHERE t_id = '"+id+"'";
        if(dbc.insertData(query)){
            JOptionPane.showMessageDialog(null, "Task updated Successfully");
            UserTaskTable UT = new UserTaskTable();
            UT.setVisible(true);
            UT.pack();
            UT.setLocationRelativeTo(null);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UserTaskTable UT = new UserTaskTable();
        UT.setVisible(true);
        UT.pack();
        UT.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUserTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUserTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUserTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUserTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUserTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JTextField jDescription;
    private javax.swing.JButton jHomeButton;
    private javax.swing.JButton jHomeButton2;
    private javax.swing.JButton jHomeButton4;
    public javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> jStatus;
    private javax.swing.JLabel jUserName;
    private javax.swing.JLabel jUserRole;
    // End of variables declaration//GEN-END:variables

}
