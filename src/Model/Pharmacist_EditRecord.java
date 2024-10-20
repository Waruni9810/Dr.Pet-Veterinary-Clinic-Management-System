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
public class Pharmacist_EditRecord {
    Statement stmt;
    public void Form (String id , String name, String gender, String NIC,String contact, String username,String password){
          try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("UPDATE pharmacist_record set name= '"+name+"', gender ='"+gender+"',NIC='"+NIC+"',contact='"+contact+"',username='"+username+"',password='"+password+"' where id='"+id+"'");
      
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
