package ExceptionHandlingLabbook;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class ModifyPersonClass {
    String firstName;
    String Lastname;
    char gender;

    public ModifyPersonClass(String firstName, String Lastname, char gender) throws InvalidNameException {
        StringBuilder errorMessage = new StringBuilder();

        if (firstName == null || firstName.trim().isEmpty()) {
            errorMessage.append("Firstname can't be empty.\n");
        }

        if (Lastname == null || Lastname.trim().isEmpty()) {
            errorMessage.append("Lastname can't be empty.\n");
        }

        if (errorMessage.length() > 0) {
            throw new InvalidNameException(errorMessage.toString().trim());
        }

        this.firstName = firstName;
        this.Lastname = Lastname;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter First Name:");
            String firstName = sc.nextLine();
            System.out.println("Enter Last Name:");
            String lastName = sc.nextLine();
            System.out.println("Enter Gender:");
            char gender = sc.next().charAt(0);

            ModifyPersonClass obj = new ModifyPersonClass(firstName, lastName, gender);

            System.out.println("Person Details");
            System.out.println("First Name: " + obj.getFirstName());
            System.out.println("Last Name: " + obj.getLastname());
            System.out.println("Gender: " + obj.getGender());

        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
