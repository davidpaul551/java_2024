package pac1;

import java.io.FileNotFoundException;

public class TC019_throwDemo {
	
	void proc() {
		try {
			throw new FileNotFoundException("From Exception");
		}catch(FileNotFoundException e) {
			System.out.println("Caught inside the demo : ");
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TC019_throwDemo obj = new TC019_throwDemo();
		obj.proc();
		

	}

}
