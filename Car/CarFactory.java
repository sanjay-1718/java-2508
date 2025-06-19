package Car;

public class CarFactory {
    public static void main(String[] args) {
        Car mahindraCar = new Car(); // allocated memory to store mahindra car info
        mahindraCar.carBrand = "Mahindra";
        mahindraCar.carModel = "Thar";
        mahindraCar.carPrice = 17.86;
        mahindraCar.carColor = "Black";
        mahindraCar.carOffers = 7.5;
        System.out.println("=================== Mahindra Thar ====================");
        mahindraCar.displayCarInfoBanner();
        mahindraCar.displayCarInfoPage();

        // EMI calculation for Mahindra Thar
        Car emi = new Car();
        emi.principleAmount = 1607390;
        emi.annualIntrestRate = 9.8;
        emi.loanTenureYrs = 4;
        emi.downPayment = 179000;

        emi.displayCarEmi();
        

    }
}
