/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_UAS;

import java.io.FileWriter;
import java.text.MessageFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author frzar
 */
public class Create_Account extends javax.swing.JFrame {

    public Create_Account() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jLabel10 = new javax.swing.JLabel();
        pas2 = new javax.swing.JPasswordField();
        pas = new javax.swing.JPasswordField();
        show = new javax.swing.JLabel();
        hide1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(98, 82, 246));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daftar Nasabah Baru");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sign Up");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sign Up");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama Akun Nasabah :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Alpro\\Projek\\icons8_Account_50px.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 50));

        username.setBackground(new java.awt.Color(98, 82, 246));
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        username.setPhColor(new java.awt.Color(255, 255, 255));
        username.setPlaceholder("Enter Username");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 280, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        hide.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        hide.setForeground(new java.awt.Color(255, 255, 255));
        hide.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Alpro\\Fairuz Ardhan Haunan\\src\\Project_UAS\\icons8_hide_30px.png")); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel1.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 30, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(99, 57, 228));
        rSMaterialButtonCircle1.setText("CREATE");
        rSMaterialButtonCircle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle1MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 280, 70));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Konfirmasi Password :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        pas2.setBackground(new java.awt.Color(98, 82, 246));
        pas2.setForeground(new java.awt.Color(255, 255, 255));
        pas2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        pas2.setCaretColor(new java.awt.Color(255, 255, 255));
        pas2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pas2ActionPerformed(evt);
            }
        });
        jPanel1.add(pas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 270, 30));

        pas.setBackground(new java.awt.Color(98, 82, 246));
        pas.setForeground(new java.awt.Color(255, 255, 255));
        pas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        pas.setCaretColor(new java.awt.Color(255, 255, 255));
        pas.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(pas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 270, 30));

        show.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Alpro\\Fairuz Ardhan Haunan\\src\\Project_UAS\\icons8_eye_30px_1.png")); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 30, -1));

        hide1.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Alpro\\Fairuz Ardhan Haunan\\src\\Project_UAS\\icons8_hide_30px.png")); // NOI18N
        hide1.setText("jLabel3");
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide1MouseClicked(evt);
            }
        });
        jPanel1.add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 30, -1));

        show1.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Alpro\\Fairuz Ardhan Haunan\\src\\Project_UAS\\icons8_eye_30px_1.png")); // NOI18N
        show1.setText("jLabel3");
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel1.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 30, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 400, 830));

        jPanel2.setBackground(new java.awt.Color(29, 28, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(98, 82, 246));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(98, 82, 246));
        jLabel2.setText("Bank UIN Maulana Malik Ibrahim Malang");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 30));

        jLabel1.setBackground(new java.awt.Color(98, 82, 246));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\frzar\\Downloads\\undraw_building_websites_i78t.png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 1070, 680));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(98, 99, 240));
        rSMaterialButtonCircle2.setForeground(new java.awt.Color(98, 99, 240));
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 830));

        setSize(new java.awt.Dimension(1528, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Login_New kembali = new Login_New();
        kembali.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void rSMaterialButtonCircle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1MouseClicked

    }//GEN-LAST:event_rSMaterialButtonCircle1MouseClicked

    public String data(){
        String name = username.getText();
        return name;
    }

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        String name = username.getText();
        String password = pas.getText();
        String password2 = pas2.getText();
        bantuan ch = new bantuan();
        ch.saldo();
        try {
            
            FileWriter Writer = new FileWriter("dataNasabah.txt", true);
            String msg = MessageFormat.format("{0}#{1}#{2}#{3}", name, password, nomorNasabah(), ch.saldo());
            Writer.write(msg);
            Writer.write(System.lineSeparator());
            Writer.close();
            JOptionPane.showMessageDialog(null, "Berhasil Membuat Akun");
            setVisible(false);
            new Login_New().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    public String nomorNasabah() {
        String nonasabah = "";
        for (int x = 0; x < 8; x++) {
            nonasabah += String.valueOf((int) (10 * Math.random()));
        }
        return nonasabah;
    }


    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        pas.setEchoChar((char) 8226);
        hide.setVisible(false);
        hide.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);            // TODO add your handling code here:
    }//GEN-LAST:event_hideMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        pas.setEchoChar((char) 0);
        hide.setVisible(true);
        hide.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);    // TODO add your handling code here:
    }//GEN-LAST:event_showMouseClicked

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        pas2.setEchoChar((char) 0);
        hide1.setVisible(true);
        hide1.setEnabled(true);
        show1.setEnabled(false);
        show1.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_show1MouseClicked

    private void hide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MouseClicked
        pas.setEchoChar((char) 8226);
        hide1.setVisible(false);
        hide1.setEnabled(false);
        show1.setEnabled(true);
        show1.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_hide1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void pas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pas2ActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pas;
    private javax.swing.JPasswordField pas2;
    public rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show1;
    private app.bolivia.swing.JCTextField username;
    // End of variables declaration//GEN-END:variables
}
