
package javaassignment.pages;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddFeedback extends javax.swing.JFrame {

    /**
     * Creates new form AddFeedback
     */
    public AddFeedback() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameinput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        roominput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackinput = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateinput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        nameinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameinputActionPerformed(evt);
            }
        });

        jLabel2.setText("Room:");

        jLabel3.setText("Feedback:");

        feedbackinput.setColumns(20);
        feedbackinput.setRows(5);
        jScrollPane1.setViewportView(feedbackinput);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("APU Hostel Home Appliances Service Centre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ADD FEEDBACK");

        exitbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel6.setText("Date:");

        dateinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateinputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(nameinput)
                            .addComponent(roominput, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(dateinput))
                        .addGap(195, 195, 195))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameinputActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
      AdminFeedback backpage = null;
        try {
            backpage = new AdminFeedback();
        } catch (IOException ex) {
            Logger.getLogger(AddFeedback.class.getName()).log(Level.SEVERE, null, ex);
        }
     backpage.setVisible(true);
     dispose();
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
   String name = nameinput.getText().trim();
    String room = roominput.getText().trim();
    String feedback = feedbackinput.getText().trim();
    String date = dateinput.getText().trim(); // Get the entered date

    // Check if any of the fields are empty
    if (name.isEmpty() || room.isEmpty() || feedback.isEmpty() || date.isEmpty()) {
        // Display an error message if any field is empty
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Read payment.txt to find the user and check payment status
    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\payment.txt"))) {
        String line;
        boolean userFound = false;
        String paymentStatus = "";
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 6 && parts[0].trim().equals(name) && parts[1].trim().equals(room) && parts[2].trim().equals(date)) {
                userFound = true;
                paymentStatus = parts[5].trim(); // Get payment status

                // Check if the status is "Paid"
                if (paymentStatus.equalsIgnoreCase("Paid")) {
                    // Check if the same feedback exists
                    boolean feedbackExists = false;
                    try (BufferedReader feedbackReader = new BufferedReader(new FileReader("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\feedback.txt"))) {
                        String feedbackLine;
                        while ((feedbackLine = feedbackReader.readLine()) != null) {
                            String[] feedbackParts = feedbackLine.split(",");
                            if (feedbackParts.length >= 3 && feedbackParts[0].trim().equals(name) && feedbackParts[1].trim().equals(room) && feedbackParts[2].trim().equals(date)) {
                                feedbackExists = true;
                                break;
                            }
                        }
                    } catch (IOException ex) {
                        // Handle file reading error
                        ex.printStackTrace();
                    }

                    if (feedbackExists) {
                        // Feedback already exists for the same name, room, and date
                        JOptionPane.showMessageDialog(this, "Feedback already given for the same name, room, and date.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // User found, date matches, and payment status is paid, add feedback
                    try (PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\sheng\\Desktop\\APU\\SEM 5\\JP\\JavaAssignment\\src\\javaassignment\\feedback.txt", true))) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        String currentDate = sdf.format(new Date());
                        pw.println(name + "," + room + "," + currentDate + "," + feedback);
                        
                        // Successfully added feedback, display confirmation message
                        JOptionPane.showMessageDialog(this, "Successfully added feedback.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Return to AdminFeedback page
                        AdminFeedback backpage = new AdminFeedback();
                        backpage.setVisible(true);
                        dispose();
                    } catch (IOException ex) {
                        // Handle file writing error
                        ex.printStackTrace();
                    }
                } else {
                    // Payment status is not "Paid"
                    JOptionPane.showMessageDialog(this, "User payment is pending", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Return from the method to stop further execution
                }
                break;
            }
        }

        if (!userFound) {
            // User not found in payment records for the entered date
            // Display an error message
            JOptionPane.showMessageDialog(this, "User not found in payment records for the entered date.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException ex) {
        // Handle file reading error
        ex.printStackTrace();
    }
    }//GEN-LAST:event_addActionPerformed

    private void dateinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateinputActionPerformed
       
    }//GEN-LAST:event_dateinputActionPerformed

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
            java.util.logging.Logger.getLogger(AddFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField dateinput;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextArea feedbackinput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameinput;
    private javax.swing.JTextField roominput;
    // End of variables declaration//GEN-END:variables
}
