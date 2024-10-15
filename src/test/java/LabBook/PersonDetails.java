package LabBook;


public class PersonDetails {
	String firstName;
	String secondName;
	char gender;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}


public PersonDetails(String firstName,String secondName, char gender) {
	this.firstName=firstName;
	this.secondName=secondName;
	this.gender=gender;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails obj=new PersonDetails("David","Paul",'M');
		System.out.println("First name : "+obj.getFirstName());
		System.out.println("Second Name : "+obj.getSecondName());
		System.out.println("Gender : "+obj.getGender());
		

	}

}

