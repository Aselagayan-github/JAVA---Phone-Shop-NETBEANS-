/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Action;
/*import sql functions   */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.Component;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Asela gayan
 */
public class maclass {
     public void table_update(){    //jtable update
         int c;
         try {
            Class.forName("com.mysql.jdbc.Driver");//get mysql connection
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             Statement stm = (Statement) con.createStatement();
            String Sql = "SELECT * FROM REGISTER ";//register table get
            ResultSet rs = stm.executeQuery(Sql);
            ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
            c = rss.getColumnCount();
            con.close();

        } catch (Exception e) {
            System.out.println(e);

        }
     }
         
     void addm(){ // add member details
         
        String U_name = null;//get veriable
        int id1 = 0; 
        String Telephone = null;
        String pasword = null ;
        String Conform_password = null; 
        String user_type = null; 
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             Statement stm = (Statement) con.createStatement();
            String Sql = "INSERT INTO REGISTER VALUES('"+U_name+"',"+id1+","+Telephone+",'"+user_type+"',"+pasword+","+Conform_password+")";
           stm.executeUpdate(Sql);

             table_update(); //update the table
            con.close();
       
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
     
     }    
     
     void addc(){ // add deatils store
     try {
            Class.forName("com.mysql.jdbc.Driver");//get connection
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");//mysql connection url
            Statement stm = (Statement) con.createStatement();//create Statement
            String brand = null;
            String catagory = null;
            String id1 = null;
            String name = null;
            String price = null;
            String Sql = "INSERT INTO STOREM VALUES("+id1+",'"+brand+"','"+name+"','"+catagory+"',"+price+")";//insert storem table
            stm.executeUpdate(Sql);
            table_update();

            con.close();//connection close

        } catch (Exception e) {
            System.out.println(e);
        }
     
     }
     
     void editm(){//update member details
     try {
        String U_name = null;
        int id = 0; 
        String Telephone = null;
        String pasword = null ;
        String Conform_password = null; 
        String user_type = null;
           
            Class.forName("com.mysql.jdbc.Driver");//get mysql connection
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             
            String sql  ="UPDATE register set U_name = ? , Telephone =?,  user_type =?, password =?, Conform_password =? where id =? ";
            PreparedStatement pst = (PreparedStatement) con.prepareCall(sql);
            
           
            pst.setString(1, U_name);
            pst.setString(2,Telephone );
            pst.setString(3, user_type);
            pst.setString(4, pasword);
            pst.setString(5, Conform_password);
            pst.setInt(6, id);
            
        
            pst.executeUpdate();
            table_update();

            con.close();
   
        } catch (Exception e) {
            System.out.println(e);

        }
     }
     
    void editc(){// update storem table data 
    try {

            int id = 0 ;
            String brand = null ;
            String name = null ;
            String catagory = null; 
            String price = null ;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");

            String sql = "UPDATE storem set brand =?,name =?,price=?,catagory =? where id=?  ";
            PreparedStatement pst = (PreparedStatement) con.prepareCall(sql);

            pst.setString(1, brand);
            pst.setString(2,name);
            pst.setString(3, price);
            pst.setString(4, catagory);
            pst.setInt(5, id);

            pst.executeUpdate();
            table_update();

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    
    void deletem(Component rootPane){// delete register table data
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             
            String sql  ="delete  from register where id =? ";
            PreparedStatement pst = (PreparedStatement) con.prepareCall(sql);
            int id = 0;
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "RECORD DELETED !!!!");
            table_update();
            con.close();
             

        } catch (Exception e) {
            System.out.println(e);
    } 
    
    }
    
    void deletec(Component rootPane, PreparedStatement pst){ //delete storem table date
    try {
            int id = 0;
            int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WHANT DELETE RECORD","WARNING",JOptionPane.YES_NO_OPTION);
           if(dialogResult == JOptionPane.YES_OPTION)
             {
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             
            String sql  ="delete  from storem where id =? ";
            pst= (PreparedStatement) con.prepareCall(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "RECORD DELETED !!!!");
             table_update();
            con.close();
             }
            
        } catch (Exception e) {
            System.out.println(e);
    }               
    }
    
    void searchc(){// search record in storem table
       try {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
            java.sql.Statement stm = (java.sql.Statement) con.createStatement();
            String Sql = "SELECT * FROM  STOREM";
            ResultSet rs = stm.executeQuery(Sql);
            
           while(rs.next()){
            int id =rs.getInt("id");
            String brand = rs.getString("brand");
            String name = rs.getString("name");
            String catagory = rs.getString("catagory");
            String price = rs.getString("price");
            
           }
        } catch (Exception e) {
            System.out.println(e);
        }   
    
    }
         
    }
    

