
package Assignment2_200506074;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

/**
 *
 * @author Gurjeet
 */
public class Account {
 
    
    // Account Class variables
    
    private String AccountNumber;
    private double AccountBalance;
    private String AccountName;

  
    public Account(String AccountNumber, double AccountBalance, String AccountName) {
        
        setAccountNumber(AccountNumber);
        setAccountBalance(AccountBalance);
        setAccountName(AccountName);
        
    }

    //To String method
     public String toString(){
        return "Account Number: "+AccountNumber+" of "+AccountName+" has balance $"+AccountBalance;
    }
     
    
     // getter (Account Number)
     public String getAccountNumber() {
        return AccountNumber;
    }

     
    //Setter  (Account Number) 
    public boolean setAccountNumber(String AccountNumber) {
        
        if(AccountNumber.matches("[a-zA-Z0-9]*"))
        {
        this.AccountNumber= AccountNumber;
        return true;
        }
        
        else{
        
            throw new IllegalArgumentException("It is requested that please correct The Account Number");
             
        }
       
    }

    
    //Getter (Account Balance)
    public double getAccountBalance() {
        return AccountBalance;
    }

    
    //Setter method to check balance should not be a nagative
    public void setAccountBalance(double AccountBalance) {
       
       
        
        if(AccountBalance <0)
                {
                    throw new IllegalArgumentException("Please enter the valid Balance") ;
                }
        else{
           this.AccountBalance=AccountBalance;
        }
    }

    
    //Getter (Account Name)
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
