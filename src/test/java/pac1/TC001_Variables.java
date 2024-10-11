package pac1;


public class TC001_Variables {
	private static double db_width;
	private static double db_height;
	private static double db_length;
	
	public static int boxid;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcVolume();
		

	}
	public static double calcVolume() {
		double doutemp = 0;
		doutemp=db_width*db_height*db_length;
		System.out.println(doutemp);
		return doutemp;
	}
}
