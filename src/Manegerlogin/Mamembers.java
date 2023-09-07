/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Manegerlogin;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asela gayan
 */
public class Mamembers extends javax.swing.JFrame {

    //called the connection and prepared statement
    Connection con = null ;
    PreparedStatement pst = null ;
    
    public Mamembers() {
        initComponents();
        
        con = (Connection) madb.mycon();//called the connection class
        table_update();//called the table update
    }

 
    @SuppressWarnings("unchecked")
    
    
    public void table_update(){//create method update the table
       int c;//use veriable
       
        try {//using try-catch 
            Class.forName("com.mysql.jdbc.Driver"); //get the connetion
            //connection URL
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             Statement stm = (Statement) con.createStatement();//create Statement
            String Sql = "SELECT * FROM REGISTER ";//using select query
            ResultSet rs = stm.executeQuery(Sql);
            ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
            c = rss.getColumnCount();
           //get table model and set table to the data
            DefaultTableModel df = ( DefaultTableModel )regi_tbl.getModel();
            df.setRowCount(0);
            
            while(rs.next())//using while loop
            {
              Vector v2 = new Vector();
              for(int a =1 ;a<=c; a++)//using for loop
              {
               v2.add(rs.getString("U_name"));
               v2.add(rs.getString("id"));
               v2.add(rs.getString("Telephone"));
               v2.add(rs.getString("user_type"));
               v2.add(rs.getString("password"));
               v2.add(rs.getString("Conform_password"));
                    
              }
            df.addRow(v2);
            }
            
            
            //set the text fields are empty
            na_txt.setText("");
            tele_txt.setText("");
            id_txt.setText("");
            pw_txt.setText("") ;
            conpw_txt.setText("") ;
             //close the connection
            con.close();
            
            
            
            
        } catch (Exception e) {
            System.out.println(e);
            
        
        }
    
    }
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        conpw_txt = new javax.swing.JTextField();
        na_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tele_txt = new javax.swing.JTextField();
        users_type = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pw_txt = new javax.swing.JTextField();
        ADD_btn = new javax.swing.JButton();
        EDIT_btn = new javax.swing.JButton();
        DELETE_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        regi_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 15, 69));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));

        jPanel2.setBackground(new java.awt.Color(19, 15, 69));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ID Number:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Telephone:");

        conpw_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        conpw_txt.setName("conpw_txt"); // NOI18N

        na_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        na_txt.setName("na_txt"); // NOI18N

        id_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id_txt.setName("id_txt"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("User type:");

        tele_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tele_txt.setName("tele_txt"); // NOI18N

        users_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Maneger", "Cashier", "Customer" }));
        users_type.setName("users_type"); // NOI18N
        users_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                users_typeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Conform Pw:");

        pw_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pw_txt.setName("pw_txt"); // NOI18N

        ADD_btn.setBackground(new java.awt.Color(255, 0, 0));
        ADD_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ADD_btn.setText("ADD");
        ADD_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 15, 69)));
        ADD_btn.setName("ADD_btn"); // NOI18N
        ADD_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_btnActionPerformed(evt);
            }
        });

        EDIT_btn.setBackground(new java.awt.Color(255, 0, 0));
        EDIT_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EDIT_btn.setText("EDIT");
        EDIT_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 15, 69)));
        EDIT_btn.setName("EDIT_btn"); // NOI18N
        EDIT_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIT_btnActionPerformed(evt);
            }
        });

        DELETE_btn.setBackground(new java.awt.Color(255, 0, 0));
        DELETE_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DELETE_btn.setText("DELETE");
        DELETE_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 15, 69)));
        DELETE_btn.setName("DELETE_btn"); // NOI18N
        DELETE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tele_txt))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(na_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(id_txt))))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(users_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pw_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(conpw_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DELETE_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(EDIT_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADD_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(na_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pw_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ADD_btn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDIT_btn)
                    .addComponent(conpw_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tele_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(users_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DELETE_btn))
                .addContainerGap())
        );

        jButton3.setBackground(new java.awt.Color(19, 15, 69));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("GO TO MANEGER MENU");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 15, 69), 2));
        jButton3.setName("MENU_btn"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3MAINMENU_btnActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        regi_tbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        regi_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "U_name", "id", "Telephone", "User_type", "password", "conform_password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        regi_tbl.setName("regi_tbl"); // NOI18N
        regi_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regi_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(regi_tbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MAINMENU_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3MAINMENU_btnActionPerformed
        //click menu button you can go to minterface jframe
        MInterface mi  =new MInterface();
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MAINMENU_btnActionPerformed

    private void users_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_users_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_users_typeActionPerformed

    private void ADD_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_btnActionPerformed
        // TODO add your handling code here:
        
        String JdbcURL = "jdbc:mysql://localhost:3306/registation_db?" + "autoReconnect=true&useSSL=false";
        String Username = "root";
        String password = "";
        
        //get the text fields data
        String U_name = na_txt.getText();
        String id = id_txt.getText();
        String Telephone = tele_txt.getText();
        String pasword = pw_txt.getText();
        String Conform_password = conpw_txt.getText();
        String user_type = users_type.getSelectedItem().toString();
        
        int id1 = Integer.parseInt(id);
        
        //check the empty fields 
        if (U_name.trim().equals("") || id.trim().equals("") || Telephone.trim().equals("") || pasword.trim().equals("")
                ||Conform_password.trim().equals("") || user_type.trim().equals("Select User Type") ){
            JOptionPane.showMessageDialog(rootPane, "One or more Fields Empty");
            
        }
        //if password equal to conform password
        else  if (!pasword.equals(Conform_password)) {
               JOptionPane.showMessageDialog(rootPane, "Not match passwords");
             }   
        else {
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             Statement stm = (Statement) con.createStatement();
             //using insert register table values
            String Sql = "INSERT INTO REGISTER VALUES('"+U_name+"',"+id1+","+Telephone+",'"+user_type+"',"+pasword+","+Conform_password+")";
            stm.executeUpdate(Sql);//update sql table
            //sucessfull massege
            JOptionPane.showMessageDialog(rootPane, "RECORD ADDEDDDD !!!!");
             table_update();//j table update
            
            //set the empty text fields
            na_txt.setText("");
            tele_txt.setText("");
            id_txt.setText("");
            pw_txt.setText("") ;
            conpw_txt.setText("") ;
             users_type.setSelectedItem("");
            con.close();
       
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
        }
        
    }//GEN-LAST:event_ADD_btnActionPerformed

    private void regi_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regi_tblMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel df = ( DefaultTableModel )regi_tbl.getModel();
        int selectedIndex = regi_tbl.getSelectedRow();
        
        na_txt.setText(df.getValueAt(selectedIndex, 0).toString());
        id_txt.setText(df.getValueAt(selectedIndex, 1).toString());
        tele_txt.setText(df.getValueAt(selectedIndex, 2).toString());
        users_type.setSelectedItem(df.getValueAt(selectedIndex, 3).toString());
        pw_txt.setText(df.getValueAt(selectedIndex, 4).toString());
        conpw_txt.setText(df.getValueAt(selectedIndex, 5).toString());
         
        
    }//GEN-LAST:event_regi_tblMouseClicked

    private void EDIT_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIT_btnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel df = ( DefaultTableModel )regi_tbl.getModel();
        int selectedIndex = regi_tbl.getSelectedRow();
        //update the register table values
         try {
             //get the text field data 
             int id = Integer.parseInt(df.getValueAt(selectedIndex,1 ).toString());
             String U_name = na_txt.getText();                                                                                               
             String Telephone = tele_txt.getText();
             String pasword = pw_txt.getText();
             String Conform_password = conpw_txt.getText();
             String user_type = users_type.getSelectedItem().toString();
     
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
            //using update stucture  
            String sql  ="UPDATE register set U_name = ? , Telephone =?,  user_type =?, password =?, Conform_password =? where id =? ";
            pst= (PreparedStatement) con.prepareCall(sql);
            
           
            pst.setString(1, U_name);
            pst.setString(2,Telephone );
            pst.setString(3, user_type);
            pst.setString(4, pasword);
            pst.setString(5, Conform_password);
            pst.setInt(6, id);
            
        
            pst.executeUpdate();//update the register table
            
            JOptionPane.showMessageDialog(rootPane, "RECORD Updated !!!!");
             table_update();//update the jtable
            
            
            na_txt.setText("");
            tele_txt.setText("");
            id_txt.setText("");
            pw_txt.setText("") ;
            conpw_txt.setText("") ;
             users_type.setSelectedItem("");
            con.close();
   
        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_EDIT_btnActionPerformed

    private void DELETE_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE_btnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel df = ( DefaultTableModel )regi_tbl.getModel();
        int selectedIndex = regi_tbl.getSelectedRow();
        //delete register table records
        
         try {
             //get id value
             int id = Integer.parseInt(df.getValueAt(selectedIndex,1 ).toString());
             int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WHANT DELETE RECORD","WARNING",JOptionPane.YES_NO_OPTION);
             //use yes no option massege
             if(dialogResult == JOptionPane.YES_OPTION)
             {
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             //using delete the record inthe register table 
            String sql  ="delete  from register where id =? ";
            pst= (PreparedStatement) con.prepareCall(sql);
            
  
            pst.setInt(1, id);
            pst.executeUpdate();//update the register table
            
            JOptionPane.showMessageDialog(rootPane, "RECORD DELETED !!!!");
             table_update();
                     
            na_txt.setText("");
            tele_txt.setText("");
            id_txt.setText("");
            pw_txt.setText("") ;
            conpw_txt.setText("") ;
             users_type.setSelectedItem("");
             na_txt.requestFocus();
             
            con.close();
             }

        } catch (Exception e) {
            System.out.println(e);
    }                         
        
    }//GEN-LAST:event_DELETE_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Mamembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mamembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mamembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mamembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mamembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_btn;
    private javax.swing.JButton DELETE_btn;
    private javax.swing.JButton EDIT_btn;
    private javax.swing.JTextField conpw_txt;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField na_txt;
    private javax.swing.JTextField pw_txt;
    private javax.swing.JTable regi_tbl;
    private javax.swing.JTextField tele_txt;
    private javax.swing.JComboBox<String> users_type;
    // End of variables declaration//GEN-END:variables
}
