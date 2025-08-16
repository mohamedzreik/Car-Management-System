package Strategy;
import models.Car;
import java.util.ArrayList;
import java.util.List;

public class SearchByBrand implements SearchStrategy {

    @Override
    public List<Car> search( List<Car> carList,String criteria) {

        System.out.println("Searching by Brand: " + criteria);
        List<Car> resultCar=new ArrayList<>();
        for (Car car : carList) {
            if (car.getBrand().equalsIgnoreCase(criteria)) {
                resultCar.add(car);
                System.out.println(car.toString());
            }
        }
        return resultCar;
    }
}