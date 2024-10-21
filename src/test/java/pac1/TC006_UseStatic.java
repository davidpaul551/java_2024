package pac1;

public class TC006_UseStatic {
	static int num1=3;
	static int num2;
	public static final int a=5;
	static {
		System.out.println("Static Block");
		num2=num1*3;
	}
	static void myMethod(int num3) {
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+ num2);
		System.out.println("Number3 : "+num3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod(500);

	}

}
