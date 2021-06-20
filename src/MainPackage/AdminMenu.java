
package MainPackage;

import lecturerPackage.RegisterNewLecturer;
import EncryptionPackage.SymmtCrypto;
import javax.swing.JOptionPane;
import studentPackage.RegisterNewStudent;


public class AdminMenu extends javax.swing.JFrame {
    static SymmtCrypto Encrypt = new SymmtCrypto();
    
    
    public AdminMenu() {
        initComponents();
        setLocationRelativeTo(null);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        viewstudent = new javax.swing.JButton();
        addnewstudent = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        viewblockchain = new javax.swing.JButton();
        addnewlecturer = new javax.swing.JButton();
        viewlecturer = new javax.swing.JButton();
        viewprofile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(102, 204, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Admin Menu");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        viewstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewstudent.setText("View student records");
        viewstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstudentActionPerformed(evt);
            }
        });

        addnewstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addnewstudent.setText("Add new student");
        addnewstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewstudentActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exit.setText("Back");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        viewblockchain.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewblockchain.setText("View blockchain records");
        viewblockchain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewblockchainActionPerformed(evt);
            }
        });

        addnewlecturer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addnewlecturer.setText("Add new lecturer");
        addnewlecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewlecturerActionPerformed(evt);
            }
        });

        viewlecturer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewlecturer.setText("View lecturer records");
        viewlecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlecturerActionPerformed(evt);
            }
        });

        viewprofile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewprofile.setText("View profile");
        viewprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewprofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addnewstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addnewlecturer, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(viewprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewlecturer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewblockchain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(viewstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(147, 147, 147))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnewstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnewlecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewlecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewblockchain, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstudentActionPerformed
        // display student record
        setVisible(false);
        DisplayStudentRecords dis = new DisplayStudentRecords();
        dis.setLocationRelativeTo(null);
        dis.setVisible(true);
    }//GEN-LAST:event_viewstudentActionPerformed

    private void addnewstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewstudentActionPerformed
        // add new student

        setVisible(false);
        RegisterNewStudent record = new RegisterNewStudent();
        record.setLocationRelativeTo(null);
        record.setVisible(true);
    }//GEN-LAST:event_addnewstudentActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // to exit
        setVisible(false);
        JOptionPane.showMessageDialog(null,"Successfully Log out\nClick OK to continue","Exit",JOptionPane.INFORMATION_MESSAGE);
        LoginMenu l = new LoginMenu();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
        
    }//GEN-LAST:event_exitActionPerformed

    private void viewblockchainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewblockchainActionPerformed
        // TODO display marks list of all students:
        //setVisible(false);
        ViewBlockRecords gm = new ViewBlockRecords();
        gm.setVisible(true);
    }//GEN-LAST:event_viewblockchainActionPerformed

    private void viewlecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlecturerActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        DisplayLecturerRecords dis = new DisplayLecturerRecords();
        dis.setLocationRelativeTo(null);
        dis.setVisible(true);
    }//GEN-LAST:event_viewlecturerActionPerformed

    private void viewprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewprofileActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminProfile dis = new AdminProfile();
        dis.setLocationRelativeTo(null);
        dis.setVisible(true);
        
    }//GEN-LAST:event_viewprofileActionPerformed

    private void addnewlecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewlecturerActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        RegisterNewLecturer record = new RegisterNewLecturer();
        record.setLocationRelativeTo(null);
        record.setVisible(true);
        
    }//GEN-LAST:event_addnewlecturerActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewlecturer;
    private javax.swing.JButton addnewstudent;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JButton viewblockchain;
    private javax.swing.JButton viewlecturer;
    private javax.swing.JButton viewprofile;
    private javax.swing.JButton viewstudent;
    // End of variables declaration//GEN-END:variables
}
