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
public class Drug_AddRecord {
    Statement stmt;
    public void Form (String id , String name, String description, Integer price){
    try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("INSERT INTO drug_record VALUES ('"+id+"','"+name+"', '"+description+"','"+price+"')"); 
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
