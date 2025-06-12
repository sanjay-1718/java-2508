package LMS_Project;

public class LMSoperators {
    public static void main(String[] args) {
        int studentID = 105;
        String studentName = "Mark";
        byte studentAge = 21;
        double quizScore = 85;
        double assignmentScore = 90;
        double examScore = 93;
        float attendance = 80;

        //Calculate total score and average score
        double totalScore = (quizScore+assignmentScore+examScore);
        double averageScore = totalScore/3;

        // Is passed if avg score is > 85
        boolean isPassed = averageScore>=85;

        //Simulate attendance 
        attendance++;

        //qualified for award 
        // is attendance > 75 --> ok
        boolean isQualified = isPassed && attendance>=75;

        System.out.println("Student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+averageScore);
        System.out.println("Is passed: "+isPassed);

        System.out.println("Student Attendance after attending: "+attendance);
        System.out.println("Is qualified: "+isQualified);

    }
}

