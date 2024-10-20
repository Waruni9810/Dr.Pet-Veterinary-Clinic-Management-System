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
public class Receptionist_AddRecord {
    Statement stmt;
    public void Form (String r_id , String r_name, String r_gender, String r_NIC,String r_contact,String r_username,String r_password){
    try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("INSERT INTO receptionist_record VALUES ('"+r_id+"','"+r_name+"', '"+r_gender+"','"+r_NIC+"','"+r_contact+"','"+r_username+"','"+r_password+"')"); 
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
