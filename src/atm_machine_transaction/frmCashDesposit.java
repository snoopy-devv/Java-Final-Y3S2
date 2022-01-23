/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine_transaction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import atm_machine_transaction.frmAtmMachine;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.frmLogin;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Heng-Sok
 */
public class frmCashDesposit extends javax.swing.JFrame {

    /// Get AccountID
    String accountId = "";

    /// Get File to Read
    File dataFile = new File("src/atm_machine_transaction/data.txt");

    /// 
    String userId = "";
    /**
     * Creates new form frmCashDeposit
     * @param userId
     */
    public frmCashDesposit() {
        initComponents();
        
//        txt_accountNo.setText(userId);
//        accountId = txt_accountNo.getText();
//        getDataFromFile(userId);
    }
    
    public frmCashDesposit(String userId) {
        initComponents();
        
        txt_accountNo.setText(userId);
        this.accountId = userId;
        getDataFromFile(userId);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == "N/A") {
            JOptionPane.showMessageDialog(null, "Please input only numeric !", "111", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Please input only numeric !", "Input Invalid", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static void setVarialed(int lineNumber, String data) throws IOException {
        Path path = Paths.get("src/atm_machine_transaction/data.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        lines.set(lineNumber - 1, data);
        Files.write(path, lines, StandardCharsets.UTF_8);
    }

    public void getDataFromFile(String userId) {

        try {
            Scanner sc = new Scanner(dataFile);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();

                String[] spData = data.split("@@", 10);

                if (spData[2].equals(userId)) {
                    txt_accountName.setText(spData[1]);
                    txt_balance.setText("$ " + spData[4]);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmCashDesposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_accountNo = new javax.swing.JLabel();
        txt_accountName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_balance = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inp_deposits = new javax.swing.JTextField();
        btn_deposit = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hack", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cash Deposit");

        jLabel2.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel2.setText("Account No:");

        jLabel3.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel3.setText("Account Name:");

        txt_accountNo.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        txt_accountNo.setText("#####");

        txt_accountName.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        txt_accountName.setText("#####");

        jLabel6.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel6.setText("Balance:");

        txt_balance.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        txt_balance.setText("$ ####");

        jLabel8.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel8.setText("Cash Deposit:");

        inp_deposits.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        inp_deposits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_depositsActionPerformed(evt);
            }
        });

        btn_deposit.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        btn_deposit.setText("Submit");
        btn_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_deposit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inp_deposits)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_accountNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_accountName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(69, 69, 69))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_accountNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_accountName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_balance))
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(inp_deposits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_deposit)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inp_depositsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_depositsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_depositsActionPerformed

    private void btn_depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositActionPerformed
        // TODO add your handling code here:
        /// Button Deposit

        /// Variable
        String accId = null;
        String accName = null;
        String accNo = null;
        String accPwd = null;
        int accBalance = 0;
        String accStatus = null;
        int accNumOfLine = 0;
        int inpDeposit = 0;
        int newBalance = 0;

        /// Protect Field is Not Null
        if (inp_deposits.getText() == "") {
            JOptionPane.showMessageDialog(null, "Please fill Deposit !", "Input Invalid", JOptionPane.WARNING_MESSAGE);
            return;
        }

        /// Protect Field is Not Number
        if (!isNumeric(inp_deposits.getText())) {
            inp_deposits.setText("");
        }

        /// Read a File and Get Data from File
        try {
            Scanner readData = new Scanner(dataFile);
            /// Get Line Number of File
            int numOfLine = 0;
            while (readData.hasNextLine()) {
                String data = readData.nextLine();
                numOfLine += 1;
                String[] spData = data.split("@@", 10);
                if (spData[2].equals(accountId)) {
                    accId = spData[0];
                    accName = spData[1];
                    accNo = spData[2];
                    accPwd = spData[3];
                    accBalance = Integer.parseInt(spData[4]);
                    accStatus = spData[5];
                    accNumOfLine = numOfLine;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmCashDesposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /// Get Data from Input Field
        inpDeposit = Integer.parseInt(inp_deposits.getText());
        
        /// Update Data to File
        try {
            String repData = accId + "@@" + accName + "@@" + accNo + "@@" + accPwd + "@@" + (accBalance + inpDeposit) + "@@" + accStatus;
            setVarialed(accNumOfLine, repData);
        } catch (IOException ex) {
            Logger.getLogger(frmCashDesposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /// Update Data to Form
        getDataFromFile(userId);
        
        /// Reset Deposit Field
        inp_deposits.setText("");
        
        /// Move to Main Form
        frmAtmMachine frm = new frmAtmMachine(accountId);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_depositActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        /// Button Back

        frmAtmMachine frm = new frmAtmMachine(accountId);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(frmCashDesposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCashDesposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCashDesposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCashDesposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCashDesposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_deposit;
    private javax.swing.JTextField inp_deposits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txt_accountName;
    private javax.swing.JLabel txt_accountNo;
    private javax.swing.JLabel txt_balance;
    // End of variables declaration//GEN-END:variables
}
