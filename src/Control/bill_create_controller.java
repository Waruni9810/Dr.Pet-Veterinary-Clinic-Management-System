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
public class bill_create_controller {
   
    public static void Form(String biil_no,String date,Integer total) {
        new Model.Bill_AddRecord().Form(biil_no, date, total);
            JOptionPane.showMessageDialog(null, "New Bill has been created", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
      
 }
