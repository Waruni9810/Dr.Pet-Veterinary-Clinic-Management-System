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
public class prescription_searchtable {
    Statement stmt;
    ResultSet rs; 

    
 public ResultSet searchprescription(String pres_no){
 try {
 stmt = DBConnection.getStatementConnection();
 rs=stmt.executeQuery("SELECT * FROM prescription WHERE pres_id='"+pres_no+"'");

 }

catch (Exception e){
  
 }
 return rs;
 }
     
}
