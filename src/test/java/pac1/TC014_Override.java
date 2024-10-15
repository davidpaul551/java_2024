package pac1;

class parent{
	void tv() {
		System.out.println("Parent tv");
	}
}
class child extends parent{
	@Override
	void tv() {
		System.out.println("child class");
	}	
}

public class TC014_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c = new child();
		c.tv();
	}
}
