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
public class pet_EditRecord {
    Statement stmt;
    public void Form (String id , String name,String category,String gender, String age,String owner_name,String owner_contactno){
          try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("UPDATE pet_record set name ='"+name+"',category='"+category+"',gender='"+gender+"',age='"+age+"',owner_name='"+owner_name+"',owner_contactno='"+owner_contactno+"'where id='"+id+"'");
      
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
