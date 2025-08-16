package Builder;

import models.Car;

public class Director {

    private CarBuilder builder;

    public Director(CarBuilder b){
        builder=b;
    }


    public Car constructSUV(String model , String year , String engineType , String color) {
        builder.setType("SUV");
        builder.setModel(model);
        builder.setYear(year);
        builder.setEngineType(engineType);
        builder.setColor(color);
        return builder.build();
    }

    public Car constructSport(String model , String year , String engineType , String color) {
        builder.setType("Sport");
        builder.setModel(model);
        builder.setYear(year);
        builder.setEngineType(engineType);
        builder.setColor(color);
        return builder.build();

    }

    public Car constructSedan(String model , String year , String engineType , String color) {
        builder.setType("Sedan");
        builder.setModel(model);
        builder.setYear(year);
        builder.setEngineType(engineType);
        builder.setColor(color);
        return builder.build();
    }



}

