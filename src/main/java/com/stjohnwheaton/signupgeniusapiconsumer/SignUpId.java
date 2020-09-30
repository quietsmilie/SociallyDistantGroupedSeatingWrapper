/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stjohnwheaton.signupgeniusapiconsumer;

import com.stjohnwheaton.signupgeniusapiconsumer.SignUpGeniusAPIConsumer;
import javax.swing.JFrame;
/**
 *
 * @author Emilie Yonkers
 *         emilie.yonkers@gmail.com
 */
public class SignUpId extends javax.swing.JPanel {

    /**
     * Creates new form SignUpId
     */
    public SignUpId() {
        initComponents();
    }

    public static void main(String[] args)
    {
               javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
        private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame;
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SignUpId startForm = new SignUpId();
        startForm.validate();
        startForm.setVisible(true);
        frame.add(startForm);
        frame.validate();
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtSignUpId = new javax.swing.JTextField();
        lblSignUpId = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblApiKey = new javax.swing.JLabel();
        txtApiKey = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setName("topPanel"); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        txtSignUpId.setText("25184192");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 85, 0, 0);
        add(txtSignUpId, gridBagConstraints);

        lblSignUpId.setText("Enter SignUp ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 54, 0, 0);
        add(lblSignUpId, gridBagConstraints);

        btnSubmit.setText("Run");
        btnSubmit.setActionCommand("");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        btnSubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSubmitKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 16, 23, 0);
        add(btnSubmit, gridBagConstraints);

        btnCancel.setText("Cancel (TODO)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 40, 23, 31);
        add(btnCancel, gridBagConstraints);

        lblApiKey.setText("API Key / User Key");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 54, 0, 0);
        add(lblApiKey, gridBagConstraints);

        txtApiKey.setText("dTNkQkdKLzhsSVlMMXU2dWg2NTFHZz09");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 246;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 87, 0, 0);
        add(txtApiKey, gridBagConstraints);

        lblTitle.setText("St. John Wheaton Socially Distant Seating");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 31);
        add(lblTitle, gridBagConstraints);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        if (txtApiKey.getText() == "" || txtSignUpId.getText() == "")
        {
            // add error message
        }
        else
        {
            SignUpGeniusAPIConsumer sc = new SignUpGeniusAPIConsumer();
            sc.getDataFromAPI(txtSignUpId.getText(), txtApiKey.getText());
        }
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnSubmitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSubmitKeyReleased
        // TODO add your handling code here:
                if (txtApiKey.getText() == "" || txtSignUpId.getText() == "")
        {
            // add error message
        }
        else
        {
            SignUpGeniusAPIConsumer sc = new SignUpGeniusAPIConsumer();
            sc.getDataFromAPI(txtSignUpId.getText(), txtApiKey.getText());
        }
    }//GEN-LAST:event_btnSubmitKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnCancel;
    private static javax.swing.JButton btnSubmit;
    private static javax.swing.JLabel lblApiKey;
    private static javax.swing.JLabel lblSignUpId;
    private static javax.swing.JLabel lblTitle;
    private static javax.swing.JTextField txtApiKey;
    private static javax.swing.JTextField txtSignUpId;
    // End of variables declaration//GEN-END:variables
}
