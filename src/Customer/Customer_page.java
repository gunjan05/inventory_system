
package Customer;
import Logins.LoginPage;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import Options.Option_Tab;

public class Customer_page extends javax.swing.JFrame {

    String cust_type;
    public Customer_page() {
        initComponents();
        createCustomerTable();
        setDefaultCloseOperation(Customer_page.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        Silver = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        AddVal = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        SearchVal = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cust_id = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        Gold = new javax.swing.JRadioButton();
        pltn = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        custId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        contact_no = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Sil = new javax.swing.JRadioButton();
        update = new javax.swing.JButton();

        Silver.setText("Silver");
        Silver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilverActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("Customer");

        AddVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddVal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/add1.png"))); // NOI18N
        AddVal.setText("Insert");
        AddVal.setBorderPainted(false);
        AddVal.setContentAreaFilled(false);
        AddVal.setMargin(new java.awt.Insets(0, 0, 0, 0));
        AddVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddValActionPerformed(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/delete.png"))); // NOI18N
        Delete.setBorderPainted(false);
        Delete.setContentAreaFilled(false);
        Delete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
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

        SearchVal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/search1.png"))); // NOI18N
        SearchVal.setBorderPainted(false);
        SearchVal.setContentAreaFilled(false);
        SearchVal.setMargin(new java.awt.Insets(0, 0, 0, 0));
        SearchVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchValActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(153, 204, 255));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer ID");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel6.setText("City");

        cust_id.setNextFocusableComponent(fname);

        fname.setNextFocusableComponent(lname);

        lname.setNextFocusableComponent(city);

        city.setNextFocusableComponent(contact_no);

        Gold.setText("Gold");
        Gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoldActionPerformed(evt);
            }
        });

        pltn.setText("Platinum");
        pltn.setNextFocusableComponent(AddVal);
        pltn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pltnActionPerformed(evt);
            }
        });

        jLabel7.setText("Select Customer Type:-");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Add Customer");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Display Records of All Customers");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Search");

        jLabel10.setText("Enter CustomerID");

        custId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIdActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Delete");

        jLabel12.setText("Contact No.");

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/back1.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Sil.setText("Silver");
        Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(217, 217, 217)
                .addComponent(Logout)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cust_id)
                                    .addComponent(fname)
                                    .addComponent(lname)
                                    .addComponent(city)
                                    .addComponent(contact_no, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddVal)
                                .addGap(56, 56, 56)
                                .addComponent(update))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Gold)
                                .addGap(30, 30, 30)
                                .addComponent(Sil)
                                .addGap(27, 27, 27)
                                .addComponent(pltn)))
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchVal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(custId, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Logout)
                    .addComponent(Back))
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cust_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gold)
                            .addComponent(Sil)
                            .addComponent(pltn))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddVal)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Display)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(custId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel9)
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Delete)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel11)))
                                        .addGap(16, 16, 16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(SearchVal)))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed

        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_LogoutActionPerformed

    private void GoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoldActionPerformed
 
        cust_type = "Gold";
    }//GEN-LAST:event_GoldActionPerformed

    private void SilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilverActionPerformed
        
         cust_type = "Silver";
    }//GEN-LAST:event_SilverActionPerformed

    private void pltnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pltnActionPerformed
        
         cust_type = "Platinum";
    }//GEN-LAST:event_pltnActionPerformed

    private void AddValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddValActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_AddValActionPerformed

    private void SearchValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchValActionPerformed
        // TODO add your handling code here:
        search();
        
    }//GEN-LAST:event_SearchValActionPerformed

    private void custIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custIdActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        Customer_Table tf = new Customer_Table();
        tf.setVisible(true);
    }//GEN-LAST:event_DisplayActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_DeleteActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Option_Tab ot = new Option_Tab();
        ot.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilActionPerformed
        // TODO add your handling code here:
        cust_type = "Silver";
    }//GEN-LAST:event_SilActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_updateActionPerformed
    
    public void createCustomerTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:IMS.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS CUSTOMER45 (\n"
                + "	cust_id TEXT PRIMARY KEY,\n"
                + "	fname TEXT NOT NULL,\n"
                + "	lname TEXT NOT NULL,\n"
                + "     city TEXT NOT NULL,\n"
                + "     contact_no INTEGER NOT NULL,\n"
                + "     cust_type TEXT NOT NULL\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            System.out.println("Customer table created successfully!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Customer table not created");
        }
    } //Creates Customer Table if not exists
    
    public void insert(){
        String sql = "INSERT INTO CUSTOMER45 VALUES(?,?,?,?,?,?)";
        
        String url = "jdbc:sqlite:IMS.db";
        System.out.println("In insert function");
        String cid = cust_id.getText();
        String fn  = fname.getText();
        String ln = lname.getText();
        String ct = city.getText();
        String cno = contact_no.getText();
        int contact = Integer.parseInt(cno);
        
        try (Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cid);
            pstmt.setString(2, fn);
            pstmt.setString(3, ln);
            pstmt.setString(4, ct);
            pstmt.setInt(5, contact);
            pstmt.setString(6, cust_type);

            pstmt.executeUpdate();
            System.out.println("Values Inserted ");
            JOptionPane.showMessageDialog(null,"Record Inserted Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            cust_id.setText(null);
            fname.setText(null);
            lname.setText(null);
            city.setText(null);
            contact_no.setText(null);
        }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Please fill all information","Insertion Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            }
        }
       
    public void delete() {
        String cid = custId.getText();
        String sql = "DELETE FROM CUSTOMER45 WHERE cust_id = ?";
        String url = "jdbc:sqlite:IMS.db";
 
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            
            pstmt.setString(1, cid);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Info for Customer ID "+cid+" deleted!!","Delete Successful", JOptionPane.INFORMATION_MESSAGE); 
            custId.setText(null);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured!!","Delete Error", JOptionPane.ERROR_MESSAGE);
            custId.setText(null);
        }
    }
    
    public void search(){
        String cid = custId.getText();
        String sql = "SELECT * FROM CUSTOMER45 WHERE cust_id like ? ";
        String url = "jdbc:sqlite:IMS.db";
        
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            pstmt.setString(1,cid);
            System.out.println(cid);
            ResultSet rs  = pstmt.executeQuery();
            String fn=rs.getString("fname");
            String ln=rs.getString("lname");
            String ct=rs.getString("city");
            int contct = rs.getInt("contact_no");
            String ctype =rs.getString("cust_type");
            
            if(fn!=null){
                JOptionPane.showMessageDialog(null,"Name: "+fn+" "+ln+"\nC-ID "+cid+"\n"+"City: "+ct+"\n"+"Contact_No: "+contct+"\n"+"Customer Type: "+ctype
                        ,"Record Found!!", JOptionPane.INFORMATION_MESSAGE);
            custId.setText(null);
            }
            else if(fn==null){
                JOptionPane.showMessageDialog(null,"No Info Found for Customer ID "+cid,"No Record Found!!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While Searching","Search Error", JOptionPane.ERROR_MESSAGE);
            custId.setText(null);
        }
       
        
    }
    
    public void Update(){
        System.out.println("In Update");
        String sql = "UPDATE CUSTOMER45 SET fname = ? , "
                + "lname = ? ,"
                + "city = ? ,"
                + "contact_no = ? ,"
                + "cust_type = ? "
                + "WHERE cust_id = ?";
        
        String url = "jdbc:sqlite:IMS.db";
        
        String cid = cust_id.getText();
        String fn  = fname.getText();
        String ln = lname.getText();
        String ct = city.getText();
        String cno = contact_no.getText();
        int contact = Integer.parseInt(cno);
        
        
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, fn);
            pstmt.setString(2, ln);
            pstmt.setString(3, ct);
            pstmt.setInt(4, contact);
            pstmt.setString(5, cust_type);
            pstmt.setString(6, cid);

            // update 
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Updated Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            cust_id.setText(null);
            fname.setText(null);
            lname.setText(null);
            city.setText(null);
            contact_no.setText(null);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Some Error Occured While updating","Update Error", JOptionPane.ERROR_MESSAGE);
            cust_id.setText(null);
            fname.setText(null);
            lname.setText(null);
            city.setText(null);
            contact_no.setText(null);
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
            java.util.logging.Logger.getLogger(Customer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_page().setVisible(true);
            }
        });
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVal;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JRadioButton Gold;
    private javax.swing.JButton Logout;
    private javax.swing.JButton SearchVal;
    private javax.swing.JRadioButton Sil;
    private javax.swing.JRadioButton Silver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField city;
    private javax.swing.JTextField contact_no;
    private javax.swing.JTextField custId;
    private javax.swing.JTextField cust_id;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton pltn;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
