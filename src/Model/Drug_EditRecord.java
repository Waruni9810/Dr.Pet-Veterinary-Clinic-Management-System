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
public class Drug_EditRecord {
    Statement stmt;
    public void Form (String id , String name, String description,Integer price){
          try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("UPDATE drug_record set name= '"+name+"', description ='"+description+"',price='"+price+"'where id='"+id+"'");
      
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
