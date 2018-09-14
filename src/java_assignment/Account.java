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
public abstract class Account extends ExceptionsAccount{
    
    boolean withdrawl;
    protected double current_balance;
    protected double withdrawl_limit;
    
    
    
    public Account(){
        //withdrawl limit initially unlimited
        withdrawl = false;
        this.withdrawl_limit = 9999999;
        this.current_balance = 10000;
        System.out.println("A new account has been opened!");
        System.out.println("Current balance: " + this.current_balance +"\n");   
    }
    
    public void CheckBalance(){
        System.out.println(this.current_balance);
    }
    
    public void Deposit(){
        Scanner input = new Scanner(System.in);
        int deposit = input.nextInt();
        this.current_balance = this.current_balance + deposit;
    }
    
    public void Withdraw(int withdraw_amount){
        
        int twenty_note = 0;
        int fifty_note = 0;
        int hundread_note = 0;
        //int withdraw_amount;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How much would you like to withdraw: ");
        withdraw_amount = input.nextInt();
        
        //withdraw money using as little notes as possible
        if(withdraw_amount <= this.withdrawl_limit){
            
            this.current_balance = this.current_balance - withdraw_amount;
            
            while(withdraw_amount > 0){
                  withdraw_amount = withdraw_amount - 20;
                  twenty_note++;
             }
        
            if(withdraw_amount == -10){
                   twenty_note = twenty_note - 3;
                   fifty_note++;
             }
        
            if(fifty_note / 2 != 0){
                 hundread_note = fifty_note / 2;
                 fifty_note = fifty_note - ((fifty_note / 2) * 2);
             }
        
            if(twenty_note / 5 != 0){
                hundread_note = twenty_note / 5;
                twenty_note = twenty_note - ((twenty_note/5) * 5);
            }
        
            System.out.println("Hundread note: " + hundread_note);
            System.out.println("fifty note: " + fifty_note);
            System.out.println("twenty note: " + twenty_note);
            
            withdrawl = true;
            
        }else{
            System.out.println("Sorry can't withdraw! Withdrawl limit has been met!");
        }
        
    }
    
  
          
}
