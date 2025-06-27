package Concepts;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        // Input from User
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = input.nextLine();

        System.out.println("Enter your Id: ");
        int id = input.nextInt();

        System.out.println("Hi " +name +" your Id is " +id);

        System.out.println("Work Completed stop taking Input");
        input.close(); // Closing the input
    }
}
