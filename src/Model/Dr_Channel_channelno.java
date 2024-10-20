/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author student.lab1
 */
public class Dr_Channel_channelno {
    Statement stmt;
    ResultSet rs; 
    
 public ResultSet searchchannel(String channel_no){
 try {
 stmt = DBConnection.getStatementConnection();
 rs=stmt.executeQuery("SELECT * FROM channel WHERE channel_no='"+channel_no+"'");

 }
 
 //Execute the Query
 
catch (Exception e){
  
 }
 return rs;
 }
   
}
