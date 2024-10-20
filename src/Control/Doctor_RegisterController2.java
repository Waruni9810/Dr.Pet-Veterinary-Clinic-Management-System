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
public class Doctor_RegisterController2 {
    public static void Form(String d_id , String d_name, String d_gender, String d_NIC,String d_specialization,String d_experience,String d_contact, String d_room,String d_username,String d_password) {
        new Model.Doctor_AddRecord().Form(d_id, d_name, d_gender, d_NIC,d_specialization,d_experience,d_contact,d_room,d_username,d_password );
            JOptionPane.showMessageDialog(null, "New User has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
        public static void deletedoctor (String id){
       new Model.Dr_DeleteRecord().Form(id);
       JOptionPane.showMessageDialog(null, "User has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
   }
        
 }
