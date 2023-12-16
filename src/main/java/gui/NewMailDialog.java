/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import models.objects.Advertisement;
import models.objects.Email;
import models.objects.Session;
import utils.DatabaseUtils;
import utils.USwingAppearance;

/**
 *
 * @author narwa
 */
public class NewMailDialog extends javax.swing.JDialog {
    Session session;

    /**
     * Creates new form NewMailDialog
     */
    public NewMailDialog(java.awt.Frame parent, boolean modal, Session session) {
        super(parent, modal);
        this.session = session;
        initComponents();
    }

        public NewMailDialog(java.awt.Frame parent, boolean modal, Session session, String senderUuid) {
        super(parent, modal);
        this.session = session;
        initComponents();
        i_recipientAddress.setText(DatabaseUtils.getEmailAddress(senderUuid));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_PANEL = new javax.swing.JPanel();
        i_recipientAddress = new javax.swing.JTextField();
        l_recipientEmailAddress = new javax.swing.JLabel();
        MAIL_BODY_SCROLLPANE = new javax.swing.JScrollPane();
        f_mailBody = new javax.swing.JTextArea();
        l_body = new javax.swing.JLabel();
        l_subject = new javax.swing.JLabel();
        i_subject = new javax.swing.JTextField();
        b_send = new javax.swing.JButton();
        b_cancel = new javax.swing.JButton();
        i_isAdvertisement = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konsmail: New mail");
        setResizable(false);

        l_recipientEmailAddress.setText("Receipient Email Address");

        MAIL_BODY_SCROLLPANE.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        f_mailBody.setColumns(20);
        f_mailBody.setLineWrap(true);
        f_mailBody.setRows(5);
        f_mailBody.setText("...");
        MAIL_BODY_SCROLLPANE.setViewportView(f_mailBody);

        l_body.setText("Body");

        l_subject.setText("Subject");

        b_send.setText("Send");
        b_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sendActionPerformed(evt);
            }
        });

        b_cancel.setText("Cancel");
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });

        i_isAdvertisement.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        i_isAdvertisement.setText("This is an advertisement");
        i_isAdvertisement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_isAdvertisementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MAIN_PANELLayout = new javax.swing.GroupLayout(MAIN_PANEL);
        MAIN_PANEL.setLayout(MAIN_PANELLayout);
        MAIN_PANELLayout.setHorizontalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_recipientEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_body, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MAIL_BODY_SCROLLPANE, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                    .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(i_isAdvertisement))))
                        .addGroup(MAIN_PANELLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(i_recipientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(i_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_send, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MAIN_PANELLayout.setVerticalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(l_recipientEmailAddress)
                .addGap(0, 0, 0)
                .addComponent(i_recipientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(l_subject)
                .addGap(0, 0, 0)
                .addComponent(i_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(l_body)
                .addGap(0, 0, 0)
                .addComponent(MAIL_BODY_SCROLLPANE, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_send, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_isAdvertisement))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void i_isAdvertisementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_isAdvertisementActionPerformed
        // TODO unused:
    }//GEN-LAST:event_i_isAdvertisementActionPerformed

    private void b_sendActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_sendActionPerformed
        String uuid = UUID.randomUUID().toString();
        String recipient = DatabaseUtils.getUuid(i_recipientAddress.getText());
        String sender = session.getAccountUuid();
        String subject = i_subject.getText().trim();
        String content = f_mailBody.getText();

        if (i_isAdvertisement.isSelected()) {
            DatabaseUtils
                .insertMail(new Advertisement(uuid, sender, recipient, subject, content, LocalDateTime.now(), false));
        } else {
            DatabaseUtils
                .insertMail(new Email(uuid, sender, recipient, subject, content, LocalDateTime.now(), false));
        }
        
        resetFields();
        JOptionPane.showMessageDialog(
                this,
                "Email sent!",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
        
    }// GEN-LAST:event_b_sendActionPerformed

    private void resetFields() {
        i_recipientAddress.setText("");
        i_subject.setText("");
        f_mailBody.setText("");
    }

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_cancelActionPerformed
        dispose();
    }// GEN-LAST:event_b_cancelActionPerformed

    private void b_previewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_previewActionPerformed
        // TODO add your handling code here:
        


        // new MailPreviewDialog(this,true,session,null);
    }// GEN-LAST:event_b_previewActionPerformed

    // TODO remove this unused main
    // /**
    // * @param args the command line arguments
    // */
    // public static void main(String args[]) {
    // /* Set the Nimbus look and feel */
    // USwingAppearance.setLooksAndFeel();

    // /* Create and display the dialog */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // NewMailDialog dialog = new NewMailDialog(new javax.swing.JFrame(), true);
    // dialog.addWindowListener(new java.awt.event.WindowAdapter() {
    // @Override
    // public void windowClosing(java.awt.event.WindowEvent e) {
    // System.exit(0);
    // }
    // });
    // dialog.setVisible(true);
    // }
    // });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MAIL_BODY_SCROLLPANE;
    private javax.swing.JPanel MAIN_PANEL;
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_send;
    private javax.swing.JTextArea f_mailBody;
    private javax.swing.JCheckBox i_isAdvertisement;
    private javax.swing.JTextField i_recipientAddress;
    private javax.swing.JTextField i_subject;
    private javax.swing.JLabel l_body;
    private javax.swing.JLabel l_recipientEmailAddress;
    private javax.swing.JLabel l_subject;
    // End of variables declaration//GEN-END:variables
}
