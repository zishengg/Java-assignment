
package javaassignment.pages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BookAppointment extends javax.swing.JFrame {

    public BookAppointment() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        roominput = new javax.swing.JTextField();
        nameinput = new javax.swing.JTextField();
        dateinput = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        timeinput = new javax.swing.JTextField();
        techinput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tpnumberinput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("APU Hostel Home Appliances Service Centre ");

        roominput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roominputActionPerformed(evt);
            }
        });

        nameinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameinputActionPerformed(evt);
            }
        });

        dateinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateinputActionPerformed(evt);
            }
        });

        book.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        book.setText("BOOK");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        timeinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeinputActionPerformed(evt);
            }
        });

        techinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                techinputActionPerformed(evt);
            }
        });

        jLabel8.setText("Write your name:");

        jLabel9.setText("Block,Level,Room number (X-LX-XX):");

        jLabel10.setText("Date (YYYY-MM-DD):");

        jLabel11.setText("Time (10:00-19:00):");

        jLabel12.setText("Technician Name:");

        jLabel2.setText("TP Number(TPXXXXXX):");

        tpnumberinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpnumberinputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("BOOK APPOINTMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(techinput, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(roominput, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(nameinput, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(dateinput, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(timeinput, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(tpnumberinput))
                        .addGap(30, 30, 30)))
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpnumberinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(techinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
     AdminAppointmentPage backpage = null;
        try {
            backpage = new AdminAppointmentPage();
        } catch (IOException ex) {
            Logger.getLogger(BookAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
     backpage.setVisible(true);
     dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
   String name = nameinput.getText().trim();
    String room = roominput.getText().trim();
    String tpNumber = tpnumberinput.getText().trim();
    String date = dateinput.getText().trim();
    String time = timeinput.getText().trim();
    String technician = techinput.getText().trim();

    // Check if the customer is registered
    if (!isCustomerRegistered(name, tpNumber, room)) {
        JOptionPane.showMessageDialog(this, "Customer is not registered.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the technician exists
    if (!isTechnicianExists(technician)) {
        JOptionPane.showMessageDialog(this, "Technician does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check for appointment conflicts
    if (isAppointmentConflict(room, date, time)) {
        JOptionPane.showMessageDialog(this, "Appointment conflict. Please choose a different time or room.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Add the new appointment
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\AdminAppointment.txt", true))) {
        // Write the new appointment
        bufferedWriter.write(name + "," + room + "," + date + "," + time + "," + technician);
        // Append a newline character
        bufferedWriter.newLine();
        JOptionPane.showMessageDialog(this, "Appointment booked successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        AdminAppointmentPage goback = new AdminAppointmentPage();
        goback.setVisible(true);
        dispose();
    } catch (IOException e) {
        e.printStackTrace();
    }
}                                    

private boolean isCustomerRegistered(String name, String tpNumber, String room) {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\customers.txt"))) {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 3) {
                String customerName = parts[0];
                String customerTpNumber = parts[1];
                String customerRoom = parts[2];
                if (customerName.equals(name) && customerTpNumber.equals(tpNumber) && customerRoom.equals(room)) {
                    return true;
                }
            } else {
                // Log or display a message indicating malformed customer information
                System.err.println("Malformed customer information: " + line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}

private boolean isTechnicianExists(String technician) {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\users.txt"))) {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 4) {
                String userType = parts[2];
                String technicianName = parts[3];
                if (technicianName.equals(technician) && userType.equals("technician")) {
                    return true;
                }
            } else {
                // Log or display a message indicating malformed user information
                System.err.println("Malformed user information: " + line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}

private boolean isAppointmentConflict(String room, String date, String time) {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\AdminAppointment.txt"))) {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 4) {
                String existingRoom = parts[1];
                String existingDate = parts[2];
                String existingTime = parts[3];
                if (existingRoom.equals(room) && existingDate.equals(date) && existingTime.equals(time)) {
                    return true;
                }
            } else {
                // Log or display a message indicating malformed appointment information
                System.err.println("Malformed appointment information: " + line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
    }//GEN-LAST:event_bookActionPerformed

    private void nameinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameinputActionPerformed

    private void roominputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roominputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roominputActionPerformed

    private void dateinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateinputActionPerformed
        
    }//GEN-LAST:event_dateinputActionPerformed

    private void timeinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeinputActionPerformed

    }//GEN-LAST:event_timeinputActionPerformed

    private void techinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_techinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_techinputActionPerformed

    private void tpnumberinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpnumberinputActionPerformed
     
    }//GEN-LAST:event_tpnumberinputActionPerformed

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
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JTextField dateinput;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameinput;
    private javax.swing.JTextField roominput;
    private javax.swing.JTextField techinput;
    private javax.swing.JTextField timeinput;
    private javax.swing.JTextField tpnumberinput;
    // End of variables declaration//GEN-END:variables
}
