/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 *
 * @author narwa
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_PANEL = new javax.swing.JPanel();
        l_konsmailImage = new javax.swing.JLabel();
        l_email = new javax.swing.JLabel();
        i_email = new javax.swing.JTextField();
        l_password = new javax.swing.JLabel();
        i_password = new javax.swing.JPasswordField();
        b_login = new javax.swing.JButton();
        b_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konsmail: Login");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/konsmail_icon.png"))).getImage());
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(540, 323));

        l_konsmailImage.setIcon(new ImageIcon(new javax.swing.ImageIcon(
                Objects.requireNonNull(getClass().getResource("/images/KonsmailMail_logo.png"))).getImage()
                .getScaledInstance(270, 119, Image.SCALE_SMOOTH)));

        l_email.setLabelFor(i_email);
        l_email.setText("Email");

        i_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_emailActionPerformed(evt);
            }
        });

        l_password.setLabelFor(i_password);
        l_password.setText("Password");

        i_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_passwordActionPerformed(evt);
            }
        });

        b_login.setText("Login");
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });

        b_register.setText("Register");
        b_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MAIN_PANELLayout = new javax.swing.GroupLayout(MAIN_PANEL);
        MAIN_PANEL.setLayout(MAIN_PANELLayout);
        MAIN_PANELLayout.setHorizontalGroup(
                MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(MAIN_PANELLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(l_konsmailImage, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49))
                                        .addGroup(MAIN_PANELLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(l_password, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(MAIN_PANELLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(i_email)
                                                        .addComponent(i_password,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                MAIN_PANELLayout.createSequentialGroup()
                                                                        .addComponent(l_email,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                105,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                                                .addComponent(b_register,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(152, 152, 152)
                                                                .addComponent(b_login,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(20, 20, 20)));
        MAIN_PANELLayout.setVerticalGroup(
                MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(l_konsmailImage, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(l_email)
                                .addGap(0, 0, 0)
                                .addComponent(i_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_password)
                                .addGap(0, 0, 0)
                                .addComponent(i_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16,
                                        Short.MAX_VALUE)
                                .addGroup(
                                        MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(16, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MAIN_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MAIN_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void i_emailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_i_emailActionPerformed
        // TODO unused:
    }// GEN-LAST:event_i_emailActionPerformed

    private void i_passwordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_i_passwordActionPerformed
        // TODO unused:
    }// GEN-LAST:event_i_passwordActionPerformed

    private void b_registerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_registerActionPerformed
        RegisterPage dialog = new RegisterPage(this, true);
        dialog.setVisible(true);
    }// GEN-LAST:event_b_registerActionPerformed

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_loginActionPerformed
        // TODO complete verification once the database is ready
        setVisible(false);
        new MailboxPage().setVisible(true);
    }// GEN-LAST:event_b_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIN_PANEL;
    private javax.swing.JButton b_login;
    private javax.swing.JButton b_register;
    private javax.swing.JTextField i_email;
    private javax.swing.JPasswordField i_password;
    private javax.swing.JLabel l_email;
    private javax.swing.JLabel l_konsmailImage;
    private javax.swing.JLabel l_password;
    // End of variables declaration//GEN-END:variables
}
