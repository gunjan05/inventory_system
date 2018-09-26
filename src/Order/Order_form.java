/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;
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
public class Order_form extends javax.swing.JFrame {

    /**
     * Creates new form Order_form
     */
    public Order_form() {
        initComponents();
        createOrderTable();
        setDefaultCloseOperation(Order_form.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Order_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Item = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Display = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        oid = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Logout1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Cust = new javax.swing.JTextField();
        Sales = new javax.swing.JTextField();

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Add");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Add");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 460));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Orders");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Item Name");

        jLabel3.setText("Order ID");

        Item.setNextFocusableComponent(Quantity);

        jLabel4.setText("Quantity");

        Quantity.setNextFocusableComponent(date);

        jLabel5.setText("Date");

        date.setNextFocusableComponent(amount);

        jLabel6.setText("Amount");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Add New Order");

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
        jLabel8.setText("Display Records of All Orders");

        jLabel10.setText("Enter OrderID");

        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/search1.png"))); // NOI18N
        Search.setText("Search");
        Search.setBorderPainted(false);
        Search.setContentAreaFilled(false);
        Search.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        Delete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/back1.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Logout1.setBackground(new java.awt.Color(153, 204, 255));
        Logout1.setText("Logout");
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });

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

        jLabel12.setText("Customer ID");

        jLabel13.setText("Salesman ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(272, 272, 272)
                        .addComponent(Logout1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add)
                        .addGap(68, 68, 68)
                        .addComponent(update))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Item, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(Order_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cust)
                            .addComponent(Sales))))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Display)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32)
                        .addComponent(oid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search)
                            .addComponent(Delete))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Logout1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Order_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(Cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(Add))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Display)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(oid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addComponent(Search)
                                        .addGap(18, 18, 18)
                                        .addComponent(Delete))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(Back))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Option_Tab ot = new Option_Tab();
        ot.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed

        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        dispose();

    }//GEN-LAST:event_Logout1ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_DeleteActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        Order_table ot = new Order_table();
        ot.setVisible(true);
    }//GEN-LAST:event_DisplayActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_SearchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_updateActionPerformed

    public void createOrderTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:IMS.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS ORDER45(\n"
                + "	order_id TEXT PRIMARY KEY,\n"
                + "	item_name TEXT NOT NULL,\n"
                + "	quantity INTEGER NOT NULL,\n"
                + "     date TEXT NOT NULL,\n"
                + "     amount INTEGER NOT NULL,\n"
                + "     cid TEXT REFERENCES CUSTOMER45(cust_id) ON DELETE CASCADE,\n"
                + "     sid TEXT REFERENCES SALESAMN45(Salesman_ID) ON DELETE CASCADE"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Order table created successfully!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Order table not created");
        }
    } 
    
    public void insert(){
        String sql = "INSERT INTO ORDER45 VALUES(?,?,?,?,?,?,?)";
        
        String url = "jdbc:sqlite:IMS.db";
        
        String ord  = Order_Id.getText();
        String dt  = date.getText();
        String in = Item.getText();
        String amt = amount.getText();
        String qty = Quantity.getText();
        int quanty = Integer.parseInt(qty);
        int amut = Integer.parseInt(amt);
        String custid = Cust.getText();
        String salesid = Sales.getText();
        
        
        try (Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ord);
            pstmt.setString(2, in);
            pstmt.setInt(3, quanty);
            pstmt.setString(4, dt);
            pstmt.setInt(5, amut);
            pstmt.setString(6, custid);
            pstmt.setString(7, salesid);


            pstmt.executeUpdate();
            System.out.println("Values Inserted ");
            JOptionPane.showMessageDialog(null,"Record Inserted Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            Order_Id.setText(null);
            date.setText(null);
            Item.setText(null);
            amount.setText(null);
            Quantity.setText(null);
            Cust.setText(null);
            Sales.setText(null);
        }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Please fill all information","Insertion Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            }
        }
    
    public void delete() {
        String order_id = oid.getText();
        String sql = "DELETE FROM ORDER45 WHERE order_id = ?";
        String url = "jdbc:sqlite:IMS.db";
 
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, order_id);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Info for Order ID "+order_id+" deleted!!","Delete Successful", JOptionPane.INFORMATION_MESSAGE);
            oid.setText(null);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured!!","Delete Error", JOptionPane.ERROR_MESSAGE);
            oid.setText(null);
        }
    }
    
    public void search(){
        String orid = oid.getText();
        String sql = "SELECT * FROM ORDER45 WHERE order_id like ? ";
        String url = "jdbc:sqlite:IMS.db";
        
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            pstmt.setString(1,orid);
            System.out.println(orid);
         
            ResultSet rs  = pstmt.executeQuery();
            String od=rs.getString("order_id");
            String in=rs.getString("item_name");
            int qt=rs.getInt("quantity");
            String dt=rs.getString("date");
            int at=rs.getInt("amount");
            String custid = rs.getString("cid");
            String salesid = rs.getString("sid");
            if(orid!=null){
                JOptionPane.showMessageDialog(null,"Order ID: "+od+"\n"+"Item: "+in+"\n"+"Date: "+dt+"\n"+"Quantity: "+qt+"\n"+"Amount: "+at
                        ,"Record Found!!", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(orid==null){
                JOptionPane.showMessageDialog(null,"No Info Found for Order ID "+orid,"No Record Found!!", JOptionPane.ERROR_MESSAGE);
            }
            oid.setText(null);

          
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While Searching","Search Error", JOptionPane.ERROR_MESSAGE);
            oid.setText(null);

        }
       
        
    }
    
    public void Update(){
        System.out.println("In Update");
        String sql = "UPDATE ORDER45 SET item_name = ? , "
                + "quantity = ? ,"
                + "date = ? ,"
                + "amount = ? ,"
                + "cid = ? ,"
                + "sid = ? "
                + "WHERE order_id = ?";
        String url = "jdbc:sqlite:IMS.db";
        
        String in  = Order_Id.getText();
        String dt  = date.getText();
        String ord = Item.getText();
        String amt = amount.getText();
        String qty = Quantity.getText();
        int quanty = Integer.parseInt(qty);
        int amut = Integer.parseInt(amt);
        String custid = Cust.getText();
        String salesid = Sales.getText();
        
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, in);
            pstmt.setInt(2, quanty);
            pstmt.setString(3, dt);
            pstmt.setInt(4, amut);
            pstmt.setString(5, custid);
            pstmt.setString(6, salesid);
            pstmt.setString(7, ord);

            // update 
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Updated Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            Order_Id.setText(null);
            date.setText(null);
            Item.setText(null);
            amount.setText(null);
            Quantity.setText(null);
            Cust.setText(null);
            Sales.setText(null);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While updating","Update Error", JOptionPane.ERROR_MESSAGE);
            Order_Id.setText(null);
            date.setText(null);
            Item.setText(null);
            amount.setText(null);
            Quantity.setText(null);
            Cust.setText(null);
            Sales.setText(null);
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
            java.util.logging.Logger.getLogger(Order_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Cust;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JTextField Item;
    private javax.swing.JButton Logout1;
    private javax.swing.JTextField Order_Id;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Sales;
    private javax.swing.JButton Search;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField oid;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
