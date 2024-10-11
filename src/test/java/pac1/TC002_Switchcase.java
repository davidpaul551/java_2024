package pac1;

public class TC002_Switchcase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SWITCH CASE
		for(int i=0;i<=4;i++) {
			switch(i) {
			case 0:
				System.out.println("i is Zero");
				break;
			case 1:
				System.out.println("i is one");
				break;
			case 2:
				System.out.println("i is Two");
				break;
			case 3:
				System.out.println("i is Three");
				break;
			case 4:
				System.out.println("i is Four");
				break;
			}		
		}
		// DO-WHILE LOOP
		int j = 0;
		do {
			System.out.println("j value is "+j);
			j++;
		}while(j<0);
		
		
		// FOR LOOP
		for (int l=6;l>=1;l--) {
			System.out.println("l value is"+l);
		}
		
		
		
		
	}
}
