package Concepts;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        //User name should have atleast 4 characters
        System.out.println("Enter User Name: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        //length method
        if(username.length() >= 4){
            System.out.println("Welcome " +username);
        } else {
            System.out.println("User Name must have atlest 4 characters " +username +" is Invalid");
        }

        //charAt() method
        System.out.println("Enter Gender");
        String gender = sc.nextLine();
        if (gender.charAt(0) == 'M' || gender.charAt(0) == 'm' || gender.charAt(0) == 'F' || gender.charAt(0) == 'f') {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        //To convert into lower case
        //toLowerCase() method
        System.out.println("Origina UserName: " +username);
        System.out.println("Formatted UserName: " +username.toLowerCase());

        //reset password functionality
        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        System.out.println("Re Enter Same Password");
        String passwordMatched = sc.nextLine();

        if (password.equals(passwordMatched)) {
            System.out.println("Password Changed Successfully");
        } else {
            System.out.println("Password Should Match, Retry");
        }
        // toUpperCase() method
        System.out.println("Enter PAN: ");
        String pan = sc.nextLine();
        System.out.println("Formatted PAN: " +pan.toUpperCase());

        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        if (email.contains("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
        // startsWith() {endsWith() also there}
        System.out.println("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();
        if(phoneNumber.startsWith("+1")){
            System.out.println("Call connected to USA");
        } else if(phoneNumber.startsWith("+91")){
            System.out.println("Call Connected to India");
        } else{
            System.out.println("Can only connect India,USA");
        }
    }
}
