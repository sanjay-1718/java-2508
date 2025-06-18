package LMS_Project;
import java.util.Scanner;

public class LMS_gradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //id
        System.out.println('\n');
        System.out.println("Enter your Id: ");
        int studentId = scanner.nextInt();
        //name
        System.out.println("Enter your name");
        scanner.nextLine();
        String studentName = scanner.nextLine();

        double attendance = 0;
        int totalScore = 0;
        int subjects = 0;

        String continueInput = "yes";

        while (continueInput.equals("yes") || continueInput.equals("YES") || continueInput.equals("Yes")){
            System.out.println("Enter a subject score: " +(subjects+1));
            int currentScore = scanner.nextInt();
            subjects++;

            totalScore += currentScore;

            System.out.println("Do yo want to enter next subject score? (y/n)");
            scanner.nextLine();
            continueInput = scanner.nextLine();
        }
        double averageScore = (double)totalScore/subjects;
        String performance;
        if(averageScore>=85){
            performance = "Excellent";
        }
        else if(averageScore>=70){
            performance = "Good";
        }
        else if(averageScore>=50){
            performance = "Average";
        }
        else{
            performance = "Needs Improvement";
        }
        // conditional to check attendance 
        String attendanceStatus = (attendance<75) ? "Warning Low Attendance" : "Attendance is Ok";

        System.out.println("Your Name is: " +studentId);
        System.out.println("Your Student Id is: " +studentName);
        System.out.println("Total Score is: " +totalScore);
        System.out.println("Average Score is: " +averageScore);
        System.out.println("Your Performance: " +performance);
        System.out.println("Your Attendance: " +attendanceStatus);
    }
}