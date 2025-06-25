package LMS_Project.LMS_Class;

import java.util.Scanner;

public class CourseClass {
    // Course Data
    String courseTitle;
    byte courseDuration;
    String trainerName;

    public void courseInput(){

        Scanner sc = new Scanner(System.in);

        String continueInput = "yes";
        do{
        System.out.println("Enter Course Title: ");
        courseTitle = sc.nextLine();

        System.out.println("Enter Course Duration: ");
        courseDuration = sc.nextByte();

        System.out.println("Enter Trainer Name: ");
        trainerName = sc.nextLine();

        System.out.println("Do yo want to continue? (yes/no)");
        continueInput = sc.nextLine();

        } while (continueInput.equals("yes") || continueInput.equals("YES") || continueInput.equals("Yes"));
        sc.close();
    }
    
    public void displayCourseDetails(){
        System.out.println("Course title is: " +courseTitle);
        System.out.println("Course duration is: " +courseDuration);
        System.out.println("Trainer name is: " +trainerName);
    }
}
