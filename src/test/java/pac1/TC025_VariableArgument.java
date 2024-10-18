package pac1;

public class TC025_VariableArgument {
	void printdetails(String msg, int...numbers) {
		System.out.println(msg);
		for(int i : numbers) {
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC025_VariableArgument obj = new TC025_VariableArgument();
		obj.printdetails("hello", 500,600,100,300,400,445,2345);

	}

}
