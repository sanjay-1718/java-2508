package CRM_Project.CRM_Class;
import java.util.Scanner;
public class CustomerModule {
    int customerId;
    String customerName;
    int noOfInteractions;
    int loyaltyPoints;
    int dealValue;
    int salesPersonRatings;

    Scanner sc = new Scanner(System.in);

    public String customerModule(){

        System.out.println("Enter Customer Id: ");
        customerId = sc.nextInt();

        System.out.println("Enter Customer Name: ");
        sc.nextLine();
        customerName = sc.nextLine();

        System.out.println("Enter Number of Interactions: ");
        noOfInteractions = sc.nextInt();

        loyaltyPoints = noOfInteractions*2;

        System.out.println("Enter Deal Value: ");
        dealValue = sc.nextInt();

        if(dealValue>=50000){
            loyaltyPoints += 10;
        }
        else if(dealValue>=20000){
            loyaltyPoints += 5;
        }
        else{
            loyaltyPoints += 0;
        }
        
        if(loyaltyPoints>=20){
            return "PLATINUM";
        }
        else if(loyaltyPoints>=15){
            return "GOLD";
        }
        else if(loyaltyPoints>=10){
            return "SILVER";
        }
        else{
            return "Needs More Engagement";
        }
    }

    int bonus;
    public int salesPersonRatings(){
        System.out.println("Enter Sales Person Rating (1-5)");
        salesPersonRatings = sc.nextInt();
        if (salesPersonRatings==5 || salesPersonRatings == 4) {
            return bonus=2000;
        } else {
            return bonus=0;
        }
    }
    
}
