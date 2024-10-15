package LabBook2;


class Person {
    String Name;
    float age;
    
    public Person(String Name, float age) {
        this.Name = Name;
        this.age = age;
    }
    
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public float getAge() {
        return age;
    }
    public void setAge(float age) {
        this.age = age;
    }
}

class Account {
    long accNum;
    double balance;
    Person AccHolder;

    public Account(double balance) {
        this.accNum = accNum;
        this.balance = balance;
        this.AccHolder = AccHolder;
    }
    
    public long getAccNum() {
        return accNum;
    }
    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }
    
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public Person getAccHolder() {
        return AccHolder;
    }
    public void setAccHolder(Person AccHolder) {
        this.AccHolder = AccHolder;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    // Method to withdraw money
    public void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + ". Remaining balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class PersonAccountQ1 {
    public static void main(String[] args) {
        // Smith's account
    	Person smith = new Person("Smith", 30);
        Account smithAccount = new Account(12345);
        System.out.println("Account holder: " + smith.getName());
        System.out.println("Account number: " + smithAccount.getAccNum());
        System.out.println("Account balance: $" + smithAccount.getBalance());
        
        // Deposit and withdraw for Smith
        smithAccount.deposit(500);   // Deposit $500 into Smith's account
        smithAccount.withDraw(300);  // Withdraw $300 from Smith's account

        System.out.println();

        // Kathy's account
        Person kathy = new Person("Kathy", 24);
        Account kathyAccount = new Account(1234);
        System.out.println("Account holder: " + kathy.getName());
        System.out.println("Account number: " + kathyAccount.getAccNum());
        System.out.println("Account balance: $" + kathyAccount.getBalance());
        
        // Deposit and withdraw for Kathy
        kathyAccount.deposit(1000);  // Deposit $1000 into Kathy's account
        kathyAccount.withDraw(3500); // Try to withdraw $3500 (more than balance)
    }
}
