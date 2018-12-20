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



public class Bank {
    
    
            //BankName Variable
               String BankName;
    
           
            // pre-determined options for branch locations
              ArrayList<String> BranchLocation= new ArrayList<String>
              ( Arrays.asList("Barrie", "Toronto", "Markham",
                         "Mississauga", "Brmapton", "Windsor"));
              
             String BranchName;
    
            //Store Account
             
             ArrayList<Account> Accountlist = new ArrayList<Account>();
   
               Scanner sc=new Scanner(System.in);
             
             
              //Add Account into Account List
               
                 public void addAccount()
             {
                 System.out.println("Enter Account Name:");
                 String accountName=sc.nextLine();
                 
                 System.out.println("Enter Account Number:");
                 String accountNumber=sc.nextLine();
                 
                 System.out.println("Enter Account Balance:");
                 double accountBalance=Double.parseDouble(sc.nextLine());
                
                 //Create a new object which receive Account Number , Account Balance and Account Name from user
                 Account account = new Account(accountNumber, accountBalance, accountName);
                 
                 //Add Account to the AccountList and Display massage to user Successfully Added!!
             
                  Accountlist.add(account);
                  System.out.println("Account Added Suceessfuly!!");
             }
             
                   
         // View Accounts with All Informations
                 
   
            void ViewAccount()
                  {
      
                      System.out.println("Here is Your Accounts Details :");   
                      
                      for (Account account : Accountlist) {
			System.out.println(account);
		        }
                      System.out.println("*******************************");
                      
                   }
            
            //To String Method to return Welcome Message
            
               @Override
            public String toString()
            {
            return " Welcome to " +BranchName  +" branch of " +BankName;
            
            }
            
            
            //Settet Method for Bank Name

             public void setBankName(String BankName) {
               this.BankName = BankName;
              }

             public void setBranchName(String BranchName) {
             
                 if(BranchLocation.contains(BranchName)){
                 this.BranchName = BranchName;
                 }
                 else
                 {
                     System.out.println("Branch Name is Not in the List:");
                 }
               }
            
            
             //Method to get Number of Accounts
             public int getNumberofAccount()
             {
                return Accountlist.size();
             }
             
             //Sum of all Balance
             
             public double getSumofBalance()
             {
                 double sum=0;
                 for(Account account:Accountlist){
                 sum=sum+account.getAccountBalance();
                  }
                 return sum;
               
             }
             
            //Get Avg Of all Balance
             
             public double getAvgBalance()
             {
               double avg=0;
                //Get sum of balance
                double sum =getSumofBalance();
                
                //get Number of Account
                double num= getNumberofAccount();
                 
                avg=sum/num;
                return avg;
             
             }
              
             // Method to modify Account Details
             
              public void ModifyAccount(String AccountNumber)
              {
              
                  //Get the Specific Account which Associated with Account Number
                  
                  Account account = getAccount(AccountNumber);
                  
                  //Here Account doesn't exist in the Accountlist than display the massage
                  
                  if(account==null)
                  {
                      System.out.println("Please Check the Account Number, Try Again!!");
                      return;
                  }
                  
                  
                  //Here If Account will be exist in the AccountList Allows user to Change
                  
                   System.out.println("Your Account is : "+account);
                   System.out.println("What would you like to Change Today?");
                   System.out.println("Press 1: Account Name");
                   System.out.println("Press 2: Account Number");
                   System.out.println("Press 3: Account Balance");
                  
                   System.out.print("You entering: ");
                   
                   
                   Scanner sc=new Scanner(System.in);
                   char num= sc.nextLine().charAt(0);
                   
                   if(num=='1')
                   {
                       System.out.println("Please Enter The New Account Name :");
                       String accountName =sc.nextLine();
                        account.setAccountName(accountName);
                        if(true) 
                        System.out.println("Account Name updated successfully!");
                   
                   }
                   
                   else if(num=='2')
                   {
                        System.out.println("Please Enter The New Account Number :");
                        String accountNumber =sc.nextLine();
                        account.setAccountNumber(accountNumber);
                        if(true) 
                        System.out.println("Account Number updated successfully!");
                   
                   }
                   
              
                   else if(num=='3')
                   {
                        System.out.println("Please Enter The New Account Balance :");
                        double accountBalance =sc.nextDouble();
                        account.setAccountBalance(accountBalance);
                        if(true) 
                        System.out.println("Account Number updated successfully!");
                   
                   }
                   
                    else {
                          System.out.println("Invalid Number: Please try again!");
                         }
                   
              }
             
            
              //To get details of Account
            public void accountDetails(String AccountNumber) 
            {
                 //Get the Specific Account which Associated with Account Number
                  
                  Account account = getAccount(AccountNumber);
                  if(account == null)
                  {
                      System.out.println("There is no Account Exsist With This Account Number, Please Try Again!!!");
                      return;
                  }
                  else
                  {
                      System.out.println("Account Details For " +AccountNumber+ " Account Number:" +account);
                  }
            }
             
             //Allow user to delete Account 
            public void deleteAccount(String AccountNumber)
            {
                Account account =getAccount(AccountNumber);
                if(account ==null)
                {
                      System.out.println("There is no Account exist With This Account Number, Please Try Again!!!");
                      return;
                 }
                    
                  System.out.println("You are going To Delete " +account );
                  System.out.println("Are You Sure Want To Delete This Account: Yes/No");
                  
                  String delete=sc.nextLine();
                  
                  if(delete.equals("Yes"))
                      Accountlist.remove(account);
                     System.out.println("Accout Successfully Deleted");
                      return;
                  
                  
            
            }
            
            
            //A getAccount method to get a specific account by its account number
            
             public Account getAccount(String AccountNumber)
             {
                for(Account account:Accountlist){
                if(account.getAccountNumber().equals(AccountNumber))
                return account;
                  }
                 return null;
            
             }
             
             
           /* Ask the user what they would like to do next of the following options:
                   Add Account, View Accounts, Account Details, Modify Account,
                   Delete Account, Summary,Help  */
             
             public void options(){
             
                  System.out.println("To Perform Operations, Please Read the Instruction");
                  System.out.println("A.Add Account -- Type 'A'");
                  System.out.println("B.View Account -- Type 'B'");
                  System.out.println("C.Account Details -- Type 'view ACCOUNT_NUMBER details' ");
                  System.out.println("D.Modify Account -- Type 'modify ACCOUNT_NUMBER'");
                  System.out.println("E.Delete Account -- Type 'delete ACCOUNT_NUMBER'");
                  System.out.println("F.Help -- Type 'help'"); 
                  System.out.println("G.Summary -- Type 'Summary'"); 
                  
                  System.out.println("==================================================");
             
             }
             
             //Process the input enter by User in option
             
             public void userInput(String input)
             {
               String[] split = input.split(" ");
               
               //Now Call the method according to user input
               
               //Call addAccount Method for Add new Account
                
               if(input.equals("A"))
                   addAccount();
               
               //Call viewAccount Method for View Account
               else if(input.equals("B"))
                   ViewAccount();
               
               //Call AccountDetails for Display All Account Details
               else if(split[0].equals("view"))
                accountDetails(split[1]);
               
               
               //Call ModifyAccount Balance to Modify the Account
               else if(split[0].equals("modify"))
                ModifyAccount(split[1]);
               
               //Call Delete Account to remove account from list
               else if(split[0].equals("delete"))
                 deleteAccount(split[1]);
               
               //Call Help for user manual
               else if(split[0].equals("help"))
                 help();
              
               // Call summary to make Avg of Balance, Sum of balance and Total Number of Accounts
               else if(split[0].equals("summary"))
                 summary();
               
               
             
             }
                                  
                                   
   public void help()
   {
       System.out.println("**************** HELP *******************");
       System.out.println("-----------------------------------------");
                  System.out.println("Instruction Manual");
        System.out.println("-----------------------------------------");          
                  
                  System.out.println("A.Add Account -- Type 'A'");
                  System.out.println("B.View Account -- Type 'B'");
                  System.out.println("C.Account Details -- Type 'view ACCOUNT_NUMBER details' ");
                  System.out.println("D.Modify Account -- Type 'modify ACCOUNT_NUMBER'");
                  System.out.println("E.Delete Account -- Type 'delete ACCOUNT_NUMBER'");
                  System.out.println("F.Help -- Type 'help'"); 
                  System.out.println("G.Summary -- Type 'Summary'"); 
   
   
   }
             
   public void summary()
   {
       System.out.println("****************************************");
       System.out.println("This is the Summary Of All Account In The Banks");
       System.out.println("----------------------------------------");
       System.out.println("Total Numbers of Bank Account: " +getNumberofAccount());
       System.out.println("Sum of All Balance in Bank: " +getSumofBalance());
       System.out.println("Average Balance of All Accounts in Bank " +getAvgBalance());
      
   
   }

                                      
      
             
    
}
