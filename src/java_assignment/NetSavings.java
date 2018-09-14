/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment;

/**
 *
 * @author May
 */
public class NetSavings extends InterestAccount{
    
     public NetSavings() {
        super();
        this.withdrawl_limit = 1000;
        System.out.println("Withdrawl limit set to:" + this.withdrawl_limit);
    }

    @Override
    public void AddInterest() {
        this.interest = this.interest + (this.current_balance * 0.5);
        System.out.println("Monthly Interest has been added: " + (this.current_balance * 0.5));
        this.current_balance = this.current_balance + this.interest;
    }   
    
}
