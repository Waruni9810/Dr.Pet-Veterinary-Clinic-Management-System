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
public class Channel_Add {
    Statement stmt;
    public void Form (String channel_no , String dr_name, String pet_name, String room_no, String date,String channel_fee){
    try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("INSERT INTO channel VALUES ('"+channel_no+"','"+dr_name+"', '"+pet_name+"','"+room_no+"','"+date+"','"+channel_fee+"')"); 
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
