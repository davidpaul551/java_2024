package pac1;

import java.util.Scanner;

class AgeException extends Exception{
	private int age;
	AgeException(int a){
		age = a;
	}
	public String myage() {
		return age + " is an invalid age";
	}
	
	
	
}
class Employee{
	String name;
	int age;
	 void getdetails() throws AgeException {
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter your name : ");
		 name = sc.nextLine();
		 System.out.print("Enter your age : ");
		 age = sc.nextInt();
		 if(age<19) {
			 throw new AgeException(age);
		 }
		 
		 }
}
public class TC021_OwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee emp = new Employee();
			emp.getdetails();
			
		}catch(AgeException e) {
			System.out.println("Age Exception : "+e.myage());
	}

}
}
