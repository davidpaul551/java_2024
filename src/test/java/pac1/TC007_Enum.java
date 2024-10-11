package pac1;

public class TC007_Enum {
	Gender gender;
	enum Gender{
		MALE, FEMALE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender obj= Gender.MALE;
		System.out.println("Gender : "+obj);
		

	}

}
