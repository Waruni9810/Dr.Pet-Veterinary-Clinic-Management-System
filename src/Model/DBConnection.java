/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class DBConnection {
     static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection(){
    try{
//Establish the connection    
    String url = "jdbc:mysql://localhost:3306/dr_pet";
    conn = DriverManager.getConnection(url,"root","");
//Create the connection   
    stat = conn.createStatement();
    
    } catch (Exception e){
    e.printStackTrace();
    }
    return stat;
    }
//Close the connection
    public static void closeCon() throws SQLException{
    conn.close();
    }
}
