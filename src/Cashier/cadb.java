/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cashier;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asela gayan
 */
public class cadb {
    
    public static Connection mycon(){//called the connection class
        Connection con = null;
        
           try{
               Class.forName("com.mysql.jdbc.Driver");//called the my sql connection
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
               
           }
           catch(Exception e ){
               System.out.println(e);
           }
        return null;
    }
    
}
    

