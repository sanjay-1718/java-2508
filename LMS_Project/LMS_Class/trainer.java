package LMS_Project.LMS_Class;

public class trainer {
    public static void main(String[] args) {
        TrainerClass trainer1 = new TrainerClass();
        trainer1.trainerName = "Ravi";
        trainer1.experienceYrs = 7;
        trainer1.numOfCourses = 3;

        trainer1.displayTrainerDetails();
        System.out.println('\n');

        TrainerClass trainer2 = new TrainerClass();
        trainer2.trainerName = "Raju";
        trainer2.experienceYrs = 6;
        trainer2.numOfCourses = 4;

        trainer2.displayTrainerDetails();
    }
}
