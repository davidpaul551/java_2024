package pac1;
class BaseClass{
	public void BaseMethod(){
		System.out.println("From Base Method");
	}
	public void BaseMethod1(){
		System.out.println("From Base Method for super111");
	}	
}
class DerivedClass extends BaseClass {
	public void BaseMethod1(){
		System.out.println("From Base Method for super2222");
	}
	public void DerivedMethod(){
		System.out.println("From Derived Class");
		super.BaseMethod1();//IF same method , to call from parent class.
	}
	
}

public class TC011_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DerivedClass d = new DerivedClass();
		d.DerivedMethod();
		d.BaseMethod();
		
		if(d instanceof DerivedClass) {//Instanceof keyword
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
