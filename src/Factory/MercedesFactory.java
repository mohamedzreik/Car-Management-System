package Factory;


import models.Car;
import models.Mercedes;

public class MercedesFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}
