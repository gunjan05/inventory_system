/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse1;

import Logins.LoginPage;
import Options.Option_Tab;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aziz
 */
public class Warehouse_form extends javax.swing.JFrame {

    /**
     * Creates new form Warehouse_form
     */
    public Warehouse_form() {
        initComponents();
        createWarehouseTable();
        setDefaultCloseOperation(Warehouse_form.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        area = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        warcode = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Display = new javax.swing.JButton();
        wcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ptype = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        manager = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("City");

        Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/add1.png"))); // NOI18N
        Add.setText("Insert");
        Add.setBorderPainted(false);
        Add.setContentAreaFilled(false);
        Add.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Display Records of All Warehouses");

        jLabel10.setText("Enter Warehouse Code");

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/search1.png"))); // NOI18N
        Search.setBorderPainted(false);
        Search.setContentAreaFilled(false);
        Search.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Search");

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Warehouse");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Add New Warehouse");

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/back1.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Logout.setBackground(new java.awt.Color(153, 204, 255));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel2.setText("Warehouse Code");

        Display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/displayicon.png"))); // NOI18N
        Display.setBorderPainted(false);
        Display.setContentAreaFilled(false);
        Display.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        jLabel3.setText(" Manager Name");

        jLabel5.setText("Area Name");

        jLabel12.setText("Product Type");

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/Picture1.png"))); // NOI18N
        update.setText("Update");
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/delete.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.setBorderPainted(false);
        Delete.setContentAreaFilled(false);
        Delete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Add)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(76, 76, 76)
                                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ptype, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(46, 46, 46)
                                    .addComponent(wcode, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(110, 110, 110)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(manager)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(35, 35, 35)
                                .addComponent(warcode, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Delete)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Search)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addGap(209, 209, 209))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Logout))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(wcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)))
                                    .addComponent(Display)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel8))))
                    .addComponent(Back)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(warcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Search)
                                .addGap(18, 18, 18)
                                .addComponent(Delete))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6))
                                            .addGap(24, 24, 24)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(28, 28, 28)
                                            .addComponent(Add))))))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Option_Tab ot = new Option_Tab();
        ot.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed

        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        Warehouse_table wt = new Warehouse_table();
        wt.setVisible(true);
    }//GEN-LAST:event_DisplayActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_AddActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_SearchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_updateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_DeleteActionPerformed

    public void createWarehouseTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:IMS.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS WAREHOUSE45 (\n"
                + "	w_code TEXT PRIMARY KEY,\n"
                + "	product_type TEXT NOT NULL,\n"
                + "	area TEXT NOT NULL,\n"
                + "     city TEXT NOT NULL,\n"
                + "     manager TEXT NOT NULL"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            System.out.println("Warehouse table created successfully!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Warehouse table not created");
        }
    }
    
    public void insert(){
        String sql = "INSERT INTO WAREHOUSE45 VALUES(?,?,?,?,?)";
        
        String url = "jdbc:sqlite:IMS.db";
        System.out.println("In insert function");
        String wc = wcode.getText();
        String pt  = ptype.getText();
        String ar = area.getText();
        String ct = city.getText();
        String mg = manager.getText();
        
        
        try (Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, wc);
            pstmt.setString(2, pt);
            pstmt.setString(3, ar);
            pstmt.setString(4, ct);
            pstmt.setString(5, mg);


            pstmt.executeUpdate();
            System.out.println("Values Inserted ");
            JOptionPane.showMessageDialog(null,"Record Inserted Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            wcode.setText(null);
            ptype.setText(null);
            area.setText(null);
            city.setText(null);
            manager.setText(null);
        }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Please fill all information","Insertion Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            }
        }
    
    public void delete() {
        String wcid = warcode.getText();
        String sql = "DELETE FROM WAREHOUSE45 WHERE w_code = ?";
        String url = "jdbc:sqlite:IMS.db";
 
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, wcid);
            // execute the delecidte statement
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Info for Warehouse Code: "+wcid+" deleted!!","Delete Successful", JOptionPane.INFORMATION_MESSAGE);
            warcode.setText(null);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured!!","Delete Error", JOptionPane.ERROR_MESSAGE);
            warcode.setText(null);
        }
    }
    
     public void search(){
        String wcid = warcode.getText();
        String sql = "SELECT * FROM WAREHOUSE45 WHERE w_code like ? ";
        String url = "jdbc:sqlite:IMS.db";
        
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // set the value
            pstmt.setString(1,wcid);
            System.out.println(wcid);
            //
            ResultSet rs  = pstmt.executeQuery();
            String wc=rs.getString("w_code");
            String pt=rs.getString("product_type");
            String ar=rs.getString("area");
            String cty=rs.getString("city");
            String mange=rs.getString("manager");
            
            // loop through the result set
            if(pt!=null){
                JOptionPane.showMessageDialog(null,"Warehouse Code: "+wc+"\n"+"Product Type: "+pt+"\n"+"Area: "+ar+"\n"+"City: "+cty+"\n"+"Manager: "+mange,
                        "Record Found!!", JOptionPane.INFORMATION_MESSAGE);
                warcode.setText(null);
            }
            else if(pt==null){
                JOptionPane.showMessageDialog(null,"No Info Found for Warehouse "+wcid,"No Record Found!!", JOptionPane.ERROR_MESSAGE);
            }
          
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While Searching","Search Error", JOptionPane.ERROR_MESSAGE);
        }
       
        
    }
     
     public void Update(){
        System.out.println("In Update");
        String sql = "UPDATE WAREHOUSE45 SET product_type = ? , "
                + "area = ? ,"
                + "city = ? ,"
                + "manager = ? "
                + "WHERE w_code = ?";
        String url = "jdbc:sqlite:IMS.db";
        
        String wc = wcode.getText();
        String pt  = ptype.getText();
        String ar = area.getText();
        String ct = city.getText();
        String mg = manager.getText();
        
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, pt);
            pstmt.setString(2, ar);
            pstmt.setString(3, ct);
            pstmt.setString(4, mg);
            pstmt.setString(5, wc);
            // update 
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Updated Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            wcode.setText(null);
            ptype.setText(null);
            area.setText(null);
            city.setText(null);
            manager.setText(null);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While Updating","Update Error", JOptionPane.ERROR_MESSAGE);
            wcode.setText(null);
            ptype.setText(null);
            area.setText(null);
            city.setText(null);
            manager.setText(null);
            
        }
    }
    
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
            java.util.logging.Logger.getLogger(Warehouse_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warehouse_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warehouse_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warehouse_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warehouse_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Search;
    private javax.swing.JTextField area;
    private javax.swing.JTextField city;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField manager;
    private javax.swing.JTextField ptype;
    private javax.swing.JButton update;
    private javax.swing.JTextField warcode;
    private javax.swing.JTextField wcode;
    // End of variables declaration//GEN-END:variables
}
