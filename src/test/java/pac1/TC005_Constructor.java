package pac1;

public class TC005_Constructor {
	int xCord;
	int yCord;
	
	
	TC005_Constructor(int a, int b){
		this.xCord=a;
		this.yCord=b;
		
	}
	public void add() {
		System.out.println("Addition : "+(xCord+yCord));
	}

}
