/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JOptionPane;

/**
 *

 */
public class Pharmacist_EditController {
    public static void Form(String id , String name, String gender, String NIC,String contact, String username,String password) {
        new Model.Pharmacist_EditRecord().Form(id, name, gender, NIC,contact,username,password );
            JOptionPane.showMessageDialog(null, "User record has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
       
 }
