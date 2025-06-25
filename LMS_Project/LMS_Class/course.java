package LMS_Project.LMS_Class;

public class course {
    public static void main(String[] args) {
        CourseClass course1 = new CourseClass();
        course1.courseInput();
        course1.displayCourseDetails();
        System.out.println('\n');

        CourseClass course2 = new CourseClass();
        course2.courseInput();
        course2.displayCourseDetails();

    }
}
