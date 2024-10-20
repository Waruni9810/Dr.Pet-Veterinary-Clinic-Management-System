/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTextField;
/**
 *
 * @author student.lab1
 */
public class Dr_Channel_Searchtable {
    Statement stmt;
    ResultSet rs; 
    
 public ResultSet searchchannel(String room_no){
 try {
 stmt = DBConnection.getStatementConnection();
 rs=stmt.executeQuery("SELECT * FROM channel WHERE room_no='"+room_no+"'");

 }
 
 //Execute the Query
 
catch (Exception e){
  
 }
 return rs;
 }

    public ResultSet searchchannel(JTextField Idtxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
