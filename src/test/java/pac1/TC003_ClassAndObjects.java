package pac1;
class Box{
	 static double db_width=10;
	 static double db_height=30;
	 static double db_length=40;
	 int boxid;
	 public static double calcVolume() {
			double doutemp = 0;
			doutemp=db_width*db_height*db_length;
			System.out.println(doutemp);
			return doutemp;
		}	
}
public class TC003_ClassAndObjects {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b= new Box();
		b.calcVolume();
	}	
}
