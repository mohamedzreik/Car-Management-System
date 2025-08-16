package Bridge;

public class RentingPurpose extends CarPurpose{

    public RentingPurpose(double price) {
        super(price);
    }

    @Override
    public void displayPurpose() {
        System.out.println("This car is for Renting at $" + price + " by day.");
    }

}
