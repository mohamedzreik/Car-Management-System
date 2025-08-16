package Bridge;


public class SellingPurpose extends CarPurpose {
    public SellingPurpose(double price) {
        super(price);
    }

    @Override
    public void displayPurpose() {
        System.out.println("This car is for selling at $" + price);
    }

}

