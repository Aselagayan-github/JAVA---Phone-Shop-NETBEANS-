/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Member_Store_manege;

/**
 *
 * @author Asela gayan
 */
public class memberma {//member jframe text fields values get and set
    //get veriables
        String U_name;
        int id; 
        String Telephone;
        String pasword ;
        String Conform_password; 
        String user_type; 
        
       //get id se id 
     public int id(){
         return id;
     }
     
     public void id(int id){
       this.id=id;
     }
     //get name and set name
     public String U_name(){
         return U_name;
     }
     
     public void U_name(String U_name){
       this.U_name=U_name;
     }
     //get tele nu and set tele nu
    public String Telephone(){
         return Telephone;
     }
     public void Telephone(String Telephone){
       this.Telephone=Telephone;
     }
     //get password and set password
     public String pasword(){
         return pasword;
     }
     
     public void pasword(String pasword){
       this.pasword=pasword;
     } 
     //get conform password and set conform password
     public String Conform_password(){
         return Conform_password;
     }
     
     public void Conform_password(String Conform_password){
       this.Conform_password=Conform_password;
     } 
    
     //get user typr and set user type
     public String user_type(){
         return user_type;
     }
     
     public void user_type(String user_type){
       this.user_type=user_type;
     } 
}
