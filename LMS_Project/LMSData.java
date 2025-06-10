package LMS_Project;

public class LMSData {
    public static void main(String[] args) {
        // Data for LMS student entity
        int studentID = 101;
        String studentName = "Sanjay";
        byte studentAge = 21;
        char studentGender = 'M';
        float studentRating = 4.6f;
        boolean isInstructor = false; // true
        String courseName = "Java";
        short courseID = 2508;

        System.out.println("Student ID is: " +studentID);
        System.out.println("Student name is: " +studentName);
        System.out.println("Student Age is: " +studentAge);
        System.out.println("Student Gender is: " +studentGender);
        System.out.println("Student Rating is: " +studentRating);
        System.out.println("Is instructor: " +isInstructor);
        System.out.println("Course name is: " +courseName);
        System.out.println("Course ID is: " +courseID);
        System.out.println('\n');

        // Data for LMS course entity
        courseID = 2508;
        courseName = "Java";
        String courseDescription = "Complete Java course";
        byte courseDuration = 6;
        String courseLevel = "Intermediate";
        float courseRating = 4.3f;
        int instructorID = 207;

        System.out.println("Course ID is: " +courseID);
        System.out.println("Course name is: " +courseName);
        System.out.println("Course description is: " +courseDescription);
        System.out.println("Course duration in months is: " +courseDuration);
        System.out.println("Course level is: " +courseLevel);
        System.out.println("Course Rating is : " +courseRating);
        System.out.println("Instructor ID is: " +instructorID);
        System.out.println('\n');

        // Data for LMS Trainer Entity
        instructorID = 207;
        String instructorName = "Ravi";
        byte instructorAge = 29;
        char instructorGender = 'M';
        float instructorRating = 4.5f;
        isInstructor = true;
        byte experienceYears = 9;
        String coursesTaught = "Java, Python, SQL";

        System.out.println("Instructor ID is: " +instructorID);
        System.out.println("Instructor name is: " +instructorName);
        System.out.println("Instructor Age is: " +instructorAge);
        System.out.println("Instructor Gender is: " +instructorGender);
        System.out.println("Instructor Rating is: " +instructorRating);
        System.out.println("Is instructor: " +isInstructor);
        System.out.println("Experience years are: " +experienceYears);
        System.out.println("Course taught are: " +coursesTaught);
        
    }
}