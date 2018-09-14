/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment;

import java.util.Scanner;

/**
 *
 * @author May
 */
public class Saving extends InterestAccount {
 
    public Saving( ) {
        super();
        this.withdrawl_limit = 1000;
        System.out.println("Withdrawl limit set to:" + this.withdrawl_limit);
    }

    public void ChangeLimit(){
        Scanner input = new Scanner(System.in);
        this.withdrawl_limit = input.nextDouble();
        System.out.print("Enter new withdrawl limit:" + this.withdrawl_limit);
    }
    
    @Override
    public void AddInterest() {
        this.interest = this.interest + (this.current_balance * 0.015);
        System.out.println("Daily Interest has been added: " + (this.current_balance * 0.015));
        this.current_balance = this.current_balance + this.interest;

    }
    
    
}
