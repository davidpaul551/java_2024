package pac1;
import java.util.Scanner;
import java.util.concurrent.atomic.*;
import pac1.TC007_Enum.Gender;
//1.6

//public class java_LabBook {
//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.4
		/*
		System.out.println("Personal Details");
		System.out.println("-------------------------------");
		System.out.println("First Name : Divya");
		System.out.println("Last Name : Bharathi");
		System.out.println("Gender : F");
		System.out.println("Age : 20");
		System.out.println("Weight : 85.55");
		*/
		
		
		//5
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Entered number is "+ n);
		if(n>0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is Negative");
		}
		*/
		
		//6

/*public class java_LabBook  {
		String firstName;
		String secondName;
		char gender;
		public String getFirstName() {
			return firstName;
		}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getSecondName() {
				return secondName;
			}

			public void setSecondName(String secondName) {
				this.secondName = secondName;
			}

			public char getGender() {
				return gender;
			}

			public void setGender(char gender) {
				this.gender = gender;
			}


			public java_LabBook(String firstName,String secondName, char gender) {
			this.firstName=firstName;
			this.secondName=secondName;
			this.gender=gender;
			
		}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				java_LabBook obj=new java_LabBook("David","Paul",'M');
				obj.setFirstName("David");
				System.out.println("First name : "+obj.getFirstName());
				obj.setSecondName("Paul");
				System.out.println("Second Name : "+obj.getSecondName());
				obj.setGender('M');
				System.out.println("Gender : "+obj.getGender());
				

			}

		}
		*/

//7
/*
public class java_LabBook {
    String firstName;
    String secondName;
    char gender;
    String phoneNumber; // Updated variable name for consistency

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Constructor to initialize all fields
    public java_LabBook(String firstName, String secondName, char gender, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
    	java_LabBook obj = new java_LabBook("David", "Paul", 'M', "7680835761");
        System.out.println("First name : " + obj.getFirstName());
        System.out.println("Second Name : " + obj.getSecondName());
        System.out.println("Gender : " + obj.getGender());
        System.out.println("Phone number: " + obj.getPhoneNumber());
    }
}
*/


//8
/*
public class java_LabBook  {
	String firstName;
	String secondName;
	Gender gender;
	public String getFirstName() {
		return firstName;
	}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSecondName() {
			return secondName;
		}

		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}

		public enum Gender{
			MALE, FEMALE;
		}
		public Gender getGender() {
	        return gender;
	    }

	    public void setGender(Gender gender) {
	        this.gender = gender;
	    }
	    
		public java_LabBook(String firstName,String secondName, Gender gender) {
		this.firstName=firstName;
		this.secondName=secondName;
		this.gender=gender;		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			java_LabBook obj=new java_LabBook("David","Paul",Gender.MALE);
			System.out.println("First name : "+obj.getFirstName());
			System.out.println("Second Name : "+obj.getSecondName());
			System.out.println("Gender : "+obj.getGender());	
			
		}
	}
	*/

//9

/*
public class java_LabBook {
	public Action(String Str1,int n) {
		switch(n) {
		case(1){
			return Str1+Str1;
		}
		case(2){
			for(int i = 0 ;i<Str1.length();i++) {
				if(i%2==1) {
					Str1.CharAt(i)=="#";
				}
				
			}
		}
		case(3){
			
		}
	}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String Str1 = sc.nextLine();
		
		System.out.println("Enter number between 1-4 : ");
		int n = sc.nextInt();
		String result=Action(n);
		System.out.println("Result : "+ result);
		
		
	}
	
}


*/

//10  POSITIVE STRING(ASCENDING ORDER ASCII VALUES)

/*
public class java_LabBook {
	
	public static boolean isPositiveString( String Str1) {
		
		for (int i=0 ;i<Str1.length()-1;i++) {
			if(Str1.charAt(i)>Str1.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String Str1 = sc.nextLine();
		Str1=Str1.toLowerCase();
		System.out.println("Entered string is : "+Str1);
		
		
		if(isPositiveString(Str1)) {
			System.out.println("String is positive");
		}else {
			System.out.println("String is Negative");	
		}
	}
}
*/


//INHREITANCE AND POLYMORPHISM

//1
class Person_1 {
    String Name;
    float age;
    
    public Person_1(String Name, float age) {
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
    Person_1 AccHolder;

    public Account(long accNum, double balance, Person_1 AccHolder) {
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
    
    public Person_1 getAccHolder() {
        return AccHolder;
    }
    public void setAccHolder(Person_1 AccHolder) {
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

public class java_LabBook {
    public static void main(String[] args) {
        // Smith's account
    	Person_1 smith = new Person_1("Smith", 30);
        Account smithAccount = new Account(12345, 2000, smith);
        System.out.println("Account holder: " + smith.getName());
        System.out.println("Account number: " + smithAccount.getAccNum());
        System.out.println("Account balance: $" + smithAccount.getBalance());
        
        // Deposit and withdraw for Smith
        smithAccount.deposit(500);   // Deposit $500 into Smith's account
        smithAccount.withDraw(300);  // Withdraw $300 from Smith's account

        System.out.println();

        // Kathy's account
        Person_1 kathy = new Person_1("Kathy", 24);
        Account kathyAccount = new Account(1234, 3000, kathy);
        System.out.println("Account holder: " + kathy.getName());
        System.out.println("Account number: " + kathyAccount.getAccNum());
        System.out.println("Account balance: $" + kathyAccount.getBalance());
        
        // Deposit and withdraw for Kathy
        kathyAccount.deposit(1000);  // Deposit $1000 into Kathy's account
        kathyAccount.withDraw(3500); // Try to withdraw $3500 (more than balance)
    }
}



























