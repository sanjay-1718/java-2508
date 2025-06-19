package LMS_Project.LMS_Class;

public class CourseClass {
    // Course Data
    String courseTitle;
    byte courseDuration;
    String trainerName;
    
    public void displayCourseDetails(){
        System.out.println("Course title is: " +courseTitle);
        System.out.println("Course duration is: " +courseDuration);
        System.out.println("Trainer name is: " +trainerName);
    }
}
