/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import models.Account;
import utils.Checker;
import utils.DatabaseConnector;

/**
 *
 * @author narwa
 */
public class RegisterPage extends javax.swing.JDialog {

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        l_firstName = new javax.swing.JLabel();
        i_firstName = new javax.swing.JTextField();
        l_email = new javax.swing.JLabel();
        i_email = new javax.swing.JTextField();
        l_password = new javax.swing.JLabel();
        i_password = new javax.swing.JPasswordField();
        l_confirmPassword = new javax.swing.JLabel();
        i_confirmPassword = new javax.swing.JPasswordField();
        l_lastName = new javax.swing.JLabel();
        i_lastName = new javax.swing.JTextField();
        l_konsmailLogo = new javax.swing.JLabel();
        b_back = new javax.swing.JButton();
        b_register = new javax.swing.JButton();
        l_header = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konsmail: Register new account");
        setIconImage(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/konsmail_icon.png"))).getImage());

        l_firstName.setLabelFor(i_firstName);
        l_firstName.setText("First Name");

        l_email.setLabelFor(i_email);
        l_email.setText("Email");

        i_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_emailActionPerformed(evt);
            }
        });

        l_password.setLabelFor(i_password);
        l_password.setText("Password");

        i_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        i_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_passwordActionPerformed(evt);
            }
        });

        l_confirmPassword.setLabelFor(i_confirmPassword);
        l_confirmPassword.setText("Confirm Password");

        i_confirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        l_lastName.setLabelFor(i_lastName);
        l_lastName.setText("Last Name");

        l_konsmailLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/KonsmailMail_logo.png"))).getImage().getScaledInstance(194, 86, Image.SCALE_SMOOTH)));

        b_back.setText("Back");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });

        b_register.setText("Register");
        b_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registerActionPerformed(evt);
            }
        });

        l_header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_header.setText("<html>Register a new<br/>account</html>");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("@konsmail.dev");

        javax.swing.GroupLayout MAIN_PANELLayout = new javax.swing.GroupLayout(MAIN_PANEL);
        MAIN_PANEL.setLayout(MAIN_PANELLayout);
        MAIN_PANELLayout.setHorizontalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_PANELLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(i_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(i_confirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                        .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_confirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                                .addComponent(l_konsmailLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l_header, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MAIN_PANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(i_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(i_lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                .addComponent(i_email, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        MAIN_PANELLayout.setVerticalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_konsmailLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_header, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(l_lastName)
                        .addGap(0, 0, 0)
                        .addComponent(i_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(l_firstName)
                        .addGap(0, 0, 0)
                        .addComponent(i_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_email)
                .addGap(0, 0, 0)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(i_email, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_password)
                .addGap(0, 0, 0)
                .addComponent(i_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_confirmPassword)
                .addGap(0, 0, 0)
                .addComponent(i_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean b_registerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_registerActionPerformed
        // TODO incomplete:
        String fName = i_firstName.getText();
        String lName = i_lastName.getText();
        String email = i_email.getText();
        String pass = String.valueOf(i_password.getPassword());
        String confPass = String.valueOf(i_confirmPassword.getPassword());

        if (fName.length() == 0 || lName.length() == 0 || email.length() == 0 || pass.length() == 0){
            JOptionPane.showMessageDialog(
                    this,
                    "Please fill all the fields!",
                    "Attention!",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (Checker.containsNonAlpha(fName) || Checker.containsNonAlpha(lName)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Name can not contains non alpha!",
                    "Attention!",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (Checker.containsNonAlphanumeric(email)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Email can not contain symbols!",
                    "Attention!",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (Checker.passwordLengthValidation(pass)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Password length must be 8 or more!",
                    "Attention!",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (!pass.equals(confPass)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Passowrd and Password confirmation does not match!",
                    "Attention!",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        resetField();
        // DatabaseConnector.insertAccount(new Account(fName, lName, email, pass, "x"));
        b_backActionPerformed(evt);
        return true;

    }// GEN-LAST:event_b_registerActionPerformed

    private void resetField() {
        i_firstName.setText("");
        i_lastName.setText("");
        i_email.setText("");
        i_password.setText("");
        i_confirmPassword.setText("");
    }

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_backActionPerformed
        this.dispose();
    }// GEN-LAST:event_b_backActionPerformed

    private void i_passwordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_i_passwordActionPerformed
        // TODO unused:
    }//GEN-LAST:event_i_passwordActionPerformed

    private void i_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_emailActionPerformed
        // TODO unused:
    }//GEN-LAST:event_i_emailActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterPage dialog = new RegisterPage(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIN_PANEL;
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_register;
    private javax.swing.JPasswordField i_confirmPassword;
    private javax.swing.JTextField i_email;
    private javax.swing.JTextField i_firstName;
    private javax.swing.JTextField i_lastName;
    private javax.swing.JPasswordField i_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l_confirmPassword;
    private javax.swing.JLabel l_email;
    private javax.swing.JLabel l_firstName;
    private javax.swing.JLabel l_header;
    private javax.swing.JLabel l_konsmailLogo;
    private javax.swing.JLabel l_lastName;
    private javax.swing.JLabel l_password;
    // End of variables declaration//GEN-END:variables
}
