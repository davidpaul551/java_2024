package LabBook;


public class PersonPhoneNumDetails {
    String firstName;
    String secondName;
    char gender;
    String phoneNumber; // Updated variable name for consistency

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

    // Constructor to initialize all fields
    public PersonPhoneNumDetails(String firstName, String secondName, char gender, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
    	PersonPhoneNumDetails obj = new PersonPhoneNumDetails("David", "Paul", 'M', "7680835761");
        System.out.println("First name : " + obj.getFirstName());
        System.out.println("Second Name : " + obj.getSecondName());
        System.out.println("Gender : " + obj.getGender());
        System.out.println("Phone number: " + obj.getPhoneNumber());
    }
}