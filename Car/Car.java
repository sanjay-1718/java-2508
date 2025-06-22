package Car;

import java.util.Scanner;

public class Car {
    // Data of a car
    String carBrand;
    String carModel;
    double carPrice;
    String carColor;
    double carOffers;

    // behaviours of short description of car
    public void displayCarInfoBanner(){
        System.out.println("Car Brand: " +carBrand);
        System.out.println("Car Model: " +carModel);
        System.out.println("Car Price: " +carPrice);
    }
    // behaviours of long description of car
    public void displayCarInfoPage(){
        System.out.println("Car Brand: " +carBrand);
        System.out.println("Car Model: " +carModel);
        System.out.println("Car Price: " +carPrice);
        System.out.println("Car Color: " +carColor);
        System.out.println("Car Offers: " +carOffers);

    }
    //EMI Calculation data
    int principleAmount;
    double annualIntrestRate;
    byte loanTenureYrs;
    int downPayment;


    public void displayCarEmi(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        principleAmount = sc.nextInt();

        System.out.println("Enter Annual Intrest Rate: ");
        annualIntrestRate = sc.nextDouble();

        System.out.println("Enter Loan Tenure Years: ");
        loanTenureYrs = sc.nextByte();

        System.out.println("Enter Down Payment: ");
        downPayment = sc.nextInt();

        double monthlyIntrestRate = (annualIntrestRate/12)/100;
        int totalMonths = loanTenureYrs*12;
        double emiIntrest = 1+monthlyIntrestRate;

        System.out.println("Down Payment is: " +downPayment);
        System.out.println("Total Loan amount is: " +principleAmount);

        double EMI = (principleAmount*monthlyIntrestRate*(Math.pow(emiIntrest, totalMonths)))/(Math.pow(emiIntrest, totalMonths)-1);
        System.out.println("EMI per month is: " +EMI);

        System.out.println("Total Payable amount is: " +(EMI*totalMonths));
    }
}

