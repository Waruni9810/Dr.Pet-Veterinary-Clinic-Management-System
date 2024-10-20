/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Statement;
/**
 *
 * @author student.lab1
 */
public class Receptionist_EditRecord {
    Statement stmt;
    public void Form (String r_id , String r_name, String r_gender, String r_NIC,String r_contact, String r_username,String r_password){
          try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("UPDATE receptionist_record set r_name= '"+r_name+"', r_gender ='"+r_gender+"',r_NIC='"+r_NIC+"',r_contact='"+r_contact+"',r_username='"+r_username+"',r_password='"+r_password+"' where r_id='"+r_id+"'");
      
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
