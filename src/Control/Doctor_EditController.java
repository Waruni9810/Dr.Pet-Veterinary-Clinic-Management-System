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
public class Doctor_EditController {
    public static void Form(String d_id , String d_name, String d_gender, String d_NIC,String d_specialization,String d_experience,String d_contact, String d_room,String d_username,String d_password) {
        new Model.Doctor_EditRecord().Form(d_id, d_name, d_gender, d_NIC,d_specialization,d_experience,d_contact,d_room,d_username,d_password );
            JOptionPane.showMessageDialog(null, "User record has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
       
 }
