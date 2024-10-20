/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Dr_Channel_Searchtable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *

 */
public class channel_controller {
   
    public static void Form(String channel_no , String dr_name, String pet_name, String room_no, String date,String channel_fee) {
        new Model.Channel_Add().Form(channel_no, dr_name, pet_name, room_no, date,channel_fee);

 
            JOptionPane.showMessageDialog(null, "New channel has been created", "Successfull", JOptionPane.INFORMATION_MESSAGE);

  
    }
    
        public static void deletechannel (String id){
       new Model.channel_DeleteRecord().Form(id);
       JOptionPane.showMessageDialog(null, "Channel has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
   }
        
 }
