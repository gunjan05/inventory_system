/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salesman;
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
public class Salesman_form extends javax.swing.JFrame {

    /**
     * Creates new form Salesman_form
     */
    public Salesman_form() {
        initComponents();
        setDefaultCloseOperation(Salesman_form.DISPOSE_ON_CLOSE);
        createSalesmanTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        AddVal = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        sales_id = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        Rate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        wcode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Salesman");
        jLabel1.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Add New Salesman");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Salesman ID");

        jLabel3.setText("Full Name");

        jLabel4.setText("Salary");

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/back1.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setFocusable(false);
        Back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(153, 204, 255));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        AddVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddVal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/add1.png"))); // NOI18N
        AddVal.setText("Insert");
        AddVal.setBorderPainted(false);
        AddVal.setContentAreaFilled(false);
        AddVal.setMargin(new java.awt.Insets(2, 2, 2, 2));
        AddVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddValActionPerformed(evt);
            }
        });

        Display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/displayicon.png"))); // NOI18N
        Display.setBorderPainted(false);
        Display.setContentAreaFilled(false);
        Display.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Display Records of All Salesman");

        jLabel10.setText("Enter Salesman ID");

        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/search1.png"))); // NOI18N
        Search.setText("Search");
        Search.setBorderPainted(false);
        Search.setContentAreaFilled(false);
        Search.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Search.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/delete.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.setBorderPainted(false);
        Delete.setContentAreaFilled(false);
        Delete.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Rating");

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

        Rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateActionPerformed(evt);
            }
        });

        jLabel6.setText("Warehouse Code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(77, 77, 77)
                                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(salary, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(wcode))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(AddVal)
                                .addGap(18, 18, 18)
                                .addComponent(update))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(112, 112, 112)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Display)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sales_id, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Delete)
                            .addComponent(Search))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246)
                .addComponent(Logout)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Back)
                    .addComponent(Logout))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(wcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddVal)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Display)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(sales_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Search)
                        .addGap(18, 18, 18)
                        .addComponent(Delete)))
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void AddValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddValActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_AddValActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        Salesman_table tf = new Salesman_table();
        tf.setVisible(true);
    }//GEN-LAST:event_DisplayActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_DeleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_updateActionPerformed

    private void RateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RateActionPerformed

    public void createSalesmanTable(){
        // SQLite connection string
        String url = "jdbc:sqlite:IMS.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS SALESMAN45(\n"
                + "	Salesman_ID TEXT PRIMARY KEY,\n"
                + "	Name TEXT NOT NULL,\n"
                + "	Salary INTEGER NOT NULL,\n"
                + "     Rating INTEGER NOT NULL,\n"
                + "     wcode TEXT NOT NULL,"
                + "     FOREIGN KEY(wcode) REFERENCES WAREHOUSE45(w_code)"
                + "     ON DELETE CASCADE"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            System.out.println("Salesman table created successfully!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Salesman table not created");
        }
    }
    
    public void insert(){
        String sql = "INSERT INTO SALESMAN45 VALUES(?,?,?,?,?)";
        
        String url = "jdbc:sqlite:IMS.db";
        System.out.println("In insert function");
        String Salid = sid.getText();
        String fname  = name.getText();
        String sal  = salary.getText();
        int salay = Integer.parseInt(sal);
        String rat = Rate.getText();
        int Rating = Integer.parseInt(rat);
        String wc = wcode.getText();
        
        try (Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Salid);
            pstmt.setString(2, fname);
            pstmt.setInt(3, salay);
            pstmt.setInt(4, Rating);
            pstmt.setString(5,wc);

            pstmt.executeUpdate();
            System.out.println("Values Inserted ");
            JOptionPane.showMessageDialog(null,"Record Inserted Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            sid.setText(null);
            name.setText(null);
            salary.setText(null);
            Rate.setText(null);
            wcode.setText(null);
        }   catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Please fill all information","Insertion Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            }
        }
    
    public void delete() {
        String sid = sales_id.getText();
        String sql = "DELETE FROM SALESMAN45 WHERE Salesman_ID = ?";
        String url = "jdbc:sqlite:IMS.db";
 
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, sid);
            // execute the delete statement
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Info for Salesman ID "+sid+" deleted!!","Delete Successful", JOptionPane.INFORMATION_MESSAGE);
            sales_id.setText(null);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured!!","Delete Error", JOptionPane.ERROR_MESSAGE);
            sales_id.setText(null);
        }
    }
    
    public void search(){
        String sid = sales_id.getText();
        String sql = "SELECT * FROM SALESMAN45 WHERE Salesman_ID like ? ";
        String url = "jdbc:sqlite:IMS.db";
        
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            pstmt.setString(1,sid);
            ResultSet rs  = pstmt.executeQuery();
            String fn=rs.getString("Name");
            int sal=rs.getInt("Salary");
            int rt=rs.getInt("Rating");
            String wc = rs.getString("wcode");
            
            if(sid!=null){
                JOptionPane.showMessageDialog(null,"Salesman ID: "+sid+"\n"+"Name: "+fn+"\n"+"Salary: "+sal+"\n"+"Rating: "+rt+"\n"+"Warehouse Code: "+wc
                        ,"Record Found!!", JOptionPane.INFORMATION_MESSAGE);
                sales_id.setText(null);
            }
            else if(sid==null){
                JOptionPane.showMessageDialog(null,"No Info Found for Salesman ID "+sid,"No Record Found!!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While Searching","Search Error", JOptionPane.ERROR_MESSAGE);
            sales_id.setText(null);
        }
       
        
    }
    
    public void Update(){
        System.out.println("In Update");
        String sql = "UPDATE SALESMAN45 SET Name = ? , "
                + "Salary = ? ,"
                + "Rating = ? ,"
                + "wcode = ? "
                + "WHERE Salesman_ID = ?";
        
        String url = "jdbc:sqlite:IMS.db";
        
        String SID  = sid.getText();
        String nm  = name.getText();
        String sal = salary.getText();
        String rating = Rate.getText();
        String wc = wcode.getText();
        int salay = Integer.parseInt(sal);
        int Rating = Integer.parseInt(rating);
        
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, nm);
            pstmt.setInt(2, salay);
            pstmt.setInt(3, Rating);
            pstmt.setString(4, wc);
            pstmt.setString(5, SID);

            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Updated Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            sid.setText(null);
            name.setText(null);
            salary.setText(null);
            Rate.setText(null);
            wcode.setText(null);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While updating","Update Error", JOptionPane.ERROR_MESSAGE);
            sid.setText(null);
            name.setText(null);
            salary.setText(null);
            Rate.setText(null);
            wcode.setText(null);
            
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
            java.util.logging.Logger.getLogger(Salesman_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salesman_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salesman_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salesman_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salesman_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVal;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField Rate;
    private javax.swing.JButton Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField sales_id;
    private javax.swing.JTextField sid;
    private javax.swing.JButton update;
    private javax.swing.JTextField wcode;
    // End of variables declaration//GEN-END:variables
}
