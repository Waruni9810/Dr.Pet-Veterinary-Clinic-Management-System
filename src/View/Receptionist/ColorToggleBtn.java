/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Receptionist;

import View.Doctor.*;
import Design.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JToggleButton;

/**
 *
 * @author Deshan Asanka
 */
public class ColorToggleBtn extends JToggleButton {
    public void paintComponent(Graphics g){
        Color bg,text;
        
        if(isSelected()){
            bg = Color.decode("#FF3300");
            text = Color.decode("#ffffff");
        }else{
            bg = Color.decode("#24B547");
            text = Color.decode("#ffffff");
        }
        setBackground(bg);
        setForeground(text);
        super.paintComponent(g);
        
    }
    
    
}
