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
public class Drug_EditController {
    public static void Form(String id , String name, String description,Integer price) {
        new Model.Drug_EditRecord().Form(id, name, description, price );
            JOptionPane.showMessageDialog(null, "Drug record has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
       
 }
