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
public class channel_DeleteRecord {
    Statement stmt;
    public void Form (String iDNo){
    try{
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate
                ("Delete from channel where channel_no ='"+iDNo+"'"); 
    } catch (Exception e){
        e.printStackTrace();
    }}
}
