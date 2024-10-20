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
public class Pet_RegisterController {
    public static void Form(String id , String name, String category, String gender, String age,String owner_name,String owner_contactno) {
        new Model.Pet_AddRecord().Form(id, name, category, gender, age,owner_name,owner_contactno );
            JOptionPane.showMessageDialog(null, "New Pet has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
        public static void deletepet (String id){
       new Model.pet_DeleteRecord().Form(id);
       JOptionPane.showMessageDialog(null, "Pet has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
   }
        
 }
