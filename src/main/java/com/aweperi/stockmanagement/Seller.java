/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aweperi.stockmanagement;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Emmanuel Adiba
 */
public class Seller extends javax.swing.JFrame {

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private final DatabaseConnection databaseConnection = new DatabaseConnection();
    private int sellerId;
    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        selectSeller();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sellerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sellerPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sellerGender = new javax.swing.JComboBox<>();
        addSeller = new javax.swing.JButton();
        editSeller = new javax.swing.JButton();
        deleteSeller = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellersTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        productsLink = new javax.swing.JLabel();
        categoriesLink = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("MANAGE SELLERS");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sellerName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerName.setForeground(new java.awt.Color(255, 102, 0));
        sellerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("NAME");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("PASSWORD");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sellerPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerPassword.setForeground(new java.awt.Color(255, 102, 0));
        sellerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerPasswordActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Gender");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sellerGender.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerGender.setForeground(new java.awt.Color(255, 102, 0));
        sellerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        addSeller.setBackground(new java.awt.Color(255, 102, 0));
        addSeller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addSeller.setForeground(new java.awt.Color(255, 255, 255));
        addSeller.setText("Add");
        addSeller.setBorder(null);
        addSeller.setBorderPainted(false);
        addSeller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSellerMouseClicked(evt);
            }
        });
        addSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSellerActionPerformed(evt);
            }
        });

        editSeller.setBackground(new java.awt.Color(255, 102, 0));
        editSeller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editSeller.setForeground(new java.awt.Color(255, 255, 255));
        editSeller.setText("Edit");
        editSeller.setBorder(null);
        editSeller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editSeller.setMaximumSize(new java.awt.Dimension(60, 30));
        editSeller.setMinimumSize(new java.awt.Dimension(60, 30));
        editSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSellerMouseClicked(evt);
            }
        });

        deleteSeller.setBackground(new java.awt.Color(255, 102, 0));
        deleteSeller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deleteSeller.setForeground(new java.awt.Color(255, 255, 255));
        deleteSeller.setText("Delete");
        deleteSeller.setBorder(null);
        deleteSeller.setBorderPainted(false);
        deleteSeller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSellerMouseClicked(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(255, 102, 0));
        clearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.setBorder(null);
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.setMaximumSize(new java.awt.Dimension(60, 30));
        clearBtn.setMinimumSize(new java.awt.Dimension(60, 30));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        sellersTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sellersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER", "CREATED ON", "LAST LOGIN"
            }
        ));
        sellersTable.setGridColor(new java.awt.Color(255, 102, 0));
        sellersTable.setPreferredSize(new java.awt.Dimension(500, 125));
        sellersTable.setRowHeight(25);
        sellersTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        sellersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        sellersTable.setShowGrid(false);
        sellersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellersTable);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("SELLERS LIST");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(addSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(editSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(deleteSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sellerPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(sellerName))
                                .addGap(65, 65, 65)
                                .addComponent(jLabel9)
                                .addGap(48, 48, 48)
                                .addComponent(sellerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sellerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        closeBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("X");
        closeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        productsLink.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        productsLink.setForeground(new java.awt.Color(255, 255, 255));
        productsLink.setText("PRODUCTS");
        productsLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productsLink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productsLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsLinkMouseClicked(evt);
            }
        });

        categoriesLink.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        categoriesLink.setForeground(new java.awt.Color(255, 255, 255));
        categoriesLink.setText("CATEGORIES");
        categoriesLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoriesLink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        categoriesLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriesLinkMouseClicked(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoriesLink)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productsLink)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(categoriesLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productsLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void selectSeller() {
        try {
            conn = databaseConnection.connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM root.sellers");
            sellersTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void addSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSellerActionPerformed

    private void sellerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerPasswordActionPerformed

    private void sellerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerNameActionPerformed

    private void addSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSellerMouseClicked
        try {
            if(sellerName.getText().isEmpty() || sellerPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Missing Field");
                System.out.println("Missing field");
            } else {
                PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO root.sellers(seller_name, seller_password, " +
                        "seller_gender, created_on) values (?,?,?,?)");
                preparedStatement.setString(1, sellerName.getText());
                preparedStatement.setString(2, sellerPassword.getText());
                preparedStatement.setString(3, Objects.requireNonNull(sellerGender.getSelectedItem()).toString());
                preparedStatement.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
                int row = preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Seller Added Successfully");
                System.out.println("Seller Added Successfully");
                conn.close();
                selectSeller();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_addSellerMouseClicked

    private void sellersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) sellersTable.getModel();
        int index = sellersTable.getSelectedRow();
        sellerId = Integer.parseInt(model.getValueAt(index, 0).toString());
        sellerName.setText(model.getValueAt(index, 1).toString());
        sellerPassword.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_sellersTableMouseClicked

    private void editSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSellerMouseClicked
        try {
            if(sellerName.getText().isEmpty() || sellerPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Missing Field");
                System.out.println("Missing field");
            } else {
                conn = databaseConnection.connect();
                String updateQuery = "UPDATE root.sellers SET seller_name ='" + sellerName.getText() +
                        "'"+",seller_password='" + sellerPassword.getText() +"'"+", seller_gender='" +
                        Objects.requireNonNull(sellerGender.getSelectedItem()) + "'" + " where seller_id=" + sellerId;
                        stmt = conn.createStatement();
                        stmt.executeUpdate(updateQuery);
                        JOptionPane.showMessageDialog(this, "Seller Updated");
                        System.out.println("Seller Updated Successfully");
                selectSeller();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editSellerMouseClicked

    private void deleteSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSellerMouseClicked
        try {
            if(sellerName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Add Seller To Be Deleted");
            } else {
                conn = databaseConnection.connect();

                String deleteQuery = "DELETE FROM root.sellers WHERE seller_id = " + sellerId;
                stmt = conn.createStatement();
                stmt.executeUpdate(deleteQuery);
                sellerName.setText("");
                sellerPassword.setText("");
                selectSeller();
                JOptionPane.showMessageDialog(this, "Seller Deleted Successfully");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_deleteSellerMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        sellerName.setText("");
        sellerPassword.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void productsLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLinkMouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productsLinkMouseClicked

    private void categoriesLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriesLinkMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoriesLinkMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSeller;
    private javax.swing.JLabel categoriesLink;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JButton deleteSeller;
    private javax.swing.JButton editSeller;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JLabel productsLink;
    private javax.swing.JComboBox<String> sellerGender;
    private javax.swing.JTextField sellerName;
    private javax.swing.JTextField sellerPassword;
    private javax.swing.JTable sellersTable;
    // End of variables declaration//GEN-END:variables
}
