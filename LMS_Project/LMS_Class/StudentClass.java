package LMS_Project.LMS_Class;

public class StudentClass {
    //Student Data
    String studentName;
    long studentmobileNumber;
    byte studentAge;
    String courseEnrolled;

    public void displayStudentDetails(){
        System.out.println("Student name is: " +studentName);
        System.out.println("Student contact number is: " +studentmobileNumber);
        System.out.println("Student age is: " +studentAge);
        System.out.println("Course enrolled in: " +courseEnrolled);
        
    }
}
