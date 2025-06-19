package LMS_Project.LMS_Class;

public class TrainerClass {
    // Trainer Data
    String trainerName;
    byte experienceYrs;
    byte numOfCourses;

    public void displayTrainerDetails(){
        System.out.println("Trainer name is: " +trainerName);
        System.out.println("Experience years of trainer: " +experienceYrs);
        System.out.println("No of courses trainer teaches are: " +numOfCourses);
    }
}
