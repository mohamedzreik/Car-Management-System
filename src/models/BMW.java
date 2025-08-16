package models;



public class BMW extends Car {

    @Override
    public void displayDetails() {
        System.out.println("Brand: BMW"+", Model: " + model +", Type: "+type+ ", Color: " + color + ", Engine: " + engineType + ", year: " + getYear());

        if (getPurpose() != null) {
            getPurpose().displayPurpose();
            System.out.println("\n");
        }
    }
}

