package Strategy;

import models.Car;
import java.util.ArrayList;
import java.util.List;

public class SearchByYear implements SearchStrategy {
    @Override
    public List<Car> search( List<Car> carList,String criteria) {
        int year = Integer.parseInt(criteria);
        System.out.println("Searching by Year: " + year);
        List<Car> resultCar=new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() == year) {
                resultCar.add(car);
                System.out.println(car.toString());
            }
        }
        return resultCar;
    }
}
