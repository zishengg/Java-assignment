/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment.pages;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddPayment extends javax.swing.JFrame {

    public AddPayment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameinput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roominput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateinput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amountinput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        statusinput = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        backadmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("APU Hostel Home Appliances Service Centre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ADD PAYMENT");

        nameinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameinputActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("Room (eg. A-L1-01):");

        roominput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roominputActionPerformed(evt);
            }
        });

        jLabel5.setText("Date (YYYY-MM-DD):");

        dateinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateinputActionPerformed(evt);
            }
        });

        jLabel6.setText("Amount:");

        amountinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountinputActionPerformed(evt);
            }
        });

        jLabel7.setText("Status (Pending/Paid):");

        statusinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusinputActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        backadmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backadmin.setText("EXIT");
        backadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backadminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(backadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(nameinput)
                    .addComponent(jLabel4)
                    .addComponent(roominput)
                    .addComponent(dateinput)
                    .addComponent(amountinput)
                    .addComponent(statusinput, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameinputActionPerformed

    }//GEN-LAST:event_nameinputActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
  String name = nameinput.getText().trim();
    String room = roominput.getText().trim();
    String date = dateinput.getText().trim();
    String amount = amountinput.getText().trim();
    String status = statusinput.getText().trim();
    String technician = ""; // Initialize technician name
    
    // Check if appointment exists in AdminAppointment.txt
    boolean appointmentExists = false;
    try (Scanner scanner = new Scanner(new File("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\AdminAppointment.txt"))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            // Check if the appointment matches the input
            if (parts[0].equals(name) && parts[1].equals(room) && parts[2].equals(date)) {
                appointmentExists = true;
                // Check if technician is in format "HH:MM" (e.g., "10:10")
                if (parts.length == 5 && parts[3].matches("\\d{2}:\\d{2}")) {
                    technician = parts[4]; // Store the technician name
                } else {
                    technician = parts[3];
                }
                break;
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    if (appointmentExists) {
        try (FileWriter fw = new FileWriter("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\payment.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            // Append payment details to payment.txt
            if (!Files.exists(Paths.get("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\payment.txt"))) {
                // Write the header if the file doesn't exist
                out.println("Name, Room, Date, Technician, Amount, Status");
            }
            out.println(name + "," + room + "," + date + "," + technician + "," + amount + "," + status);
            out.flush(); // Ensure the data is written immediately
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Remove the corresponding entry from AdminAppointment.txt
        try {
            File inputFile = new File("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\AdminAppointment.txt");
            File tempFile = new File("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = name + "," + room + "," + date;
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // Remove line if it matches the appointment details
                if (currentLine.startsWith(lineToRemove)) continue;
                writer.write(currentLine + "\n");
            }
            writer.close();
            reader.close();

            // Delete the original file
            if (!inputFile.delete()) {
                System.out.println("Failed to delete the original file");
            }

            // Rename the temporary file to AdminAppointment.txt
            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Failed to update AdminAppointment.txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Notify user of successful payment addition
        JOptionPane.showMessageDialog(this, "Payment added successfully!");
        AdminPayment backpage = null;
      try {
          backpage = new AdminPayment();
      } catch (IOException ex) {
          Logger.getLogger(AddPayment.class.getName()).log(Level.SEVERE, null, ex);
      }
        backpage.setVisible(true);
        dispose();
    } else {
        // Notify user of appointment not found
        JOptionPane.showMessageDialog(this, "Appointment doesn't exist!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_addActionPerformed

    private void roominputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roominputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roominputActionPerformed

    private void dateinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateinputActionPerformed

    private void amountinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountinputActionPerformed

    private void statusinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusinputActionPerformed

    private void backadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backadminActionPerformed
      AdminPayment backpage = null;
        try {
            backpage = new AdminPayment();
        } catch (IOException ex) {
            Logger.getLogger(AddPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
     backpage.setVisible(true);
     dispose();
    }//GEN-LAST:event_backadminActionPerformed

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
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField amountinput;
    private javax.swing.JButton backadmin;
    private javax.swing.JTextField dateinput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameinput;
    private javax.swing.JTextField roominput;
    private javax.swing.JTextField statusinput;
    // End of variables declaration//GEN-END:variables
}
