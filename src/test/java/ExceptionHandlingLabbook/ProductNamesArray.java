package ExceptionHandlingLabbook;
import java.util.Scanner;
import java.util.Arrays;

public class ProductNamesArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of products: ");
        int n = sc.nextInt();
        sc.nextLine();  
        
        String[] products = new String[n];
        
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter Product name number " + (i + 1) + ":");
            products[i] = sc.nextLine();
        }
        
        Arrays.sort(products);
        
        System.out.println("Sorted Product items are:");
        for (String s : products) {
            System.out.println(s);
        }
        
        sc.close();
    }
}
