/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Manegerlogin;

import Mainlogin.login;
import com.mysql.jdbc.Connection;
import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


import javax.swing.JOptionPane;




/**
 *
 * @author Asela gayan
 */
public class uregis extends javax.swing.JFrame {

    //called the connection
    Connection con = null ;
    PreparedStatement pst = null ;
    
    
    public uregis() {
        initComponents();
        
        con = (Connection) madb.mycon();//called the data base connection
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        TELE_txt = new javax.swing.JTextField();
        uname_txt = new javax.swing.JTextField();
        utype = new javax.swing.JComboBox<>();
        register_btn = new javax.swing.JButton();
        logi_btn = new javax.swing.JButton();
        pww_tet = new javax.swing.JPasswordField();
        confpww_tet = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 15, 69));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 5));

        jLabel1.setBackground(new java.awt.Color(19, 15, 69));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("REGISTATION FORM");

        menu_btn.setBackground(new java.awt.Color(19, 15, 69));
        menu_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        menu_btn.setForeground(new java.awt.Color(255, 0, 0));
        menu_btn.setText("GO TO MAIN MENU");
        menu_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        menu_btn.setName("menu_btn"); // NOI18N
        menu_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_btnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ID Number: (ID<9)");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Telephone Number: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Conform Pw:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Select User :");

        id_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id_txt.setName("id_txt"); // NOI18N

        TELE_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TELE_txt.setName("TELE_txt"); // NOI18N
        TELE_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELE_txtActionPerformed(evt);
            }
        });

        uname_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        uname_txt.setName("uname_txt"); // NOI18N
        uname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname_txtActionPerformed(evt);
            }
        });

        utype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT USER TYPE", "MANEGER", " " }));
        utype.setName(" utype"); // NOI18N

        register_btn.setBackground(new java.awt.Color(19, 15, 69));
        register_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photoes/reg12.png"))); // NOI18N
        register_btn.setBorder(null);
        register_btn.setName("register_btn"); // NOI18N
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        logi_btn.setBackground(new java.awt.Color(19, 15, 69));
        logi_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        logi_btn.setForeground(new java.awt.Color(255, 0, 0));
        logi_btn.setText("GO TO LOGIN PAGE");
        logi_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        logi_btn.setName("logi_btn"); // NOI18N
        logi_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logi_btnMouseClicked(evt);
            }
        });
        logi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logi_btnActionPerformed(evt);
            }
        });

        pww_tet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pww_tet.setName("pww_tet"); // NOI18N

        confpww_tet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confpww_tet.setName("confpww_tet"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(menu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_txt)
                            .addComponent(TELE_txt)
                            .addComponent(uname_txt)
                            .addComponent(pww_tet)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(utype, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(confpww_tet))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(menu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TELE_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(register_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pww_tet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confpww_tet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
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

    private void menu_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_btnMouseClicked
        // click the login button you can go login interface 
        login lo =new login();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_btnMouseClicked

    private void TELE_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELE_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TELE_txtActionPerformed

    private void uname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uname_txtActionPerformed
    
    
    
    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        //connection URL and connection name and pasword
         String JdbcURL = "jdbc:mysql://localhost:3306/registation_db?" + "autoReconnect=true&useSSL=false";
         String Username = "root";
         String password = "";
        
         //get the text field values
        String name = uname_txt.getText();
        String tele = TELE_txt.getText();
        String id = id_txt.getText();
        String pass =pww_tet.getText() ;
        String confpass = confpww_tet.getText();
        String ustype = utype.getSelectedItem().toString();
        
        //string convert to integer
        int id1 = Integer.parseInt(id);
        //use if - else loop
        //check the empty fields 
        if (name.trim().equals("") || tele.trim().equals("") || id.trim().equals("") || pass.trim().equals("") ||confpass.trim().equals("") || ustype.trim().equals("SELECT USER TYPE") ){
            JOptionPane.showMessageDialog(rootPane, "One or more Fields Empty");
            
        }
        //password corrct or incorrect
        else  if (!pass.equals(confpass)) {
               JOptionPane.showMessageDialog(rootPane, "Not match passwords");
             }  
        
        else {
            
        try {
            //called the connection
            Class.forName("com.mysql.jdbc.Driver");
            //Mysql connecton URl 
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
            //createstatement 
            Statement stm = (Statement) con.createStatement();
            //insert in to values into register table
            String Sql = "INSERT INTO REGISTER VALUES('"+name+"',"+id1+","+tele+",'"+ustype+"',"+pass+","+confpass+")";
            
            stm.executeUpdate(Sql);//update the register table
            //show the massege dialog box
            JOptionPane.showMessageDialog(this, "REGISTER SUCESSFULY");
            
            //set the txt fields empty
            uname_txt.setText("");
            TELE_txt.setText("");
            id_txt.setText("");
            pww_tet.setText("") ;
            confpww_tet.setText("") ;
            utype.setToolTipText("");
            uname_txt.requestFocus();
            con.close();//close connection
           
            
        } catch (Exception e) {
            System.out.println(e);
        
         }
        }
    
        
    }//GEN-LAST:event_register_btnActionPerformed

    private void logi_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logi_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logi_btnMouseClicked

    private void logi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logi_btnActionPerformed
        // go to malog jframe
        Malog ml = new Malog();
        ml.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_logi_btnActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(uregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uregis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TELE_txt;
    private javax.swing.JPasswordField confpww_tet;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logi_btn;
    private javax.swing.JButton menu_btn;
    private javax.swing.JPasswordField pww_tet;
    private javax.swing.JButton register_btn;
    private javax.swing.JTextField uname_txt;
    private javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
