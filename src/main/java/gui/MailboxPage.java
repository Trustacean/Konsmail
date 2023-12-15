/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import models.views.MailviewPanel;
import models.views.inboxtable.CellsActionable;
import models.views.inboxtable.MailButton;
import models.views.inboxtable.TableActionCellEditor;
import models.views.inboxtable.TableActionCellRender;
import utils.DatabaseUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

import models.objects.Session;
import models.objects.Email;
import utils.ULogger;

/**
 *
 * @author narwa
 */
public class MailboxPage extends javax.swing.JFrame {
    private ArrayList<Email> emails = new ArrayList<Email>();
    private Session session;
    private final CardLayout cardSwitcher;
    private MailviewPanel mailviewPanel = new MailviewPanel();
    private int currentEmailIndex = -1;

    /**
     * Creates new form MailboxPage
     */
    public MailboxPage(Session session) {
        this.session = session;
        emails = DatabaseUtils.getMailbox(session.getAccountUuid());
        System.out.println(emails.size());

        initComponents();
        initInboxTable();
        cardSwitcher = (CardLayout) MAIL_VIEW.getLayout();
        initForms();
        m_userMenu.setText(session.getAccountEmailAddress());
//        enablePreview();
    }

    private void initForms() {
//        MailviewEmptyPanel mailviewEmptyPanel = new MailviewEmptyPanel(); // please ignore this for now
        MAIL_VIEW.add(mailviewPanel, "mailview");
        MAIL_VIEW.add(new JPanel(), "emptyview");
        cardSwitcher.show(MAIL_VIEW, "emptyview");
    }

    private void initInboxTable() {
        CellsActionable event = row -> row;
        inboxTable.getColumnModel().getColumn(0).setCellRenderer(new TableActionCellRender());
        inboxTable.getColumnModel().getColumn(0).setCellEditor(new TableActionCellEditor(event));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_CONTAINER = new javax.swing.JPanel();
        TOOL_BAR = new javax.swing.JPanel();
        i_inboxType = new javax.swing.JComboBox<>();
        b_createMail = new javax.swing.JButton();
        b_refresh = new javax.swing.JButton();
        MAIL_VIEW = new javax.swing.JPanel();
        MAIL_TOOLS = new javax.swing.JPanel();
        b_mailReply = new javax.swing.JButton();
        b_flag = new javax.swing.JToggleButton();
        b_mailReport = new javax.swing.JButton();
        b_markUnread = new javax.swing.JToggleButton();
        MAILBOX_FINDPANE = new javax.swing.JPanel();
        i_findMail = new javax.swing.JTextField();
        b_findMail = new javax.swing.JButton();
        INBOX_PANEL = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inboxTable = new javax.swing.JTable();
        WINDOW_MENU_BAR = new javax.swing.JMenuBar();
        m_userMenu = new javax.swing.JMenu();
        m_configureAccount = new javax.swing.JMenuItem();
        m_signOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konsmail: Mailbox");
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/konsmail_icon.png"))).getImage());
        setResizable(false);

        MAIN_CONTAINER.setBackground(new java.awt.Color(255, 255, 255));

        i_inboxType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        i_inboxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Inbox", "All Inboxes", "Sent", "Flagged", "Promotions" }));
        i_inboxType.setPreferredSize(new java.awt.Dimension(76, 30));
        i_inboxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_inboxTypeActionPerformed(evt);
            }
        });

        b_createMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_createMail.setText("Create Mail");
        b_createMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createMailActionPerformed(evt);
            }
        });

        b_refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_refresh.setText("Refresh");
        b_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TOOL_BARLayout = new javax.swing.GroupLayout(TOOL_BAR);
        TOOL_BAR.setLayout(TOOL_BARLayout);
        TOOL_BARLayout.setHorizontalGroup(
            TOOL_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TOOL_BARLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(i_inboxType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(b_createMail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TOOL_BARLayout.setVerticalGroup(
            TOOL_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TOOL_BARLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TOOL_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_createMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_inboxType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        MAIL_VIEW.setPreferredSize(new java.awt.Dimension(761, 713));
        MAIL_VIEW.setLayout(new java.awt.CardLayout());

        b_mailReply.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailReply.setText("Reply");
        b_mailReply.setEnabled(false);
        b_mailReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailReplyActionPerformed(evt);
            }
        });

        b_flag.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_flag.setText("Flag");
        b_flag.setEnabled(false);
        b_flag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_flagActionPerformed(evt);
            }
        });

        b_mailReport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailReport.setText("Report");
        b_mailReport.setEnabled(false);
        b_mailReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailReportActionPerformed(evt);
            }
        });

        b_markUnread.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_markUnread.setText("Mark Unread");
        b_markUnread.setEnabled(false);

        javax.swing.GroupLayout MAIL_TOOLSLayout = new javax.swing.GroupLayout(MAIL_TOOLS);
        MAIL_TOOLS.setLayout(MAIL_TOOLSLayout);
        MAIL_TOOLSLayout.setHorizontalGroup(
            MAIL_TOOLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_TOOLSLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MAIL_TOOLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_flag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_mailReport, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(b_mailReply, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(b_markUnread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        MAIL_TOOLSLayout.setVerticalGroup(
            MAIL_TOOLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_TOOLSLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(b_mailReply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(b_flag, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_markUnread, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                .addComponent(b_mailReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        i_findMail.setText("Search mail here...");
        i_findMail.setPreferredSize(new java.awt.Dimension(77, 30));
        i_findMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_findMailActionPerformed(evt);
            }
        });

        b_findMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_findMail.setText("Find");
        b_findMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_findMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MAILBOX_FINDPANELayout = new javax.swing.GroupLayout(MAILBOX_FINDPANE);
        MAILBOX_FINDPANE.setLayout(MAILBOX_FINDPANELayout);
        MAILBOX_FINDPANELayout.setHorizontalGroup(
            MAILBOX_FINDPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAILBOX_FINDPANELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i_findMail, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_findMail)
                .addContainerGap())
        );
        MAILBOX_FINDPANELayout.setVerticalGroup(
            MAILBOX_FINDPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAILBOX_FINDPANELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MAILBOX_FINDPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i_findMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_findMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        inboxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Inbox"
            }
        ));
        inboxTable.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                int rowIndex = inboxTable.rowAtPoint(e.getPoint());
                int colIndex = inboxTable.columnAtPoint(e.getPoint());
                if (rowIndex >= 0 && colIndex >= 0) {
                    ULogger.log("clicked!");
                    tableButtonCallback(rowIndex);
                }
            }
        });
        inboxTable.setRowHeight(79);
        inboxTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(inboxTable);
        if (inboxTable.getColumnModel().getColumnCount() > 0) {
            inboxTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout INBOX_PANELLayout = new javax.swing.GroupLayout(INBOX_PANEL);
        INBOX_PANEL.setLayout(INBOX_PANELLayout);
        INBOX_PANELLayout.setHorizontalGroup(
            INBOX_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        INBOX_PANELLayout.setVerticalGroup(
            INBOX_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MAIN_CONTAINERLayout = new javax.swing.GroupLayout(MAIN_CONTAINER);
        MAIN_CONTAINER.setLayout(MAIN_CONTAINERLayout);
        MAIN_CONTAINERLayout.setHorizontalGroup(
            MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TOOL_BAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MAIN_CONTAINERLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MAILBOX_FINDPANE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(INBOX_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIL_VIEW, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIL_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MAIN_CONTAINERLayout.setVerticalGroup(
            MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_CONTAINERLayout.createSequentialGroup()
                .addComponent(TOOL_BAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MAIL_VIEW, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(MAIN_CONTAINERLayout.createSequentialGroup()
                        .addComponent(MAILBOX_FINDPANE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INBOX_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MAIL_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        m_userMenu.setText("usr: nara@konsmail.dev");

        m_configureAccount.setText("Configure Account");
        m_configureAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_configureAccountActionPerformed(evt);
            }
        });
        m_configureAccount.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/gear_icon.png"))).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
        m_userMenu.add(m_configureAccount);

        m_signOut.setText("Sign Out");
        m_signOut.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/signout_icon.png"))).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
        m_signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_signOutActionPerformed(evt);
            }
        });
        m_userMenu.add(m_signOut);

        WINDOW_MENU_BAR.add(m_userMenu);

        setJMenuBar(WINDOW_MENU_BAR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MAIN_CONTAINER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Mailbox");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_configureAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_configureAccountActionPerformed
        new ConfigureAccountPage(this, true, session).setVisible(true);
    }//GEN-LAST:event_m_configureAccountActionPerformed

    private void i_findMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_findMailActionPerformed
        // TODO unused:
    }//GEN-LAST:event_i_findMailActionPerformed

    private void i_inboxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_inboxTypeActionPerformed
        // TODO unused:
    }//GEN-LAST:event_i_inboxTypeActionPerformed

    private void b_createMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createMailActionPerformed
        // TODO add your handling code here:
        new NewMailDialog(this, true, session).setVisible(true);
    }//GEN-LAST:event_b_createMailActionPerformed

    private void b_mailReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailReplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailReplyActionPerformed

    private void b_mailReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailReportActionPerformed

    private void b_findMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_findMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_findMailActionPerformed

    private void b_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_refreshActionPerformed

    private void m_signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_signOutActionPerformed
        this.dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_m_signOutActionPerformed

    private void b_flagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_flagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_flagActionPerformed

    /**
     * Disables the mail tools.
     * */
    public void disableMailTools() {
        b_mailReply.setEnabled(false);
        b_flag.setEnabled(false);
        b_mailReport.setEnabled(false);
        b_markUnread.setEnabled(false);
    }

    /**
     * Enables the mail tools.
     * */
    public void enableMailTools() {
        b_mailReply.setEnabled(true);
        b_flag.setEnabled(true);
        b_mailReport.setEnabled(true);
        b_markUnread.setEnabled(true);
    }

    public void enablePreview() {
        cardSwitcher.show(MAIL_VIEW, "mailview");
        enableMailTools();

        mailviewPanel.setFrom("Ohio");
    }

    /**
     * Updates the table rows using a List of Email objects.
     * */
    public void updateTable(List<Email> emails) {
        Object[][] data = new Object[emails.size()][1];
        String[] columns = {"Inbox"};
        for (int i = 0; i < emails.size(); i++) {
            final var currentEmail = emails.get(i);
            data[i][0] = new MailButton(currentEmail);
        }
        var model = new javax.swing.table.DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        inboxTable.setModel(model);
        inboxTable.repaint();
        inboxTable.revalidate();
    }

    /**
     * Callback to handle which row is being clicked in the inbox table.
     * */
    private void tableButtonCallback(int rowIndex) {
        System.out.println(rowIndex);
        this.currentEmailIndex = rowIndex;
    }

    // /**
    //  * @param args the command line arguments
    //  */
    // public static void main(String[] args) {
    //     /* Set the Nimbus look and feel */
    //     USwingAppearance.setLooksAndFeel();

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new MailboxPage().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel INBOX_PANEL;
    private javax.swing.JPanel MAILBOX_FINDPANE;
    private javax.swing.JPanel MAIL_TOOLS;
    private javax.swing.JPanel MAIL_VIEW;
    private javax.swing.JPanel MAIN_CONTAINER;
    private javax.swing.JPanel TOOL_BAR;
    private javax.swing.JMenuBar WINDOW_MENU_BAR;
    private javax.swing.JButton b_createMail;
    private javax.swing.JButton b_findMail;
    private javax.swing.JToggleButton b_flag;
    private javax.swing.JButton b_mailReply;
    private javax.swing.JButton b_mailReport;
    private javax.swing.JToggleButton b_markUnread;
    private javax.swing.JButton b_refresh;
    private javax.swing.JTextField i_findMail;
    private javax.swing.JComboBox<String> i_inboxType;
    private javax.swing.JTable inboxTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem m_configureAccount;
    private javax.swing.JMenuItem m_signOut;
    private javax.swing.JMenu m_userMenu;
    // End of variables declaration//GEN-END:variables
}
