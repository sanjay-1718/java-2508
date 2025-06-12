package CRM_Project;

public class CRM_operators {
    public static void main(String[] args) {
        //Declare Variables
        int customerID = 213;
        String customerName = "Max";
        double totalPurchases = 15000.0;
        int interactionCount = 5;

        int leadID = 501;
        double leadBudget = 25000.0;
        boolean isContacted = true;

        double opportunityValue = 8000.0;
        boolean isClosed = false;

        //Average Purchase Value
        double averagePurchaseValue = totalPurchases/interactionCount;

        //Relational 
        boolean isHighValue = opportunityValue>5000;
        
        //Logical
        boolean priority = leadBudget>3000 && !isContacted;

        //Increment
        interactionCount++;

        //Results
        System.out.println("Customer Id is: " +customerID);
        System.out.println("Customer Name is: " +customerName);
        System.out.println("Average Purchase Value is: " +averagePurchaseValue);
        System.out.println("Sales opportunity has high value: " +isHighValue);
        System.out.println("Does Lead has high priority: " +priority);
        
        System.out.println("Interaction count after Interaction is: " +interactionCount);

    }
}
