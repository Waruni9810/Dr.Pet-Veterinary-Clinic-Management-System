/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DBConnection;
import Model.Receptionist_LoginDB;
import View.Receptionist.Receptionist_Dashboard;
import View.Receptionist.Receptionist_Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Receptionist_LoginController {
    public static void login (String usName, String pass){
    try {
    String username = null; // initial value of the username
    String password = null; // initial value of the password
    ResultSet rs = new Receptionist_LoginDB().searchLogin(usName);
    
   //Process the Query
   while (rs.next()){
   username = rs.getString("r_username"); //assign database login name to the variable
   
   password = rs.getString("r_password"); //assign databse password to the variable
   
    }
    if (username != null && password != null){
        if (password.equals (pass)) {
            System.out.println("Login Successfull");
            Receptionist_Login.getFrames()[0].dispose();
                 
           new Receptionist_Dashboard(username).setVisible(true); 
 
        } else {
        JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
        }
    } else {
    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error",JOptionPane.ERROR_MESSAGE);
    }
    DBConnection.closeCon();
    } catch (SQLException ex){
    Logger.getLogger(Receptionist_LoginController.class.getName()).log(Level.SEVERE,null,ex);}
}   
}
