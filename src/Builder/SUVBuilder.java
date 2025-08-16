package Builder;

import models.Car;

public class SUVBuilder extends CarBuilder {

    public SUVBuilder(Car car) {
        super(car);
    }

    @Override
    public void setModel(String model) {
        car.model = model;
    }

    @Override
    public void setColor(String color) {
        car.color = color;
    }

    @Override
    public void setEngineType(String engineType) {
        car.engineType = engineType;
    }

    @Override
    public void setType(String type) {
        car.type=type;
    }

    @Override
    public void setYear(String year) {
        car.setYear(Integer.parseInt(year));
    }


}


