/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DBConnection;
import Model.Doctor_LoginDB;
import View.Doctor.Doctor_Login;
import View.Doctor.doctordashboard;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Doctor_LoginController {
    public static void login (String usName, String pass){
    try {
    String username = null; // initial value of the username
    String password = null; // initial value of the password
    
    ResultSet rs = new Doctor_LoginDB().searchLogin(usName);
    
   //Process the Query
   while (rs.next()){
   username = rs.getString("d_username"); //assign database login name to the variable
   
   password = rs.getString("d_password"); //assign databse password to the variable
   
    }
    if (username != null && password != null){
        if (password.equals (pass)) {
            System.out.println("Login Successfull");
            Doctor_Login.getFrames()[0].dispose();
                 
           new doctordashboard(username).setVisible(true); 
 
        } else {
        JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
        new Doctor_Login().setVisible(true); 
        }
    } else {
    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
    new Doctor_Login().setVisible(true); 
    }
    DBConnection.closeCon();
    } catch (SQLException ex){
    Logger.getLogger(Doctor_LoginController.class.getName()).log(Level.SEVERE,null,ex);}
}   
}
