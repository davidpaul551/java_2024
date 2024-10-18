package pac1;

public class TC018_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str = null;
			str.equals("Hello");
			
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
			System.out.println(e.toString());

		}finally {
			System.out.println("Hi");
		}
		try {
			int a= 0;
			int b = 30/a;
			
		}catch(ArithmeticException e1) {
			System.out.println(e1.getMessage());
			System.out.println(e1.toString());
		}
		System.out.println("Hello");
		
		

	}

}
