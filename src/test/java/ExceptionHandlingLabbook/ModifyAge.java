package ExceptionHandlingLabbook;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    String name;
    float age;

    public Person(String name, float age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age should be above 15.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }
}

public class ModifyAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the name of the first person:");
            String firstName = sc.nextLine();
            System.out.print("Enter the age of the first person:");
            float firstAge = sc.nextFloat();
            sc.nextLine(); 
            Person person1 = new Person(firstName, firstAge);
            sc.nextLine(); 
            System.out.println("Person Details:");
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());

            System.out.println();

            

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }  
    }
}
