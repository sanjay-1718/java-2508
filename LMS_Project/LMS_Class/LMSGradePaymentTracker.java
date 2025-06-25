package LMS_Project.LMS_Class;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
         StudentClass s1 = new StudentClass();
        s1.studentID=101;
        s1.studentName="Sanjay";

        s1.studentInfo();
        System.out.println(s1.sessionsAttendedCredits());

        System.out.println(s1.performanceScoreCredits(90));

        System.out.println(s1.achievementStatus());


        TrainerClass t1 = new TrainerClass();
        t1.trainerID = 101;
        t1.trainerName = "Ravi";

        t1.trainerInfo();
        
        System.out.println("Total Payment for Trainer: " +t1.totalPaymentForTrainer());

    }

}
