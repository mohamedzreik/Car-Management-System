package Factory;

import models.BMW;
import models.Car;

public class BMWFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new BMW( );
    }
}
