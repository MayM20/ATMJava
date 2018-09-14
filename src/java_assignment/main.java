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
public class main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        
        int account_choice;
        int menu_choice;
        
        //print choice for user input
        System.out.println("Please select account to create:");
        System.out.println("1.Savings");
        System.out.println("2.NetSavings");
        System.out.println("3.FixedAccount");
        System.out.println("4.ChequeAccount");
        
        Scanner input = new Scanner(System.in);
        
        account_choice = input.nextInt();
        
        if(account_choice == 1){
            Saving saving = new Saving();
            menu.PrintMenu();
            System.out.println("6.Change withdrawl limit");
            
            menu_choice = input.nextInt();
            
            while(menu_choice != 5){
                
                if(menu_choice == 1){
                    saving.CheckBalance();
                }else if(menu_choice == 2){
                    //saving.Withdraw();
                }else if(menu_choice == 3){
                    saving.Deposit();
                }else if(menu_choice == 4){
                    saving.AddInterest();
                }else if(menu_choice == 5){
                    System.out.println("Exiting program");
                }else if(menu_choice == 6){
                    saving.ChangeLimit();
                }else{
                    System.out.println("Invalid input");
                }
                
                menu.PrintMenu();
                menu_choice = input.nextInt();
                
            }
            
            
        }else if(account_choice == 2){
            NetSavings netSavings = new NetSavings();
            menu.PrintMenu();
            
            menu_choice = input.nextInt();
            
            while(menu_choice != 5){
                
                if(menu_choice == 1){
                    netSavings.CheckBalance();
                }else if(menu_choice == 2){
                    //netSavings.Withdraw();
                }else if(menu_choice == 3){
                    netSavings.Deposit();
                }else if(menu_choice == 4){
                    netSavings.AddInterest();
                }else if(menu_choice == 5){
                    System.out.println("Exiting program");
                }else{
                    System.out.println("Invalid choice");
                }
                
                menu.PrintMenu();
                menu_choice = input.nextInt();
            }
            
        }else if(account_choice == 3){
            FixedAccount fixedAccount = new FixedAccount();
            menu.PrintMenu();
            menu_choice = input.nextInt();
            
            while(menu_choice != 5){
                
                if(menu_choice == 1){
                    fixedAccount.CheckBalance();
                }else if(menu_choice == 2){
                    //fixedAccount.Withdraw();
                }else if(menu_choice == 3){
                    fixedAccount.Deposit();
                }else if(menu_choice == 4){
                    fixedAccount.AddInterest();
                }else if(menu_choice == 5){
                    System.out.println("Exiting program");
                }else{
                    System.out.println("Invalid choice");
                }
                
                menu.PrintMenu();
                menu_choice = input.nextInt();
            }            
            
            
        }else if(account_choice == 4){
            Cheque cheque = new Cheque();
            menu.PrintMenu();
            menu_choice = input.nextInt();
            
            while(menu_choice != 5){
                
                if(menu_choice == 1){
                    cheque.CheckBalance();
                }else if(menu_choice == 2){
                    //cheque.Withdraw();
                }else if(menu_choice == 3){
                    cheque.Deposit();
                }else if(menu_choice == 4){
                    System.out.println("Cheque accounts have no interest");
                }else if(menu_choice == 5){
                    System.out.println("Exiting program");
                }else{
                    System.out.println("Invalid choice");
                }
                
                menu.PrintMenu();
                menu_choice = input.nextInt();
            }                        
        }else{
            System.out.println("Invalid choice. Please enter 1,2,3 OR 4");
        }
        
        
        
    }
    
}
