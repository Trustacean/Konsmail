package models.views.inboxtable;

import models.objects.Email;
import utils.DatabaseUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used to create a panel with action buttons.
 *
 * @author <a href="https://github.com/vianneynara">Nara</a>
 * */

public class PanelAction extends javax.swing.JPanel {

    private final String DEFAULT_TEXT = "<html> Subject <br> Konsmail System <br> system@konsmail.dev";

    /**
     * Creates new form PanelAction
     */
    public PanelAction() {
        initComponents();
    }

    /**
     * Creates new form PanelAction using an {@link Email} object.
     */
    public PanelAction(Email email) {
        initComponents();
        // Sets the renderer text
        cmdView.setText(String.format("<html>%s<br>%s<br>%s",
            email.getSubject(),
            DatabaseUtils.getFirstLastName(email.getSenderUuid()),
            email.getFormattedDate() + " " + email.getFormattedTime()
        ));
    }
    
    public void initEvents(CellsActionable event, int row) {
        cmdView.addActionListener(e -> event.onView(row));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdView = new models.views.inboxtable.MailButton();

        cmdView.setForeground(new java.awt.Color(0, 0, 0));
        cmdView.setIcon(MailButton.mailUnread);
        cmdView.setText(DEFAULT_TEXT);
        cmdView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdView.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        cmdView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdView, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.views.inboxtable.MailButton cmdView;
    // End of variables declaration//GEN-END:variables
}
