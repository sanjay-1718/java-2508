package CRM_Project;

public class CRM_conditionals {
    public static void main(String[] args) {
        int customerID = 105;
        String customerName = "Luke";
        boolean isPremium = true;
        int yrsPartnership = 3;
        String dealStage = "Negotiation";
        double dealValue = 60000;
        double discount = 0;
        double baseDiscount = 0;
        double extraDiscount = 0;

        if(isPremium){
            discount = 0.1;
        } 
        else if(!isPremium && yrsPartnership>=3){
            discount = 0.05;
        }
        else{
            discount = 0;
        }

        baseDiscount += discount;

        switch (dealStage) {
            case "Proposal":
                discount += 0.02;
                break;
            case "Negotiation":
                discount += 0.03;
                break;
            case "Closed":
                discount += 0.05;
            default:
                discount += 0;
        }

        extraDiscount = discount-baseDiscount;

        double discountedDeal = dealValue - (dealValue*discount);

        System.out.println("Customer Name is: "+customerName);
        System.out.println("Customer Id is: "+customerID);
        System.out.println("Base discount is "+baseDiscount*100 +" %");
        System.out.println("Extra discount is "+extraDiscount*100 +" %");
        System.out.println("Total discount is "+discount*100 +" %");
        System.out.println("Final Deal value is "+discountedDeal);
    }
}