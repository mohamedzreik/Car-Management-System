package Factory;

import models.Audi;
import models.Car;

public class AudiFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
