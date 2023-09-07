/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Action;

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
public class stclass extends maclass {
   @Override
   public void table_update(){//update storem table data
    
    int c;
    
     try {
            Class.forName("com.mysql.jdbc.Driver");//get java mysql connection
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
            Statement stm = (Statement) con.createStatement();
            String Sql = "SELECT * FROM  STOREM";//select storem table
            ResultSet rs = stm.executeQuery(Sql);
            
            ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
            c = rss.getColumnCount();
            con.close();//connection close
            
        } catch (Exception e) {
            System.out.println(e);
        }
   }
   
   @Override
   void  addc(){//add data in store table 
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
            Statement stm = (Statement) con.createStatement();
            String brand = null;
            String catagory = null;
            String id1 = null;
            String name = null;
            String price = null;
            String Sql = "INSERT INTO STOREM VALUES("+id1+",'"+brand+"','"+name+"','"+catagory+"',"+price+")";//insert data sstorem table
            stm.executeUpdate(Sql);
            table_update();

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
   }
   
   @Override
   void editc(){ // update 
    try {

            int id = 0 ;
            String brand = null ;
            String name = null ;
            String catagory = null; 
            String price = null ;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");

            String sql = "UPDATE storem set brand =?,name =?,price=?,catagory =? where id=?  ";//update storem table details
            PreparedStatement pst = (PreparedStatement) con.prepareCall(sql);

            pst.setString(1, brand);
            pst.setString(2,name);
            pst.setString(3, price);
            pst.setString(4, catagory);
            pst.setInt(5, id);

            pst.executeUpdate();
            table_update();

            con.close();//connection close

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
   
   @Override
   void deletec(Component rootPane, PreparedStatement pst){//delete data in storem table
    try {
            int id = 0;
            int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WHANT DELETE RECORD","WARNING",JOptionPane.YES_NO_OPTION);//error massege
            if(dialogResult == JOptionPane.YES_OPTION)//option massege
             {
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
             
            String sql  ="delete  from storem where id =? ";
            pst= (PreparedStatement) con.prepareCall(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "RECORD DELETED !!!!");//delete record show  massege
             table_update();
            con.close();
             }
            
        } catch (Exception e) {
            System.out.println(e);
    }               
    }
   
   @Override
   void searchc(){//search in storem table
       try {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
            java.sql.Statement stm = (java.sql.Statement) con.createStatement();
            String Sql = "SELECT * FROM  STOREM";//select the storem table
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
   
