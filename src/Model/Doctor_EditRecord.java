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
public class Doctor_EditRecord {
    Statement stmt;
    public void Form (String d_id , String d_name, String d_gender, String d_NIC,String d_specialization,String d_experience,String d_contact, String d_room,String d_username,String d_password ){
          try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("UPDATE doctor_record set d_name= '"+d_name+"', d_gender ='"+d_gender+"',d_NIC='"+d_NIC+"',d_specialization='"+d_specialization+"',d_experience='"+d_experience+"',d_contact='"+d_contact+"',d_room='"+d_room+"',d_username='"+d_username+"',d_password='"+d_password+"' where d_id='"+d_id+"'");
      
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
