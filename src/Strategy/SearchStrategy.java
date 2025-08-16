package Strategy;


import models.Car;

import java.util.List;

public interface SearchStrategy {
    List<Car> search(List<Car> cars, String criteria);
}
