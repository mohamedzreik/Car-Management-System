package models.models;

public class Audi extends Car {


    @Override
    public void displayDetails() {
        System.out.println("Brand: Audi"+", Model: " + model +", Type: "+type+ ", Color: " + color + ", Engine: " + engineType + ", year: " + getYear());

        if (getPurpose() != null) {
            getPurpose().displayPurpose();
            System.out.println("\n");
        }
    }

}
