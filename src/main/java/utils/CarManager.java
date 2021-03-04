package utils;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    GameManager gm = new GameManager();

    public void createCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i]));
        }
        gm.rData.setCars(cars);
    }

    public void moveCar() {

    }

    public boolean moveOrStay() {
        int random = RandomUtils.nextInt(0, 9);
        if (random >= 4) {
            return true;
        }
        return false;
    }

}
