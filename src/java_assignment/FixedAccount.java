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
public class FixedAccount extends InterestAccount{
    
    public FixedAccount() {
        super();
    }

    @Override
    public void AddInterest() {
        //check to see if contract with interest is still true
        if(withdrawl == false){
             this.interest = this.interest + (this.current_balance * 0.7);
             System.out.println("Contract Interest has been added: " + (this.current_balance * 0.07));
             this.current_balance = this.current_balance + this.interest;
        }else{
            System.out.println("No interested added. User has breached contracted by withdrawing money");
        }
    }    
    
}
