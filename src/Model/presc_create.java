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
public class presc_create {
    Statement stmt;
    public void Form (String pres_id, String channel_no, String  pet_name,String date,String desease_type,String description){
    try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("INSERT INTO prescription VALUES ('"+pres_id+"','"+channel_no+"', '"+pet_name+"','"+date+"', '"+desease_type+"','"+description+"')"); 
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
