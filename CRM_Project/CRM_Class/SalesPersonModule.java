package CRM_Project.CRM_Class;
import java.util.Scanner;
public class SalesPersonModule {
    String salesPersonName;
    int salesPersonId;
    int dealCount = 8;
    int totalPayment;
    
    int payment = dealCount*2500;
    int customerRating;

    Scanner sc = new Scanner(System.in);
    int bonus;
    public void totalEarnings(){
        CustomerModule c1 = new CustomerModule();
        bonus = c1.salesPersonRatings();
        totalPayment = payment+bonus;
    }
    public void displayTotalEarnings(){

        System.out.println("Deals Closed: " +dealCount);
        System.out.println("Bonus Amount is: " +bonus);
        System.out.println("Total Earnings are: " +totalPayment);
    }
}
