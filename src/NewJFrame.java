/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bimaa
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radSusu = new javax.swing.JRadioButton();
        radKopi = new javax.swing.JRadioButton();
        radTeh = new javax.swing.JRadioButton();
        chkRoti = new javax.swing.JCheckBox();
        chkMie = new javax.swing.JCheckBox();
        chkSosis = new javax.swing.JCheckBox();
        btnClear = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTot = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSub = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTax = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, -1, -1));

        radSusu.setBackground(new java.awt.Color(255, 255, 255));
        radSusu.setText("Susu 2.500");
        radSusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSusuActionPerformed(evt);
            }
        });
        getContentPane().add(radSusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 140, 140, 40));

        radKopi.setBackground(new java.awt.Color(255, 255, 255));
        radKopi.setText("Kopi 3.500");
        radKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radKopiActionPerformed(evt);
            }
        });
        getContentPane().add(radKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 140, 50));

        radTeh.setBackground(new java.awt.Color(255, 255, 255));
        radTeh.setText("Teh 1.000");
        radTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTehActionPerformed(evt);
            }
        });
        getContentPane().add(radTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 140, 40));

        chkRoti.setBackground(new java.awt.Color(255, 255, 255));
        chkRoti.setText("Roti 2.000");
        chkRoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRotiActionPerformed(evt);
            }
        });
        getContentPane().add(chkRoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 130, 50));

        chkMie.setBackground(new java.awt.Color(255, 255, 255));
        chkMie.setText("Mie 5.000");
        chkMie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMieActionPerformed(evt);
            }
        });
        getContentPane().add(chkMie, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 130, 40));

        chkSosis.setBackground(new java.awt.Color(255, 255, 255));
        chkSosis.setText("Sosis 4.000");
        getContentPane().add(chkSosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 120, 30));

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 90, 50));

        btnEnter.setBackground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 90, 50));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setText("exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 80, 50));

        jLabel2.setText("Subtotal:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, 30));

        jLabel4.setText("Total:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 50, 30));

        jLabel3.setText("Tax:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 40, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("Angkringan Khodam");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/43630a37a98480ca288de067d9a10713.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -260, 500, 840));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/be951fc1512c35d0ef79d8cabbc15e2d.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 370, 500, 340));

        jScrollPane3.setViewportView(txtTot);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 190, -1));

        jScrollPane1.setViewportView(txtSub);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 190, -1));

        jScrollPane2.setViewportView(txtTax);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 190, -1));

        jPanel1.setBackground(new java.awt.Color(234, 221, 39));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 600, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radSusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSusuActionPerformed
        // select susu options
        
        if (radSusu.isSelected())
            radKopi.setSelected(false);
            radTeh.setSelected(false);
    }//GEN-LAST:event_radSusuActionPerformed

    private void radKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radKopiActionPerformed
       // select kopi
        
       if (radKopi.isSelected())
            radSusu.setSelected(false);
            radTeh.setSelected(false);
    }//GEN-LAST:event_radKopiActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
   
        double total;
        double subtotal = 0;
        final double TAXRATE = .08;
        double tax;
        
        if (radSusu.isSelected()){
            subtotal = subtotal + 2.500;
        }else if (radKopi.isSelected()){
            subtotal = subtotal + 3.500;
        }else if (radTeh.isSelected()){
            subtotal = subtotal + 1.000;
        }
        
        if (chkRoti.isSelected()){
            subtotal = subtotal + 2.000;
        }if (chkMie.isSelected()){
            subtotal = subtotal + 5.000;
        }if (chkSosis.isSelected()){
            subtotal = subtotal + 4.000;
    }     
        
        txtSub.setText(Double.toString(subtotal));
        
        subtotal = Double.parseDouble(txtSub.getText());
        tax = subtotal * TAXRATE;
        total = tax + subtotal;
        
        txtTax.setText(Double.toString(tax));
        txtTot.setText(Double.toString(total));
        
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // exit Jframe
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void radTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTehActionPerformed
        // select teh options
        
        if (radTeh.isSelected())
            radSusu.setSelected(false);
            radKopi.setSelected(false);
    }//GEN-LAST:event_radTehActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // clears all fields
        
        radSusu.setSelected(false);
        radKopi.setSelected(false);
        radTeh.setSelected(false);
        chkRoti.setSelected(false);
        chkMie.setSelected(false);
        chkSosis.setSelected(false);
        txtTot.setText("");
        txtSub.setText("");
        txtTax.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void chkRotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRotiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRotiActionPerformed

    private void chkMieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMieActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JCheckBox chkMie;
    private javax.swing.JCheckBox chkRoti;
    private javax.swing.JCheckBox chkSosis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radKopi;
    private javax.swing.JRadioButton radSusu;
    private javax.swing.JRadioButton radTeh;
    private javax.swing.JTextPane txtSub;
    private javax.swing.JTextPane txtTax;
    private javax.swing.JTextPane txtTot;
    // End of variables declaration//GEN-END:variables
}
