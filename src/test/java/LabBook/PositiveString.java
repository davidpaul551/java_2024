package LabBook;
import java.util.Scanner;

 

public class PositiveString {
	
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