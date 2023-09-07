/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manegerlogin;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Asela gayan
 */
public class madb {
    public static Connection mycon(){//create method for database connetion
        Connection con = null;
        //using try catch
           try{
               Class.forName("com.mysql.jdbc.Driver");//called the mysql connection
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registation_db","root","");
               
           }
           catch(Exception e ){
               System.out.println(e);
           }
        return null;//use retun value
    }
    
}
