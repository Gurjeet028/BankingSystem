/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2_200393881;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pujan
 */
public class Runner{
    
       
     public static void main(String[] args) {
        
         
         
         //Create Bank Object
         Bank bank= new Bank();
         Scanner sc= new Scanner(System.in);
         
         //Read the user input for Bank Name
         System.out.println("Please Enter Bank Name:");
         String bankName=sc.nextLine();
         bank.setBankName(bankName);
         System.out.println("=================================");
         while (true) {             
             
               //Read the user input for Branch Name
               for(String str: bank.BranchLocation){
                   System.out.println(str);
               }
               System.out.println("===============================");
               
               
               //Insert Branch Name form User
               System.out.println("Please Enter Branch Name");
               String branchName=sc.nextLine();
               bank.setBranchName(branchName);
               break;
             
         }
         
        //Welcome Message
         System.out.println("============================");
         System.out.println("Welcome to "+bank.BranchName  +" Branch of " +bankName);
         
         //Ask the user what they would like to do next of the following options
         System.out.println("============================");
         System.out.println(" What would you Like to do Today? ");
         bank.options();
         
         
         //Read The commands from user to perform operation
         
         while (true) {
            System.out.println("Type Option: ");
            String input = sc.nextLine();
             bank.userInput(input);
        }
         
    }
}    

