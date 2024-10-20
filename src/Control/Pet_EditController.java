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
public class Pet_EditController {
    public static void Form(String id , String name,String category,String gender, String age,String owner_name,String owner_contactno) {
        new Model.pet_EditRecord().Form(id, name, category, gender, age,owner_name,owner_contactno);
            JOptionPane.showMessageDialog(null, "User record has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
       
 }
