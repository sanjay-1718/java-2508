package LMS_Project.LMS_Class;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass(101, "Sanjay");
        
        StudentClass s2 = new StudentClass(101,"Sanjay", 9999999, 21);

        s1.studentInfo();
        s2.studentCompleteInfo();
       // System.out.println(s1.sessionsAttendedCredits());

        //System.out.println(s1.performanceScoreCredits(90));

        System.out.println(s1.achievementStatus());


        TrainerClass t1 = new TrainerClass(101,"Ravi");

        t1.trainerInfo();
        System.out.println("Total Payment for Trainer: " +t1.totalPaymentForTrainer());

    }

}
