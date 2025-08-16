package Builder;

import models.Car;

public abstract class CarBuilder {
    protected Car car;

    public CarBuilder(Car car){
        this.car=car;
    }


    public abstract void setModel(String model);

    public abstract void setColor(String color) ;

    public abstract void setEngineType(String engineType);

    public abstract void setType(String type);

    public abstract void setYear(String year);


    public  Car build(){
        return car;
    }
}

