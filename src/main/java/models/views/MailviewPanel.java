/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package models.views;

import models.interfaces.Emailable;
import models.objects.Advertisement;
import models.objects.Email;
import models.objects.Session;
import utils.ComponentUtils;
import utils.DatabaseUtils;
import utils.UColors;

import java.awt.*;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 * The class holds the UI for the mail view panel. The attributes/fields shown are the following:
 * <ul>
 *     <li>From</li>
 *     <li>Email</li>
 *     <li>At</li>
 *     <li>Time</li>
 *     <li>Subject</li>
 *     <li>Mail Body</li>
 *     <li>Konsmail Logo</li>
 * </ul>
 *
 * @author <a href="https://github.com/vianneynara">Nara</a>
 */

public class MailviewPanel extends javax.swing.JPanel {

    private Emailable email;

    public MailviewPanel() {
        initComponents();
        this.email = null;
        this.setFrom("");
        this.setEmail("");
        this.setAt("");
        this.setTime("");
        this.setSubject("");
        this.setMailBody("");

        // Sets background, panels, buttons colors
        setColors();
    }

    public MailviewPanel(Email email) {
        initComponents();
        this.email = email;
        this.setFrom(DatabaseUtils.getFirstLastName(email.getSenderUuid()));
        this.setEmail(DatabaseUtils.getEmailAddress(email.getSenderUuid()));
        this.setAt(email.getFormattedDate());
        this.setTime(email.getFormattedTime());
        this.setSubject(email.getSubject());
        this.setMailBody(email.getContent());

        // Sets background, panels, buttons colors
        setColors();
    }

    /**
     * Creates new form Mailview using an {@link Email} object.
     */
    public MailviewPanel(Session session, Email email) {
        initComponents();
        this.email = email;
        this.setFrom(session.getAccountFirstName() + " " + session.getAccountLastName());
        this.setEmail(session.getAccountEmailAddress());
        this.setAt(email.getFormattedDate());
        this.setTime(email.getFormattedTime());
        this.setSubject(email.getSubject());
        this.setMailBody(email.getContent());

        // Sets background, panels, buttons colors
        setColors();
    }

    /**
     * Sets background, panels, buttons colors.
     * */
    private void setColors() {
        ComponentUtils.setBackgroundColor(UColors.BEIGE.toColor(), this);
        ComponentUtils.setBackgroundColor(UColors.IVORY.toColor(), MAIL_HEADER, MAIL_BODY, MAIL_FOOTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIL_HEADER = new javax.swing.JPanel();
        l_subject = new javax.swing.JLabel();
        MAIL_BODY = new javax.swing.JPanel();
        f_from = new javax.swing.JLabel();
        l_from = new javax.swing.JLabel();
        l_email = new javax.swing.JLabel();
        f_email = new javax.swing.JLabel();
        l_at = new javax.swing.JLabel();
        f_at = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();
        f_time = new javax.swing.JLabel();
        MAIL_BODY_SCROLLPANE = new javax.swing.JScrollPane();
        f_mailBody = new javax.swing.JTextArea();
        MAIL_FOOTER = new javax.swing.JPanel();
        l_konsmail = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(761, 374));

        MAIL_HEADER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        l_subject.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_subject.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_subject.setText("Welcome to Konsmail!");

        javax.swing.GroupLayout MAIL_HEADERLayout = new javax.swing.GroupLayout(MAIL_HEADER);
        MAIL_HEADER.setLayout(MAIL_HEADERLayout);
        MAIL_HEADERLayout.setHorizontalGroup(
            MAIL_HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIL_HEADERLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MAIL_HEADERLayout.setVerticalGroup(
            MAIL_HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_HEADERLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(l_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        MAIL_BODY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        f_from.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        f_from.setText("Konsmail System Delivery");

        l_from.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_from.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        l_from.setText("from ");

        l_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_email.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        l_email.setText("email ");

        f_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        f_email.setText("system@konsmail.dev");

        l_at.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_at.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        l_at.setText("at");

        f_at.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        f_at.setText("12 December 2023");

        l_time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_time.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        l_time.setText("time");

        f_time.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        f_time.setText("12:30 PM");

        MAIL_BODY_SCROLLPANE.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        f_mailBody.setEditable(false);
        f_mailBody.setColumns(20);
        f_mailBody.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        f_mailBody.setLineWrap(true);
        f_mailBody.setRows(5);
        f_mailBody.setText("Dear [User],\n\nWelcome to Konsmail! We're thrilled to have you on board as part of our growing community of users who appreciate a seamless and efficient email experience.\n\nAt Konsmail, we strive to provide you with a platform that not only simplifies your communication but also enhances your overall email management.\n\nTo get started, simply log in using your credentials and explore the world of Konsmail. If you have any questions or need assistance, our support team is here to help. Feel free to reach out to [support@konsmail.dev] with any inquiries.\n\nOnce again, welcome to Konsmail! We look forward to being your trusted email platform.\n\nBest regards,\n\nNara\nUI Designer\nKonsmail Team");
        MAIL_BODY_SCROLLPANE.setViewportView(f_mailBody);

        javax.swing.GroupLayout MAIL_BODYLayout = new javax.swing.GroupLayout(MAIL_BODY);
        MAIL_BODY.setLayout(MAIL_BODYLayout);
        MAIL_BODYLayout.setHorizontalGroup(
            MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_BODYLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MAIL_BODY_SCROLLPANE)
                    .addGroup(MAIL_BODYLayout.createSequentialGroup()
                        .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_from)
                            .addComponent(l_email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(f_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(f_from, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MAIL_BODYLayout.createSequentialGroup()
                                .addComponent(l_time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIL_BODYLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(l_at)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_at)))))
                .addGap(10, 10, 10))
        );
        MAIL_BODYLayout.setVerticalGroup(
            MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_BODYLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MAIL_BODYLayout.createSequentialGroup()
                        .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_at)
                            .addComponent(f_at))
                        .addGap(0, 0, 0)
                        .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_time)
                            .addComponent(f_time, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MAIL_BODYLayout.createSequentialGroup()
                        .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_from)
                            .addComponent(f_from))
                        .addGap(0, 0, 0)
                        .addGroup(MAIL_BODYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_email)
                            .addComponent(f_email))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIL_BODY_SCROLLPANE)
                .addContainerGap())
        );

        MAIL_FOOTER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        javax.swing.GroupLayout MAIL_FOOTERLayout = new javax.swing.GroupLayout(MAIL_FOOTER);
        MAIL_FOOTER.setLayout(MAIL_FOOTERLayout);
        MAIL_FOOTERLayout.setHorizontalGroup(
            MAIL_FOOTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MAIL_FOOTERLayout.setVerticalGroup(
            MAIL_FOOTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        l_konsmail.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/KonsmailMail_logo.png"))).getImage().getScaledInstance(194, 86, Image.SCALE_SMOOTH)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MAIL_BODY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MAIL_HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MAIL_FOOTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(l_konsmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(MAIL_HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIL_BODY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MAIL_FOOTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_konsmail, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Setters for labels and text areas

    public void setFrom(String from) {
        this.f_from.setText(from);
    }

    public void setEmail(String email) {
        this.f_email.setText(email);
    }

    public void setAt(String at) {
        this.f_at.setText(at);
    }
    
    public void setTime(String time) {
        this.f_time.setText(time);
    }
    
    public void setMailBody(String mailBody) {
        this.f_mailBody.setText(mailBody);
    }
    
    public void setSubject(String subject) {
        this.l_subject.setText(subject == null ? "(No Subject)" : subject);
    }
    
    public void setCurrentEmail(Emailable email) {
        this.email = email;
        setFrom(DatabaseUtils.getFirstLastName(email.getSenderUuid()));
        setEmail(DatabaseUtils.getEmailAddress(email.getSenderUuid()));
        setAt(email.getFormattedDate());
        setTime(email.getFormattedTime());
        setMailBody(email.getContent());
        if (email instanceof Advertisement) {
            setSubject("[Advertisement] " + email.getSubject());
        } else {
            setSubject(email.getSubject());
        }
    }

    public void setAsSent() {
        this.l_from.setText("To");
    }

    public void setAsReceived() {
        this.l_from.setText("From");
    }

    // Getter email

    public Emailable getEmail() {
        return email;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIL_BODY;
    private javax.swing.JScrollPane MAIL_BODY_SCROLLPANE;
    private javax.swing.JPanel MAIL_FOOTER;
    private javax.swing.JPanel MAIL_HEADER;
    private javax.swing.JLabel f_at;
    private javax.swing.JLabel f_email;
    private javax.swing.JLabel f_from;
    private javax.swing.JTextArea f_mailBody;
    private javax.swing.JLabel f_time;
    private javax.swing.JLabel l_at;
    private javax.swing.JLabel l_email;
    private javax.swing.JLabel l_from;
    private javax.swing.JLabel l_konsmail;
    private javax.swing.JLabel l_subject;
    private javax.swing.JLabel l_time;
    // End of variables declaration//GEN-END:variables
}
