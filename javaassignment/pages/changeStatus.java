/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment.pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;

public class changeStatus extends javax.swing.JFrame {

    public changeStatus() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameinput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateinput = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        roominput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("APU Hostel Home Appliances Service Centre ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CHANGE STATUS");

        nameinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameinputActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel5.setText("Date (YYYY-MM-DD):");

        dateinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateinputActionPerformed(evt);
            }
        });

        confirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel4.setText("Room:");

        roominput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roominputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(nameinput)
                            .addComponent(dateinput, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(roominput))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(roominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
   String name = nameinput.getText().trim();
        String room = roominput.getText().trim();
        String date = dateinput.getText().trim();
        boolean matchFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\payment.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            boolean paymentUpdated = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String recordName = parts[0].trim();
                String recordDate = parts[2].trim();
                String recordRoom = parts[1].trim();
                String status = parts[5].trim();

                System.out.println("Input: Name=" + name + ", Room=" + room + ", Date=" + date);
                System.out.println("Parts: Name=" + recordName + ", Room=" + recordRoom + ", Date=" + recordDate + ", Status=" + status);

                if (recordName.equalsIgnoreCase(name) && recordDate.equals(date) && recordRoom.equalsIgnoreCase(room)) {
                    matchFound = true;
                    if (status.equals("Pending")) {
                        parts[5] = "Paid";
                        paymentUpdated = true;
                        JOptionPane.showMessageDialog(this, "Payment status updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Payment is already Paid.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                sb.append(String.join(",", parts)).append("\n");
            }

            if (!matchFound) {
                JOptionPane.showMessageDialog(this, "Wrong details entered.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (paymentUpdated) {
                try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\payment.txt"))) {
                    writer.write(sb.toString());
                }
                AdminPayment backpage = new AdminPayment();
                backpage.setVisible(true);
                dispose();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while updating payment status.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmActionPerformed

    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    AdminPayment backpage = null;
        try {
            backpage = new AdminPayment();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(changeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        backpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void nameinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameinputActionPerformed
      
    }//GEN-LAST:event_nameinputActionPerformed

    private void dateinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateinputActionPerformed
       
    }//GEN-LAST:event_dateinputActionPerformed

    private void roominputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roominputActionPerformed
       
    }//GEN-LAST:event_roominputActionPerformed

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
            java.util.logging.Logger.getLogger(changeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JTextField dateinput;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameinput;
    private javax.swing.JTextField roominput;
    // End of variables declaration//GEN-END:variables
}
