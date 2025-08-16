package Bridge;

public abstract class CarPurpose {




    protected double price;

    public CarPurpose(double price) {
        this.price = price;
    }


    public double getPrice(){
        return price;
    }


    public abstract void displayPurpose();
}

