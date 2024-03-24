package javaassignment.pages;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminPage extends javax.swing.JFrame {

    private String adminUser;

    public AdminPage() {
        initComponents();
    }

    public AdminPage(String adminUser) {
        initComponents();
        this.adminUser = adminUser; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        payments = new javax.swing.JButton();
        appointments = new javax.swing.JButton();
        feedbacks = new javax.swing.JButton();
        registeruser = new javax.swing.JButton();
        registercustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("APU Hostel Home Appliances Service Centre ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Admin Page");

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        payments.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payments.setText("PAYMENTS");
        payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentsActionPerformed(evt);
            }
        });

        appointments.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        appointments.setText("APPOINTMENTS");
        appointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsActionPerformed(evt);
            }
        });

        feedbacks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        feedbacks.setText("FEEDBACKS");
        feedbacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbacksActionPerformed(evt);
            }
        });

        registeruser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registeruser.setText("REGISTER USER");
        registeruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeruserActionPerformed(evt);
            }
        });

        registercustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registercustomer.setText("REGISTER CUSTOMER");
        registercustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registercustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(payments, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(registeruser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(registercustomer)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payments, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registercustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registeruser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LoginPage loginPageWindow = new LoginPage();
        loginPageWindow.setLocationRelativeTo(null); 
        
        loginPageWindow.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void appointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsActionPerformed
     AdminAppointmentPage jumppage = null;
        try {
            jumppage = new AdminAppointmentPage(adminUser);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
     jumppage.setVisible(true);
       dispose();
    }//GEN-LAST:event_appointmentsActionPerformed

    private void paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentsActionPerformed
     AdminPayment pay = null;
    try {
        pay = new AdminPayment(adminUser);
    } catch (IOException ex) {
        Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
    }
    pay.setVisible(true);
    dispose();
    }//GEN-LAST:event_paymentsActionPerformed

    private void feedbacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbacksActionPerformed
     AdminFeedback feetpage = null;
        try {
            feetpage = new AdminFeedback(adminUser);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
     feetpage.setVisible(true);
     dispose();
    }//GEN-LAST:event_feedbacksActionPerformed

    private void registeruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeruserActionPerformed
    if (adminUser != null && adminUser.equals("admin1")) {
        RegisterUsers usersreg = new RegisterUsers(adminUser);
        usersreg.setVisible(true);
        dispose(); 
    } else {
        JOptionPane.showMessageDialog(this, "You do not have permission to access this functionality.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_registeruserActionPerformed

    private void registercustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registercustomerActionPerformed
        RegisterCustomers cusreg = new RegisterCustomers(adminUser);
        cusreg.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_registercustomerActionPerformed


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
        java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            if (args.length > 0) {
                String adminUser = args[0];
                new AdminPage(adminUser).setVisible(true);
            } else {
                System.err.println("No arguments provided. Please provide the admin username as an argument.");
            }
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointments;
    private javax.swing.JButton feedbacks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton payments;
    private javax.swing.JButton registercustomer;
    private javax.swing.JButton registeruser;
    // End of variables declaration//GEN-END:variables
}
