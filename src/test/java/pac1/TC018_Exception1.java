package pac1;

public class TC018_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int res = 10/0;
			
			int[] numbers = {1,2,3,4};
			System.out.println(numbers[5]);
			
			String str = null;
			System.out.println("length of string is : "+str.length());
			
		}catch(ArithmeticException e){
			System.out.println("Arithmetic error : "+e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array index error : "+ e1.getMessage());
			
		}
		catch(NullPointerException e2) {
			System.out.println("Null pointer exception :"+e2.getMessage());
		}
		catch(Exception e3) {
			System.out.println("Unexpected Error : "+e3.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}
