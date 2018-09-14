/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment;

import javax.swing.JOptionPane;

/**
 *
 * @author Maylen Medina
 */
public class ExceptionsAccount {
    
    public boolean isWithdrawlValid(double withdrawl_limit, int amount,
            double balance){
        
        //if statement to check if you have overdrawn more than limit
        if(amount > withdrawl_limit){
            JOptionPane.showMessageDialog(null,"You overdrawn!"
                    + "Please try again.\n");
            return false;
        }
        //else if statement to check if you are withdrawing more than what you have available
        else if(amount > balance){
            JOptionPane.showMessageDialog(null,"Sorry but your funds are not enough.");
            return false;
    
}
        return true;
    }    
    }
