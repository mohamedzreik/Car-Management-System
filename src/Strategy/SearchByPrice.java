package Strategy;
import models.Car;
import java.util.ArrayList;
import java.util.List;

public class SearchByPrice implements SearchStrategy {
    @Override
    public List<Car> search(List<Car> carList,String criteria) {
        double price = Double.parseDouble(criteria);
        System.out.println("Searching by Price: " + price);
        List<Car> resultCar=new ArrayList<>();
        for (Car car : carList) {
            if (car.getPrice() == price) {
                resultCar.add(car);
                System.out.println(car.toString());
            }
        }
        return resultCar;
    }
}
