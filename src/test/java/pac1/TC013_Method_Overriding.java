package pac1;

class SwipeMachine{
	void readmethod() {
		System.out.println("method from Base Class");
	}
}
class Chipmachine extends SwipeMachine{
	void readmethod() {
		//super.readmethod();
		System.out.println("method from Derived Class");
	}
}
public class TC013_Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwipeMachine obj = new SwipeMachine();
		obj.readmethod();
		obj = new Chipmachine();
		obj.readmethod();	
	}
}
