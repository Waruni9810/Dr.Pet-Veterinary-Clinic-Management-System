/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DBConnection;
import Model.Pharmacist_LoginDB;
import View.Pharmacist.Pharmacist_Dashboard;
import View.Pharmacist.Pharmacist_Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Pharmacist_LoginController {
    public static void login (String usName, String pass){
    try {
    String username = null; // initial value of the username
    String password = null; // initial value of the password
    
    ResultSet rs = new Pharmacist_LoginDB().searchLogin(usName);
    
   //Process the Query
   while (rs.next()){
   username = rs.getString("username"); //assign database login name to the variable
   
   password = rs.getString("password"); //assign databse password to the variable
   
    }
    if (username != null && password != null){
        if (password.equals (pass)) {
            System.out.println("Login Successfull");
            Pharmacist_Login.getFrames()[0].dispose();
                 
           new Pharmacist_Dashboard (username).setVisible(true); 
 
        } else {
        JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
        }
    } else {
    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
    }
    DBConnection.closeCon();
    } catch (SQLException ex){
    Logger.getLogger(Pharmacist_LoginController.class.getName()).log(Level.SEVERE,null,ex);}
}   
}
