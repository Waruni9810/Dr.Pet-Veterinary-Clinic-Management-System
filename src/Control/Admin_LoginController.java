/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Admin_LoginDB;
import Model.DBConnection;
import View.Admin.Admin_Dashboard;
import View.Admin.Admin_Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Admin_LoginController {
 public static void login (String usName, String pass){
    try {
    String username = null; // initial value of the username
    String password = null; // initial value of the password
    
    ResultSet rs = new Admin_LoginDB().searchLogin(usName);
    
   //Process the Query
   while (rs.next()){
   username = rs.getString("username"); //assign database login name to the variable
   
   password = rs.getString("password"); //assign databse password to the variable
   
    }
    if (username != null && password != null){
        if (password.equals (pass)) {
            System.out.println("Login Successfull");
            Admin_Login.getFrames()[0].dispose();
                 
           new Admin_Dashboard(username).setVisible(true); 
 
        } else {
        JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
        }
    } else {
    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
    }
    DBConnection.closeCon();
    } catch (SQLException ex){
    Logger.getLogger(Admin_LoginController.class.getName()).log(Level.SEVERE,null,ex);}
}   
}
