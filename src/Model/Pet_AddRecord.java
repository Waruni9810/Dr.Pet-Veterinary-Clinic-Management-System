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
public class Pet_AddRecord {
    Statement stmt;
    public void Form (String id , String name, String category, String gender, String age,String owner_name,String owner_contactno){
    try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("INSERT INTO pet_record VALUES ('"+id+"','"+name+"', '"+category+"','"+gender+"','"+age+"','"+owner_name+"','"+owner_contactno+"')"); 
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
