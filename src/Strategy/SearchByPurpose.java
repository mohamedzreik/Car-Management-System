package Strategy;

import models.Car;
import java.util.ArrayList;
import java.util.List;

public class SearchByPurpose implements SearchStrategy {
    @Override
    public List<Car> search( List<Car> carList,String criteria) {
        System.out.println("Searching by Purpose: " + criteria);
        List<Car> resultCar=new ArrayList<>();
        for (Car car : carList) {
            if (car.getPurpose1().equalsIgnoreCase(criteria)) {
                resultCar.add(car);
                System.out.println(car.toString());
            }
        }
        return resultCar;
    }
}
