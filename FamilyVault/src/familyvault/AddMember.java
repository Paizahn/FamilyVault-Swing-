/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package familyvault;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Jay
 */
public class AddMember extends javax.swing.JFrame {
    PreparedStatement p;
    ResultSet r=null;
    Connection con;
    
    // Initialize MEM_ID variable
    // Default value if no records exist in the table
    int MEMID = 1;
    int TOTALID;
    
    
    /**
     * Creates new form NewJFrame
     */
    public AddMember() {
        con=connect.Connect();
        initComponents();
        setLocationRelativeTo(null);
        jTITLE.setText(LogIn.inputFNAME.toUpperCase() +" FAMILY");
        bADD.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTITLE = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tFN = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tMN = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tLN = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tNICKN = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tROLE = new javax.swing.JTextField();
        bADD = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tMONTH = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tDAY = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tYEAR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 255, 255));
        setPreferredSize(new java.awt.Dimension(360, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(360, 640));

        jPanel2.setBackground(new java.awt.Color(219, 48, 82));

        jTITLE.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jTITLE.setForeground(new java.awt.Color(241, 214, 171));
        jTITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTITLE.setText("FAMILY VAULT");
        jTITLE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTITLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jLabel2.setText("First Name");

        tFN.setBackground(new java.awt.Color(241, 231, 222));
        tFN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tFN)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFN)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel6.setText("Middle Name");

        tMN.setBackground(new java.awt.Color(241, 231, 222));
        tMN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tMN)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tMN)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel7.setText("Last Name");

        tLN.setBackground(new java.awt.Color(241, 231, 222));
        tLN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tLN)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tLN)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jLabel8.setText("Nickname");

        tNICKN.setBackground(new java.awt.Color(241, 231, 222));
        tNICKN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tNICKN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNICKNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tNICKN)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNICKN)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jLabel9.setText("Role in the Family");

        tROLE.setBackground(new java.awt.Color(241, 231, 222));
        tROLE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tROLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tROLEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tROLE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tROLE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        bADD.setBackground(new java.awt.Color(219, 48, 82));
        bADD.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        bADD.setForeground(new java.awt.Color(241, 214, 171));
        bADD.setText("Add Member");
        bADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADDActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(219, 48, 82));
        jButton4.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(241, 214, 171));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familyvault/icons8-logout-32.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        jPanel4.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel1.setText("Month");
        jPanel4.add(jLabel1, java.awt.BorderLayout.NORTH);

        tMONTH.setBackground(new java.awt.Color(241, 231, 222));
        tMONTH.setText("MM");
        tMONTH.setBorder(null);
        tMONTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMONTHActionPerformed(evt);
            }
        });
        jPanel4.add(tMONTH, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel3.setText("Day");
        jPanel5.add(jLabel3, java.awt.BorderLayout.NORTH);

        tDAY.setBackground(new java.awt.Color(241, 231, 222));
        tDAY.setText("DD");
        tDAY.setBorder(null);
        tDAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDAYActionPerformed(evt);
            }
        });
        jPanel5.add(tDAY, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel7.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel4.setText("Year");
        jPanel7.add(jLabel4, java.awt.BorderLayout.NORTH);

        tYEAR.setBackground(new java.awt.Color(241, 231, 222));
        tYEAR.setText("YYYY");
        tYEAR.setBorder(null);
        tYEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tYEARActionPerformed(evt);
            }
        });
        jPanel7.add(tYEAR, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIRTHDAY");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bADD, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bADD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLNActionPerformed

    private void tMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMNActionPerformed

    private void tFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFNActionPerformed

    private void bADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADDActionPerformed
        String FN = tFN.getText();
        String MN = tMN.getText();
        String LN = tLN.getText();
        String NICK = tNICKN.getText();
        String ROLE = tROLE.getText();
        String MONTH = tMONTH.getText();
        String DAY = tDAY.getText();
        String YEAR = tYEAR.getText();
        String BDAY = (DAY+'-'+MONTH+'-'+YEAR);
        
        try {
            // Query to find the maximum MEM_ID value
            p = con.prepareStatement("SELECT MEM_ID FROM FAM_MEMBER");
            r = p.executeQuery();

            Set<Integer> existingIds = new HashSet<>();

            // Collect all existing MEM_ID values into a set
            while (r.next()) {
                int existingId = r.getInt("MEM_ID");
                existingIds.add(existingId);
            }

            // Close the result set and statement
            r.close();
            p.close();

            // Generate a new MEM_ID
            while (existingIds.contains(MEMID)) {
                // If the newId already exists, increment it until it's unique
                MEMID++;
            }
            
            p = con.prepareStatement("INSERT INTO FAM_MEMBER (FNAME, MNAME, LNAME, BDAY, NICKNAME, ROLE, CODE, MEM_ID) VALUES (?, ?, ?, to_date(?,'dd-MM-YYYY'), ?, ?, ?, ?)");
            p.setString(1, FN);
            p.setString(2, MN);
            p.setString(3, LN);
            p.setString(4, BDAY);
            p.setString(5, NICK);
            p.setString(6, ROLE);
            p.setInt(7, LogIn.inputCODE);
            p.setInt(8, MEMID);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null,"Added to Database");
            
           
            p = con.prepareStatement("SELECT COUNT(*) AS MEM_COUNT FROM FAM_MEMBER");
            r = p.executeQuery();

            int memCount = 0;
            if (r.next()) {
                memCount = r.getInt("MEM_COUNT");
            }

            // Close the result set and statement
            r.close();
            p.close();

            if (memCount >= 6) {
                // If there are already 6 MEM_IDs, return true
                bADD.setEnabled(false);
            }
            
            r=null;

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        
    }//GEN-LAST:event_bADDActionPerformed

    private void tNICKNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNICKNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNICKNActionPerformed

    private void tROLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tROLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tROLEActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomeScreen().setVisible(true);   
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tDAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDAYActionPerformed

    private void tYEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tYEARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tYEARActionPerformed

    private void tMONTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMONTHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMONTHActionPerformed

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
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bADD;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jTITLE;
    private javax.swing.JTextField tDAY;
    private javax.swing.JTextField tFN;
    private javax.swing.JTextField tLN;
    private javax.swing.JTextField tMN;
    private javax.swing.JTextField tMONTH;
    private javax.swing.JTextField tNICKN;
    private javax.swing.JTextField tROLE;
    private javax.swing.JTextField tYEAR;
    // End of variables declaration//GEN-END:variables
}
