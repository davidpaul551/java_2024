package pac1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TC020_throwsDemo {
	static void fileopen() throws FileNotFoundException{
		System.out.println("Inside method");
		FileReader fd = new FileReader("text123.txt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fileopen();
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
