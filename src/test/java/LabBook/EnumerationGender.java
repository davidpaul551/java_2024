package LabBook;


public class EnumerationGender  {
	String firstName;
	String secondName;
	Gender gender;
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

		public enum Gender{
			MALE, FEMALE;
		}
		public Gender getGender() {
	        return gender;
	    }

	    public void setGender(Gender gender) {
	        this.gender = gender;
	    }
	    
		public EnumerationGender(String firstName,String secondName, Gender gender) {
		this.firstName=firstName;
		this.secondName=secondName;
		this.gender=gender;		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EnumerationGender obj=new EnumerationGender("David","Paul",Gender.MALE);
			System.out.println("First name : "+obj.getFirstName());
			System.out.println("Second Name : "+obj.getSecondName());
			System.out.println("Gender : "+obj.getGender());	
			
		}
	}