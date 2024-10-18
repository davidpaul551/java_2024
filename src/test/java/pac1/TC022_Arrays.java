package pac1;

	class TC022_Arrays{
		int Number[];
		TC022_Arrays(int i){
			Number = new int[i];
			
		}
		void populateArray() {
			for(int i = 0; i<Number.length;i++) {
				Number[i]=i;	
			}
		}
		void displayContent() {
			for(int i =0; i<Number.length;i++) {
				System.out.println("Number"+i+":"+Number[i]);
				
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC022_Arrays AD = new TC022_Arrays(5);
		AD.displayContent();
		AD.populateArray();
		AD.displayContent();
	}

}
