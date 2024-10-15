package pac1;
abstract class shape{
	abstract void draw();
	abstract void paint();
	
}
class rectangle extends shape{
	@Override
	void draw() {
		System.out.println("Reactangle");
	}
	@Override
	void paint() {
		System.out.println("painting");
	}
	
}
public class TC015_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape r1 = new rectangle();
		r1.draw();
		r1.paint();

	}

}
