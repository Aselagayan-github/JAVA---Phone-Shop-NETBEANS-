/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cashier;

import java.sql.*;
import com.mysql.jdbc.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asela gayan
 */
public class dbhelper {//class name 
   public static Statement st;//use methods
   public static Connection conn;
   public static PreparedStatement getdata;
   static{
       
        try{//called try catch
        String url = "jdbc:mysql://localhost:3306/registation_db?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection(url,"root","");//called the drivermaneger
        
        st = (Statement) conn.createStatement();//create Statement
        getdata = conn.prepareStatement("select * from storem where brand = ? ");//select storem table get brand coloum details
        
        
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(dbhelper.class.getName()).log(Level.SEVERE, null, ex);
       }

       } 
    public static ResultSet getdata (String brand) throws SQLException{//create static methods
    getdata.setString(1, "%"+brand+"%");
       
    return getdata.executeQuery(); 
   
   
   } 
}

