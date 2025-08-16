package Strategy;

import models.Car;
import java.util.List;

public class CarSearchContext {
    private SearchStrategy strategy;

    public void setSearchStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void search(List<Car> carList,String criteria ) {
        strategy.search(carList, criteria);
    }
}
