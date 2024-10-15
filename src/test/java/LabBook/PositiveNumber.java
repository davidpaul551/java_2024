package LabBook;
import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Entered number is "+ n);
		if(n>0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is Negative");
		}

	}

}
