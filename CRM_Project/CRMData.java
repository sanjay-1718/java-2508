package CRM_Project;
public class CRMData {
    public static void main(String[] args) {
        // Data for CRM Customer Entity
        int customerID = 238;
        String customerName = "Keshav";
        String customerEmail = "keshav123@gmail.com";
        long customerPhone = 6874592340l;
        String customerAddress = "Warangal";
        String customerType = "Business";
        String customerStatus = "Active";
        String registrationDate = "15-06-2025";

        System.out.println("Customer Id is: " +customerID);
        System.out.println("Customer Name is: " +customerName);
        System.out.println("Customer Email is: " +customerEmail);
        System.out.println("Customer Phone is: " +customerPhone);
        System.out.println("Customer Address is: " +customerAddress);
        System.out.println("Customer type is: " +customerType);
        System.out.println("Customer status is: " +customerStatus);
        System.out.println("Registration date is: " +registrationDate);
        System.out.println('\n');

        //Data for CRM Sales Lead Entity
        int leadID = 421;
        String leadName = "Mourya";
        String leadEmail = "mourya258@gmail.com";
        long leadPhone = 856974123l;
        String leadSourse = "Website";
        String leadStatus = "New";
        String creationDate = "01-03-2025";

        System.out.println("Lead Id is: " +leadID);
        System.out.println("Lead Name is: " +leadName);
        System.out.println("Lead Email is: " +leadEmail);
        System.out.println("Lead Phone is: " +leadPhone);
        System.out.println("Lead source is: " +leadSourse);
        System.out.println("Lead Status is: " +leadStatus);
        System.out.println("Lead was added on: " +creationDate);
        System.out.println('\n');

        // Data for CRM Interaction Entity
        int interactionID = 4567;
        customerID = 238;
        leadID = 421;
        String interactionType = "Email";
        String interactionDate = "25-06-2025";
        String interactionSummary = "Description of Interaction";
        boolean followupRequired = false;
        String followupDate = null;

        System.out.println("Interaction Id is: " +interactionID);
        System.out.println("Lead ID is: " +leadID);
        System.out.println("Customer ID is: " +customerID);
        System.out.println("Interaction type is: " +interactionType);
        System.out.println("Interaction date is: " +interactionDate);
        System.out.println("Interaction summary is: " +interactionSummary);
        System.out.println("Is followup Required: " +followupRequired);
        System.out.println("Follow up date: " +followupDate);
        System.out.println('\n');

        // Data for CRM Sales Opportunity Entity
        int opportunityID = 639;
        customerID = 238;
        String opportunityName = "Yearly Maintenance Deal";
        String opportunityStage = "Proposal Sent";
        int opportunityValue = 50000;
        String expectedCloseDate = "23-07-2025";
        String assignedTo = "EMP912";
        String createdDate = "23-06-2025";

        System.out.println("Opportunity Id is: " +opportunityID);
        System.out.println("Customer Id is: " +customerID);
        System.out.println("Opportunity name is: " +opportunityName);
        System.out.println("Opportunity stage is: " +opportunityStage);
        System.out.println("Opportunity value is: " +opportunityValue);
        System.out.println("Expected close date is: " +expectedCloseDate);
        System.out.println("Assigned to: " +assignedTo);
        System.out.println("Created date: " +createdDate);
        System.out.println('\n');

        // Data for CRM Support Ticket Entity 
        int tickeID = 4598;
        customerID = 238;
        String ticketSubject = "Cannot access dashboard";
        String ticketDescription = "Customer is unable to log in";
        String ticketStatus = "In Progress";
        String ticketPriority = "High";
        String TcreatedDate = "19-06-2025";
        String TresolvedDate = null;
        assignedTo = "EMP906";
        String channel = "Email";

        System.out.println("Ticket Id is: " +tickeID);
        System.out.println("Customer Id is: " +customerID);
        System.out.println("Ticket subjet is: " +ticketSubject);
        System.out.println("Ticket description is: " +ticketDescription);
        System.out.println("Ticket status is: " +ticketStatus);
        System.out.println("Ticket priority is: " +ticketPriority);
        System.out.println("Ticket created date is: " +TcreatedDate);
        System.out.println("Ticket resolved date is: " +TresolvedDate);
        System.out.println("Ticket assigned to: " +assignedTo);
        System.out.println("Channel is: " +channel);
    
    }
}