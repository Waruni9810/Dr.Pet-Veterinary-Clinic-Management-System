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
public class Doctor_Searchtable {
    Statement stmt;
    ResultSet rs; 
    
 public ResultSet searchDoctor(){
 try {
 stmt = DBConnection.getStatementConnection();
 rs=stmt.executeQuery("SELECT * FROM doctor_record ");
 }
 
 //Execute the Query
 
catch (Exception e){
  
 }
 return rs;
 }
   
}
