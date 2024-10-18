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

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
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
    	Person smith = new Person("Smith", 30);
        Account smithAccount = new Account(12345);
        System.out.println("Account holder: " + smith.getName());
        System.out.println("Account number: " + smithAccount.getAccNum());
        System.out.println("Account balance: $" + smithAccount.getBalance());
        
        smithAccount.deposit(500);   
        smithAccount.withDraw(300);  

        System.out.println();

        Person kathy = new Person("Kathy", 24);
        Account kathyAccount = new Account(1234);
        System.out.println("Account holder: " + kathy.getName());
        System.out.println("Account number: " + kathyAccount.getAccNum());
        System.out.println("Account balance: $" + kathyAccount.getBalance());
        
        kathyAccount.deposit(1000);  
        kathyAccount.withDraw(3500); 
    }
}
