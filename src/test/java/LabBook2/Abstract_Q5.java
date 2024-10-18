package LabBook2;



abstract class Account_2 {
 double balance;

 public Account_2(double balance) {
     this.balance = balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Successfully deposited $" + amount + ". New balance: $" + balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 //withdraw as abstract method
 public abstract boolean withdraw(double amount);
}

class SavingsAccount2 extends Account_1 {
  double minimumBalance;

 public SavingsAccount2(double balance, double minimumBalance) {
     super(balance);
     this.minimumBalance = minimumBalance;
 }

 @Override
 public boolean withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= minimumBalance) {
         balance -= amount;
         System.out.println("Successfully withdrew $" + amount + ". Remaining balance: $" + balance);
         return true;
     } else {
         System.out.println("Cannot withdraw. Minimum balance of $" + minimumBalance + " must be maintained.");
         return false;
     }
 }
}

class CurrentAccount2 extends Account_1 {
 double overdraftLimit;

 public CurrentAccount2(double balance, double overdraftLimit) {
     super(balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public boolean withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= -overdraftLimit) {
         balance -= amount;
         System.out.println("Successfully withdrew $" + amount + ". Remaining balance: $" + balance);
         return true;
     } else {
         System.out.println("Cannot withdraw. Overdraft limit of $" + overdraftLimit + " exceeded.");
         return false;
     }
 }
}

public class Abstract_Q5 {
 public static void main(String[] args) {
     SavingsAccount2 savings = new SavingsAccount2(1000, 200);
     savings.withdraw(500);  
     savings.withdraw(900);
     
     System.out.println();

     CurrentAccount2 current = new CurrentAccount2(1000, 500);
     current.withdraw(1200); 
     current.withdraw(400);   
 }
}
