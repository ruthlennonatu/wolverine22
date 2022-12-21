/**
 * @author Eoghan L00159026
 * @version 1.0.0
 *A bank account has a balance that can be changed by 
 *deposits and withdrawals.
 */
public class SampleBankAccount
{  
	private double balance; 

   /**
    *Constructs a bank account with a zero balance.
    */
       public SampleBankAccount()
      {  
         balance = 0;
      }
   
   /**
    *Constructs a bank account with a given balance.
    *@param initialBalance the initial balance
    */ 
       public SampleBankAccount(double initialBalance)
      {  
         balance = initialBalance;
      }
   
   /**
    *Deposits money into the bank account.
    *@param amount the amount to deposit
    */
       public void deposit(double amount) 
      {  
         balance = balance + amount;
      }
   
   /**
    *Withdraws money from the bank account.
    *@param amount the amount to withdraw
    */ 
       public void withdraw(double amount) 
      {  
         balance = balance - amount;
      }
   
   /**
    *Gets the current balance of the bank account.
    *@return the current balance
    */
       public double getBalance()
      {  
         return balance; 
      }
   
   /**
    *Transfers money from the bank account to another account
    *@param amount the amount to transfer
    *@param other the other account
    */ 
       public void transfer(double amount, SampleBankAccount other)
      {  
         withdraw(amount);
         other.deposit(amount);
      }
   
}
