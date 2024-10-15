package LabBook2;



class Account_1{
    double balance;

    public Account_1(double balance) {
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

    public boolean withdraw(double amount) {
		return false;
    	
    }
}

class SavingsAccount extends Account {
    final double minimumBalance;

    public SavingsAccount(double balance, double minimumBalance) {
        super(balance);
        this.minimumBalance = minimumBalance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of $" + minimumBalance + " must be maintained.");
        }
		return false;
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }
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

public class AccountMaintenance_Q2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 200);
        savings.withdraw(500); 
        savings.withdraw(900);  
        
        System.out.println();

        CurrentAccount current = new CurrentAccount(1000, 500);
        current.withdraw(1200);  
        current.withdraw(400);   
    }
}
