package pac1;
public class TC012_Method_Overloading {
	
	TC012_Method_Overloading(){
		System.out.println("Constructor Without parameter");
		
	}
	TC012_Method_Overloading(int value){
		System.out.println("With parametr : "+ value);
	}
	TC012_Method_Overloading(int value, int value1){
		System.out.println("With parametr : "+ (value+value1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC012_Method_Overloading obj = new TC012_Method_Overloading();
		TC012_Method_Overloading obj1 = new TC012_Method_Overloading(500);
		TC012_Method_Overloading obj2 = new TC012_Method_Overloading(500,1234);
	}
}
