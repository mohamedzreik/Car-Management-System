//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import models.*;
import Builder.*;
import Factory.*;
import Bridge.*;
import Strategy.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Factory Pattern
        List<Car> cars = new ArrayList<>();
        CarFactory bmwFactory = new BMWFactory();
        Car bmw1 = bmwFactory.createCar();
        cars.add(bmw1);
        Car bmw2 = bmwFactory.createCar();


        CarFactory audiFactory = new AudiFactory();
        Car audi1 = audiFactory.createCar();

        cars.add(audi1);
        CarFactory mercedesFactory = new MercedesFactory();
        Car mercedes1 = mercedesFactory.createCar();

        cars.add(mercedes1);

        // Builder and bridge Pattern
        SUVBuilder suvBuilder = new SUVBuilder(bmw1);
        Director director = new Director(suvBuilder);
        bmw1 = director.constructSUV("X6", "2023", "v8", "black");
        bmw1.setPurpose(new RentingPurpose(150));
        bmw1.displayDetails();

        SportBuilder sportBuilder = new SportBuilder(audi1);
        Director sportDirector1 = new Director(sportBuilder);
        audi1 = sportDirector1.constructSport("R8", "2025", "v12", "blue");
        audi1.setPurpose(new SellingPurpose(80000));
        audi1.displayDetails();

        SedanBuilder sedanBuilder = new SedanBuilder(mercedes1);
        Director sedanDirectory1 = new Director(sedanBuilder);
        audi1 = sedanDirectory1.constructSedan("Clk", "2025", "v6", "grey");
        audi1.setPurpose(new SellingPurpose(100000));
        audi1.displayDetails();



                List<Car> carList = new ArrayList<>();
                carList.add(new Car("Toyota", 25000, "Family", 2020));
                carList.add(new Car("Honda", 22000, "Sport", 2021));
                carList.add(new Car("BMW", 50000, "Luxury", 2019));
                carList.add(new Car("Toyota", 18000, "Family", 2018));

                CarSearchContext context = new CarSearchContext();

                context.setSearchStrategy(new SearchByBrand());
                context.search( carList,"Toyota");

                context.setSearchStrategy(new SearchByPrice());
                context.search(carList,"25000");

                context.setSearchStrategy(new SearchByPurpose());
                context.search(carList,"Family");

                context.setSearchStrategy(new SearchByYear());
                context.search(carList,"2020");
            }
        }


