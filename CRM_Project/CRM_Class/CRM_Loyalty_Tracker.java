package CRM_Project.CRM_Class;

public class CRM_Loyalty_Tracker {
    public static void main(String[] args) {
        CustomerModule customer = new CustomerModule();
        System.out.println(customer.customerModule());

        SalesPersonModule salesperson = new SalesPersonModule();
        salesperson.totalEarnings();
        salesperson.displayTotalEarnings();
    }
}
