/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;



/**
 *

 */
public class prescription_searchController {
    public static void Form(String pres_no) {
        new Model.prescription_searchtable().searchprescription(pres_no);
           
    }
    
      
        
 }
