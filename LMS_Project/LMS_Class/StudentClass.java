package LMS_Project.LMS_Class;

import java.util.Scanner;

public class StudentClass {
   // student attributes
    // ID, name, attendance, performance scores and trainer ratings
    int studentID;
    String studentName;
    int attendanceCredits;
    int performanceCredits;
    int finalCredits;
    int trainerRatings;
    int studentMobileNumber;
    int studentAge;
    
    // Using arrays 
    int [] subjectScores;

    public StudentClass(){

    }

    public StudentClass(int studentID, String studentName){
        this(101,"Sanjay",9999999,21);
    }

    // student complete details
    public StudentClass(int studentID, String studentName, int studentMobileNumber, int studentAge){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMobileNumber = studentMobileNumber;
        this.studentAge = studentAge;
    }


    // display student info
    public void studentInfo() {
        System.out.println("===============STUDENT DETAILS===============");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student NAME: "+studentName);
    }

    public void studentCompleteInfo() {
        System.out.println("===============STUDENT COMPLETE DETAILS===============");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student NAME: "+studentName);
        System.out.println("Student MOBILE NUMBER: "+studentMobileNumber);
        System.out.println("Student AGE: "+studentAge);
    }


    // Take Input
    Scanner sc = new Scanner(System.in);

    public int calAvgScore(){
        System.out.println("Enter no of Subjects: ");
        int numOfSubs = sc.nextInt();
        // initialization of array
        subjectScores = new int[numOfSubs];
        int totalScore = 0;
        for(int i=0; i<subjectScores.length; i++){
            System.out.println("Enter Score for subject: "+(i+1));
            subjectScores[i] = sc.nextInt();
            totalScore += subjectScores[i];
        }
        int avgScore = (totalScore)/subjectScores.length;
        return avgScore;
    }

    // calculate attendance credits based on sessions attended
    public int sessionsAttendedCredits(){
        System.out.println("Enter Number Of Sessions Attended");
        int noOfSessionsAttended = sc.nextInt();

        // condition
        if (noOfSessionsAttended >=30) {
            return attendanceCredits+=5;
        } else if (noOfSessionsAttended >=20) {
            return attendanceCredits+=3;
        } else {
            // return attendanceCredits+=0; // 1st
            return attendanceCredits=0;  // 2nd
        }
    }

    // calculate performance credits based on score 
    public int performanceScoreCredits(int avgScore){
        if (avgScore>=85) {
            return performanceCredits+=5;
        } else if(avgScore>=60){
            return performanceCredits+=3;
        } else {
            return performanceCredits+=0;
        }
    }

    // calculate final achievement credits
    public String achievementStatus(){
        int avgScore = calAvgScore();
        finalCredits = sessionsAttendedCredits() + performanceScoreCredits(avgScore);
        if (finalCredits>=10) {
            return "GOLD";
        } else if (finalCredits>=8) {
            return "SILVER";
        } else {
            return "You Need To IMPROVE";
        }
    }
    
    // trainer rating 
    int addBouns;
    public int trainerRatings(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Trainers Traing (1-5)");
        trainerRatings = sc.nextInt();
        if (trainerRatings==5) {
            return addBouns+=5000;
        } else {
            return addBouns+=0;
        }
    }
}
