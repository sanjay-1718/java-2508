package LMS_Project;

public class LMSconditionals {
    public static void main(String[] args) {
        int studentGrade = 10;
        double tuitionfee = 10000;
        double discount = 0;
        boolean isAcademicTopper = true;

        // check the discount 
        if(studentGrade>=9 && studentGrade<=12){
            if(isAcademicTopper){
                discount = 0.2;
            }
            else{
                discount = 0.1;
            }
        }
        else if(studentGrade>=6 && studentGrade<=8){
            discount = 0.05;
        }
        else{
            discount = 0;
        }

        switch (studentGrade) {
            case 10:
                discount += 0.03;
                break;
            case 12:
                discount += 0.05;
                break;
            default:
                discount += 0;
        }

        double discountedFee = tuitionfee - (tuitionfee*discount);

        System.out.println("Student Grade: "+studentGrade);
        System.out.println("Actual Tution Fee: "+tuitionfee);
        System.out.println("Total Discount Applied: "+(discount*100)+" %");
        System.out.println("Tution Fee To Pay After Discount: "+discountedFee);
    }
}
