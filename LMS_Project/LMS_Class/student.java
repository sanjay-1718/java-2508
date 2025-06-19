package LMS_Project.LMS_Class;

public class student {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass();
        student1.studentName = "Mukthi";
        student1.studentAge = 21;
        student1.studentmobileNumber = 7589643126l;
        student1.courseEnrolled = "Java";

        student1.displayStudentDetails();
        System.out.println('\n');

        StudentClass student2 = new StudentClass();
        student2.studentName = "Akash";
        student2.studentAge = 22;
        student2.studentmobileNumber = 879642516l;
        student2.courseEnrolled = "JavaScript";

        student2.displayStudentDetails();
    }
}
