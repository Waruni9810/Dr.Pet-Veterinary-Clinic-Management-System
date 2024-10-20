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
public class Drug_RegisterController {
    public static void Form(String id , String name, String description, Integer price) {
        new Model.Drug_AddRecord().Form(id, name, description, price);
            JOptionPane.showMessageDialog(null, "New drug item has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
        public static void deletedrug (String id){
       new Model.drug_DeleteRecord().Form(id);
       JOptionPane.showMessageDialog(null, "Drug has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
   }
        
 }
