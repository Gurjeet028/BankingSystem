/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2_200393881;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

/**
 *
 * @author pujan
 */
public class Account {
 
    
    //Variable declared for Account Class
    
    private String AccountNumber;
    private double AccountBalance;
    private String AccountName;

  
    public Account(String AccountNumber, double AccountBalance, String AccountName) {
        
        setAccountNumber(AccountNumber);
        setAccountBalance(AccountBalance);
        setAccountName(AccountName);
        
    }

    //To String method to display user information
     public String toString(){
        return "Account Number: "+AccountNumber+" of "+AccountName+" has balance $"+AccountBalance;
    }
     
    
     //Used getter to get Account number
     public String getAccountNumber() {
        return AccountNumber;
    }

     
    //Setter method toverify Account Number 
    public boolean setAccountNumber(String AccountNumber) {
        
        if(AccountNumber.matches("[a-zA-Z0-9]*"))
        {
        this.AccountNumber= AccountNumber;
        return true;
        }
        
        else{
        
            throw new IllegalArgumentException("Please Correct The Account Number");
             
        }
       
    }

    
    //Getter Method for Account Balance
    public double getAccountBalance() {
        return AccountBalance;
    }

    
    //Setter method to check balance should not be a nagative
    public void setAccountBalance(double AccountBalance) {
       
       
        
        if(AccountBalance <0)
                {
                    throw new IllegalArgumentException("Please enter valid Balance") ;
                }
        else{
           this.AccountBalance=AccountBalance;
        }
    }

    
    //Getter Method for Account Name
    public String getAccountName() {
        return AccountName;
    }

    
    /* Setter Method which  allows user to
    contain alphabetical characters, as well as spaces and hyphens */
    
    public void setAccountName(String AccountName) {
       
      if(AccountName.matches("[a-zA-Z -]*"))
      {
 
       this.AccountName=AccountName;
      }
      else{
      throw new IllegalArgumentException("Enter Valid Name");
      }
      
    }
    
    
    
    
    
    
    
}
