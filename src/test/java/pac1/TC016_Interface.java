package pac1;


interface SimpleCalc{
	int add(int a, int b);
	int i=10;
	
}
class calc implements SimpleCalc{
	public int add(int a , int b) {
		return a + b;
	}
}
public class TC016_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c = new calc();
		System.out.println("addition :"+c.add(10, 10) );

	}

}
