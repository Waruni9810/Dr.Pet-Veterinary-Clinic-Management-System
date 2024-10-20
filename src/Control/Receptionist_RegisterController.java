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
public class Receptionist_RegisterController {
    public static void Form(String r_id , String r_name, String r_gender, String r_NIC,String r_contact,String r_username,String r_password) {
        new Model.Receptionist_AddRecord().Form(r_id, r_name, r_gender, r_NIC,r_contact,r_username,r_password );
            JOptionPane.showMessageDialog(null, "New User has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
        public static void deleteReceptionist (String id){
       new Model.Receptionist_DeleteRecord().Form(id);
       JOptionPane.showMessageDialog(null, "User has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
   }
        
 }
