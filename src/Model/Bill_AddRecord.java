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
public class Bill_AddRecord {
    Statement stmt;
    public void Form (String biil_no,String date,Integer total){
    try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("INSERT INTO bill VALUES ('"+biil_no+"','"+date+"', '"+total+"')"); 
    } catch (Exception e){
        e.printStackTrace();
    }}
}
    
