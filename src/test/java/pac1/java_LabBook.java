package pac1;
import java.util.Scanner;
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






























