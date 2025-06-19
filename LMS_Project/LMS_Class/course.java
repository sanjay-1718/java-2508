package LMS_Project.LMS_Class;

public class course {
    public static void main(String[] args) {
        CourseClass course1 = new CourseClass();
        course1.courseTitle = "Java";
        course1.courseDuration = 5;
        course1.trainerName = "Ravi";

        course1.displayCourseDetails();
        System.out.println('\n');

        CourseClass course2 = new CourseClass();
        course2.courseTitle = "JavaScript";
        course2.courseDuration = 3;
        course2.trainerName = "Raju";

        course2.displayCourseDetails();

    }
}
