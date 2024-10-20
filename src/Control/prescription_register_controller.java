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
public class prescription_register_controller {
    public static void Form(String pres_id, String channel_no, String  pet_name,String date,String desease_type,String description) {
        new Model.presc_create().Form(pres_id, channel_no,  pet_name,date,desease_type,description);
            JOptionPane.showMessageDialog(null, "New prescription has been created", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
          
 }
