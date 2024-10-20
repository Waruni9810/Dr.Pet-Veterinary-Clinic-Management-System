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
public class Pharmacist_RegisterController {
    public static void Form(String id , String name, String gender, String NIC,String contact,String username,String password) {
        new Model.Pharmacist_AddRecord().Form(id, name, gender, NIC,contact,username,password );
            JOptionPane.showMessageDialog(null, "New User has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
        public static void deletePharmacist (String id){
       new Model.Pharmacist_DeleteRecord().Form(id);
       JOptionPane.showMessageDialog(null, "User has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
   }
        
 }
